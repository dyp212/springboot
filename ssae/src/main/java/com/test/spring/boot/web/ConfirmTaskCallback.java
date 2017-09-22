package com.test.spring.boot.web;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pugutang.backend.mq.utils.Callback;
import com.test.spring.boot.service.StoreService;

public class ConfirmTaskCallback implements Callback {

	private final Logger logger = Logger.getLogger(CancelTaskCallback.class);
	@Autowired
	private StoreService storeService;
	
	@Override
	public void execute(Serializable arg0) throws Exception {
		if(null != arg0) {
			try {
				String purchaseCode = (String)arg0;
				int rst = storeService.confirmDelivery(purchaseCode);
				logger.info("ConfirmTaskCallback purchaseCode="+purchaseCode+"  execute rst="+rst);
				if(rst <= 0) {
					logger.error("ConfirmTaskCallback purchaseCode="+purchaseCode+" 执行失败，请处理！");
				}
			} catch (Exception e) {
				logger.error("ConfirmTaskCallback purchaseCode="+arg0+" 执行异常，请处理！", e);
			}
		}else {
			logger.info("ConfirmTaskCallback 没有数据从队列中取出");
		}
	}

}
