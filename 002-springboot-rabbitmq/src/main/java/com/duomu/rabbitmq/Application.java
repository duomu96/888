package com.duomu.rabbitmq;

import com.duomu.rabbitmq.service.SendServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);
		SendServer sendServer = (SendServer) ac.getBean("111sendService");
		sendServer.sendTopicMessage("111213131准12312备睡觉Q！11！1！！");
		sendServer.sendTopicMessage("111准备23121312睡觉Q！！！！");
	}

}
