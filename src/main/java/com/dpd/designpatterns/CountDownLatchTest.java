package com.dpd.designpatterns;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 这是一个模拟瞬间高并发的类
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService service = Executors.newCachedThreadPool();
        //
        final CountDownLatch commander = new CountDownLatch(1);
        //
        final CountDownLatch soldier = new CountDownLatch(1000);
        //发送请求
        final RestTemplate restTemplate = new RestTemplate();
        AtomicReference<Integer> count = new AtomicReference<>(0);
        for (int i = 0 ; i<1000 ; i++){
            Runnable runnable = () -> {
                try{
                    System.out.println("线程" + Thread.currentThread().getName() +
                    "正在准备接收命令");
                    commander.await();//这边是让士兵等待所有的命令
                    System.out.println("线程" + Thread.currentThread().getName() +
                    "已接收命令");
                    HttpHeaders httpHeaders = new HttpHeaders();
                    httpHeaders.add("app_token","eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbGljZS5iYWVyQGxpdmUuY29tIn0.j3mD11T-usrXZk_SLLBadPDKu569sCr9iYv_If0TYaH6GydrVuaCWxg710U9nqiS80KOiA7VSAZoF_tgNcJ4CA");
                    HttpEntity<String> requestEntity = new HttpEntity<>(null, httpHeaders);
                    ResponseEntity responseEntity = restTemplate.exchange("http://localhost:8080/sst/api/cart/getCartShippingDetailInfo.json?cartItemIds=1002328,10023284&shippingAddressId=",HttpMethod.GET,requestEntity,JSONObject.class);
                    Thread.sleep((long) (Math.random() * 5000));
                    System.out.println("线程"+ Thread.currentThread().getName() +
                    "回应命令处理结果" + responseEntity);
                    count.getAndSet(count.get() + 1);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    soldier.countDown();
                }
            };
            service.execute(runnable);
        }
        try {
            Thread.sleep((long)(Math.random()*20000));
            System.out.println("线程" + Thread.currentThread().getName() +
            "即将发布命令");
            commander.countDown();
            System.out.println("线程" + Thread.currentThread().getName() +
            "已发送命令，正在等待结果");
            soldier.await();
            System.out.println("线程" + Thread.currentThread().getName() +
            "已收到所有的响应结果");
            System.out.println(count.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        service.shutdown();
    }
}
