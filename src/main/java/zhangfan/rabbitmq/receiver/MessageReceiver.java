package zhangfan.rabbitmq.receiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 短信发送 订阅者
 * 
 * @author zhangfan
 * @date 2018年12月9日
 */
@Component
public class MessageReceiver {
	
	/**
     * queues  指定从哪个队列（queue）订阅消息
     * @param message
     */
    @RabbitListener(queues = {"messageQueue"})
    public void handleMessage(Message message){
    	
    	System.out.println("发送短信给用户成功..");
    }
	
}
