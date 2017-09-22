package com.pugutang.spring.boot.web;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pugutang.backend.mq.utils.Callback;
import com.pugutang.spring.boot.service.StoreService;

@Component
public class CancelTaskCallback implements Callback {

	private final Logger logger = Logger.getLogger(CancelTaskCallback.class);
	@Autowired
	private StoreService storeService;
	
	@Override
	public void execute(Serializable arg0) throws Exception {
		if(null != arg0) {
			try {
				String purchaseCode = (String)arg0;
				int rst = storeService.cancelOrder(purchaseCode);
				logger.info("CancelTaskCallback purchaseCode="+purchaseCode+"  execute rst="+rst);
				if(rst <= 0) {
					logger.error("CancelTaskCallback purchaseCode="+purchaseCode+" 执行失败，请处理！");
					//throw new RuntimeException();
				}
			} catch (Exception e) {
				logger.error("CancelTaskCallback purchaseCode="+arg0+" 执行异常，请处理！", e);
			}
		}else {
			logger.info("CancelTaskCallback 没有数据从队列中取出");
		}
	}

}
