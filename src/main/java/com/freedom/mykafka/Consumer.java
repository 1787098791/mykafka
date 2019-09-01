package com.freedom.mykafka;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author ：wujie
 * @date ：Created in 2019/9/1 17:01
 * @description：消息消费者
 * @version: 1.0.0
 */
@Service
public class Consumer {
    /**
     * @Description:接收消息
     * @Param: [json_message]
     * @returns: void
     * @Author: wujie
     * @Date: 2019/9/1 17:46
     */
    @KafkaListener(topics = {"test_kafka"})
        public void receiveMessage(String json_message){
        //json转化为对象
        Message message = JSONObject.parseObject(json_message, Message.class);
        System.out.println(message);
    }
}
