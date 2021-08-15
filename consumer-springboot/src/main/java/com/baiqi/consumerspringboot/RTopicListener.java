package com.baiqi.consumerspringboot;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RTopicListener {
    @RabbitListener(queues = "boot_queue")
    public void ListenerQueue(Message message){
        System.out.println("message "+message);
    }
}
