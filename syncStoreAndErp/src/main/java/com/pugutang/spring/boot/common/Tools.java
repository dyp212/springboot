package com.pugutang.spring.boot.common;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.pugutang.spring.boot.dao.newDao.SerialConfigMapper;
import com.pugutang.spring.boot.entity.SerialConfig;
import com.pugutang.spring.boot.entity.SerialConfigExample;

public class Tools {
	@Autowired
	private static SerialConfigMapper serialConfigMapper;
	
	public static final String OUTBOUND_CODE = "outbound";
	
	public static final String MQ_CLIENT = "client1";
	
	public static final String MQ_OUTBOUND_CODE_CANCEL = "outbound_cancel";
	
	public static final String MQ_OUTBOUND_CODE_CONFIRM = "outbound_confirm";
	
	public static final String MQ_OUTBOUND_CODE_PAY = "outbound_pay";
	
	public static final String MQ_OUTBOUND_CODE_REFUSE = "inboud_refuse";
	
	
	/**获取编码
	 * @param codeType
	 * @throws Exception
	 */
	public static  String getSerialCode(String codeType) throws Exception {
		if(StringUtils.isNotEmpty(codeType)) {
			SerialConfigExample exam = new SerialConfigExample();
			SerialConfigExample.Criteria creitia = exam.createCriteria();
			creitia.andTypeCodeEqualTo(codeType);
			List<SerialConfig> list =  serialConfigMapper.selectByExample(exam);
				String code_prefix = list.get(0).getCodePrefix();
				Integer code_length = list.get(0).getCodeLength();
				Integer latest_no = list.get(0).getLatestNo() + 1;
				if(StringUtils.isNotEmpty(code_prefix) && code_length != null && latest_no != null) {
					String code = "";
					code += code_prefix;
					int count = latest_no.toString().length();
					if(count <= code_length) {
					    for(int i=0;i<code_length-count;i++) {
					    	code += "0";
					    }
					    code += latest_no.toString();
					    UpSerialCode(codeType,latest_no);
						return code;
					}
				}
		}
		return null;
	}
	
	/*
	 * function:更新
	 */
	public static String UpSerialCode(String codeType,Integer latest_no) throws Exception {
		int rows = serialConfigMapper.updateBySome(latest_no, codeType);
		return null;
	}
}
