package com.flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * 简单创建方法
 * @author wendongchao
 * @ClassName FluxDemo03
 * @Date 2022/4/15 16:05
 */
public class FluxDemo03 {
    public static void main(String[] args) {
        Flux.just("Hello", "World").subscribe(System.out::println);
        Flux.fromArray(new Integer[]{1, 2, 3}).subscribe(System.out::println);
        Flux.empty().subscribe(System.out::println);
        Flux.range(1, 10).subscribe(System.out::println);
        Flux.interval(Duration.of(10, ChronoUnit.SECONDS)).subscribe(System.out::println);
    }
}
