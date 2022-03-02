package cj.springboot.redis.test03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class GoodsController {

    private static Integer cj_account = 100;
    private static Integer cj_num = 0;

    private Lock lock00 = new ReentrantLock();

    @GetMapping(value = "/buy")
    public void testBuy() {
        Object lock1 = new Object();
        synchronized (lock1) {
            if (cj_account <= 0) {
//            System.out.println("已经买完");
            } else {
                cj_account--;
                System.out.println("还剩 ： " + cj_account);
            }
        }
    }

    @GetMapping(value = "/buy2")
    public void testBuy2() {
        if (cj_account <= 0) {
//            System.out.println("已经买完");
        } else {
            cj_account--;
            System.out.println("还剩 ： " + cj_account);
        }
    }

    @GetMapping(value = "/buy3")
    public void testBuy3() {
        lock00.lock();
        if (cj_account <= 0) {
        } else {
            cj_account--;
            System.out.println("还剩 ： " + cj_account);
        }
        lock00.unlock();
    }



}
