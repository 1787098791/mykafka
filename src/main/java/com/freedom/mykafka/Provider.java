package com.freedom.mykafka;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wujie
 * @date ：Created in 2019/9/1 17:00
 * @description：消息提供者
 * @version: 1.0.0
 */
@RestController
@SuppressWarnings("all")
public class Provider {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * @Description:发送消息到"test_kafka"主题
     * @Param: []
     * @returns: java.lang.Object
     * @Author: wujie
     * @Date: 2019/9/1 17:10
     */
    @RequestMapping("/mykafka")
    public Object testKafka(){
        Message message = new Message(1, "邬杰", 22);
        //对象序列化为json字符串
        String json = JSONObject.toJSONString(message);
        kafkaTemplate.send("test_kafka",json);

        return "OK";
    }
}
