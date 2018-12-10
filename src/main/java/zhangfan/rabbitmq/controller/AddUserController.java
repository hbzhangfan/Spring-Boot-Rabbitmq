package zhangfan.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import zhangfan.rabbitmq.sender.MessageSender;

/**
 * @author zhangfan
 * @date 2018年12月9日
 */
@RestController
public class AddUserController {
	
	@Autowired
	private MessageSender messageSender;
	
	@GetMapping("/adduser")
	public void send(String telphone) {
		System.out.println("注册用户成功");
		messageSender.send(telphone);
	}
}
