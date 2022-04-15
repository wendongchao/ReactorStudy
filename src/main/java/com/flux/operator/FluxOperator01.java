package com.flux.operator;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * 操作符buffer和bufferTimeout
 * 使得Predicate返回true的那个元素可以选择添加到当前集合或下一个集合中；一旦为false，会立即开始下一次收集。
 * @author wendongchao
 * @ClassName FluxOperator01
 * @Date 2022/4/15 16:25
 */
public class FluxOperator01 {
    public static void main(String[] args) {
        Flux.range(1, 100).buffer(20).subscribe(System.out::println);
        Flux.interval(Duration.of(100,  ChronoUnit.MILLIS)).buffer(1001).take(2).toStream().forEach(System.out::println);
        // bufferUntil会一直收集直到Predicate返回true。
        Flux.range(1, 10).bufferUntil(i -> i%2 == 0).subscribe(System.out::println);
        // bufferWhile则只有当Predicate返回true时才会收集。
        Flux.range(1, 10).bufferWhile(i -> i%2 == 0).subscribe(System.out::println);
    }
}
