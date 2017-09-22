package com.pugutang.spring.boot.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pugutang.spring.boot.domain.ApiCode;
import com.pugutang.spring.boot.domain.ApiCodeUtils;
import com.pugutang.spring.boot.service.GoodsService;

@RequestMapping("goods")
@RestController
public class GoodsController {

	protected static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

	@Autowired
	private GoodsService goodsService;

	static int isRunning = 0;
	static String logMsg = "";

	@RequestMapping("/putgoods")
	@ResponseBody
	public Object rundata(HttpServletRequest request) {

		try {
			Map pdShop=getMap(request);
			if(pdShop.size()==0) {
				return ApiCodeUtils.cloneApiCode(404);
			}
			goodsService.refesehGoods(pdShop);
			ApiCode apiCode = new ApiCode();
			apiCode.setCode(0);
			apiCode.setMsg("success");
			return apiCode;

		} catch (Exception exception) {
			logger.error("ExecuteTimer error:", exception);
			return ApiCodeUtils.cloneApiCode(404);
		}
	}
	public Map getMap(HttpServletRequest request) {
		
		Map properties = request.getParameterMap();
		Map returnMap = new HashMap();
		Iterator entries = properties.entrySet().iterator();
		Map.Entry entry;
		String name = "";
		String value = "";
		while (entries.hasNext()) {
			entry = (Map.Entry) entries.next();
			name = (String) entry.getKey();
			Object valueObj = entry.getValue();
			if (null == valueObj) {
				value = "";
			} else if (valueObj instanceof String[]) {
				String[] values = (String[]) valueObj;
				for (int i = 0; i < values.length; i++) {
					value = values[i] + ",";
				}
				value = value.substring(0, value.length() - 1);
			} else {
				value = valueObj.toString();
			}
			returnMap.put(name, value);
		}
		return returnMap;
	}
	private String getBlankString(String strOld) {
		if (strOld == null) {
			return "";
		} else {
			return strOld.trim();
		}
	}

	private String getNullString(String strOld) {
		if (strOld == null) {
			return null;
		} else {
			if (strOld.trim().length() == 0) {
				return null;
			} else {
				return strOld.trim();
			}
		}
	}
}
