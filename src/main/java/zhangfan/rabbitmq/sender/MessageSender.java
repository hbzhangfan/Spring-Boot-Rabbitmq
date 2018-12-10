package zhangfan.rabbitmq.sender;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 短信 消息发送 生产者
 * 
 * @author zhangfan
 * @date 2018年12月9日
 */
@Slf4j
@Component
public class MessageSender {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void send(Object message) {
		
		CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
		/**
		 * RabbitMqConfig.EXCHANGE 指定消息交换机 RabbitMqConfig.ROUTINGKEY2 指定队列key2
		 * ROUTINGKEY2 路由键
		 * Direct：direct 类型的行为是"先匹配, 再投送". 即在绑定时设定一个 routing_key, 消息的routing_key 匹配时, 才会被交换器投送到绑定的队列中去.
		 */
		rabbitTemplate.convertAndSend("exchangeTest", "message_key", message, correlationId);
		System.out.println("发送短信消息到交换机");
	}
}
