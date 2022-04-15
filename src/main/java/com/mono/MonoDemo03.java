package com.mono;

import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author wendongchao
 * @ClassName MonoDemo03
 * @Date 2022/4/15 16:20
 */
public class MonoDemo03 {
    public static void main(String[] args) {
        Mono.fromSupplier(() -> "Hello").subscribe(System.out::println);
        Mono.justOrEmpty(Optional.of("Hello")).subscribe(System.out::println);
        Mono.create(sink -> sink.success("Hello")).subscribe(System.out::println);
    }
}
