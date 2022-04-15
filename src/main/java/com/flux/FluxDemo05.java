package com.flux;

import reactor.core.publisher.Flux;

/**
 * 复杂创建方法create
 * create()方法与generate()方法的不同之处在于所使用的是FluxSink对象。
 * FluxSink支持同步和异步的消息产生，并且可以在一次调用中产生多个元素。
 * @author wendongchao
 * @ClassName FluxDemo05
 * @Date 2022/4/15 16:15
 */
public class FluxDemo05 {
    public static void main(String[] args) {
        Flux.create(sink -> {
            for(int i = 0; i < 10; i ++)
                sink.next(i);
            sink.complete();
        }).subscribe(System.out::println);
    }
}
