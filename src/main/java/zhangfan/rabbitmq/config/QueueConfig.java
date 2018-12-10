package zhangfan.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 队列配置  可以配置多个队列
 * @author zhangfan
 * @date 2018年12月9日
 */
@Configuration
public class QueueConfig {
	
	/**
         durable="true" 持久化 rabbitmq重启的时候不需要创建新的队列
         auto-delete 表示消息队列没有在使用时将被自动删除 默认是false
         exclusive  表示该消息队列是否只在当前connection生效,默认是false
	 */
	@Bean
    public Queue messageQueue() {
        return new Queue("messageQueue",true,false,false);
    }
}
