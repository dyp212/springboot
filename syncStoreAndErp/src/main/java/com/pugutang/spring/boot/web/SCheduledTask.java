package com.pugutang.spring.boot.web;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.pugutang.backend.mq.utils.MQUtils;
import com.pugutang.spring.boot.common.Tools;

@Component
public class SCheduledTask {

	@Scheduled(cron="0 0/5 * * * ?")
	public void task1() {
		System.out.println("in");
		CancelTaskCallback callback = new CancelTaskCallback();
		MQUtils.receiveMessage(Tools.MQ_CLIENT, Tools.MQ_OUTBOUND_CODE_CANCEL, callback);
	}
	
	@Scheduled(cron="0 0/5 * * * ?")
	public void task2() {
		System.out.println("2");
		ConfirmTaskCallback callback = new ConfirmTaskCallback();
		MQUtils.receiveMessage(Tools.MQ_CLIENT, Tools.MQ_OUTBOUND_CODE_CANCEL, callback);
	}
}
