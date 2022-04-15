package com.mono;

import reactor.core.publisher.Mono;

/**
 * @author wendongchao
 * @ClassName MonoDemo02
 * @Date 2022/4/15 15:45
 */
public class MonoDemo02 {
    public static void main(String[] args) {
        // Mono 创建后，有订阅就消费，没有就不消费
        Mono data = Mono.just("bole");
        Mono noData = Mono.empty();
        data.subscribe(i -> System.out.println(i));
    }
}
