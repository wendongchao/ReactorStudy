package com.flux.message;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 消息处理
 * 　　当需要处理Flux或Mono中的消息时，可以通过subscribe方法来添加相应的订阅逻辑。
 * @author wendongchao
 * @ClassName FluxMessage01
 * @Date 2022/4/15 17:32
 */
public class FluxMessage01 {
    public static void main(String[] args) {
        // 在调用subscribe方法时可以指定需要处理的消息类型。
//        Flux.just(1, 2).concatWith(Mono.error(new IllegalStateException())).subscribe(System.out::println, System.err::println);
//        Flux.just(1, 2).concatWith(Mono.error(new IllegalStateException())).onErrorReturn(0).subscribe(System.out::println);

        // 第2种可以通过switchOnError()方法来使用另外的流来产生元素。
//        Flux.just(1, 2).concatWith(Mono.error(new IllegalStateException())).retry(Mono.just(0)).subscribe(System.out::println);

//        Flux.just(1, 0).map(x -> 1/x).checkpoint("test").subscribe(System.out::println);

        Flux.range(1, 2).log("Range").subscribe(System.out::println);
    }
}
