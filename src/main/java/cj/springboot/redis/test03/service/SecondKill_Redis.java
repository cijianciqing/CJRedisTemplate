package cj.springboot.redis.test03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SecondKill_Redis {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    //秒杀过程
    public   boolean doSecKill(String uid,String prodid){
        /*
        * 1 uid和prodid非空判断
        * uid: 用户id
        * prodid: 产品id
        * */
        if(uid == null || prodid == null) {
            return false;
        }
        //3 拼接key
        // 3.1 库存key
        String kcKey = "sk:"+prodid+":qt";
        // 3.2 秒杀成功用户key
        String userKey = "sk:"+prodid+":user";

        //4 获取库存，如果库存null，秒杀还没有开始
        String kc = (String) redisTemplate.opsForValue().get(kcKey);
        if(kc == null) {
            System.out.println("秒杀还没有开始，请等待");
            return false;
        }
        // 5 判断用户是否重复秒杀操作
        if(jedis.sismember(userKey, uid)) {
            System.out.println("已经秒杀成功了，不能重复秒杀");
            jedis.close();
            return false;
        }

        //6 判断如果商品数量，库存数量小于1，秒杀结束
        if(Integer.parseInt(kc)<=0) {
            System.out.println("秒杀已经结束了");
            jedis.close();
            return false;
        }

        //7 秒杀过程
        //使用事务
        redisTemplate.multi();




        return false;
    }
}
