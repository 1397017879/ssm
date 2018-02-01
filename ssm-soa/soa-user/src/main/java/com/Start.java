package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ZYF_JOKER on 2018/1/20.
 */
public class Start {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        (new ClassPathXmlApplicationContext(new String[] { "classpath:dubbo-provider.xml" })).start();
        // 保持main方法不退出
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }
}
