package cj.springboot.redis.test03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Test03ApplicationTests {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
//    stringRedisTemplate.g
//        ValueOperations<String, String> ss = redisTemplate.opsForValue();
//        String k2 = ss.get("k2");
//        System.out.println(k2);

    }

}
