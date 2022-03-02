package cj.springboot.redis.test03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Test03Application {

    public static void main(String[] args) {
        SpringApplication.run(Test03Application.class, args);
//        SpringApplication springApplication = new SpringApplication(Test03Application.class);
//        ConfigurableApplicationContext context = springApplication.run(args);
//
//        RedisTemplate re = (RedisTemplate) context.getBean("redisTemplate");
//
//        System.out.println(re.getClass().getName());
//        System.out.println(re.getConnectionFactory().getClass().getName());


    }

}
