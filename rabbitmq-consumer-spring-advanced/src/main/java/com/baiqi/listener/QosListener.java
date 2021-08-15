package com.baiqi.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @author 白起老师
 */
@Component
public class QosListener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {

          //获取到的消息
        System.out.println(new String(message.getBody()));

        Thread.sleep(1000);

        //处理业务逻辑

        //进行消息的签收
        //channel.basicAck(message.getMessageProperties().getDeliveryTag(),true);

    }
}
