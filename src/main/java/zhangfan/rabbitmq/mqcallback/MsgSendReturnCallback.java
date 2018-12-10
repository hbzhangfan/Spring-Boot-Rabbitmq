package zhangfan.rabbitmq.mqcallback;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * 类描述
 * 
 * @author zhangfan
 * @date 2018年12月9日
 */
public class MsgSendReturnCallback implements RabbitTemplate.ReturnCallback{

	@Override
	public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
		System.out.println("回馈消息："+message);
	}

}
