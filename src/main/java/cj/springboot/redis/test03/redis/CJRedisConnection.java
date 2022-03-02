package cj.springboot.redis.test03.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CJRedisConnection {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @RequestMapping(value = "/redis-test01")
    public void test01(){
//        redisTemplate.

    }
}
