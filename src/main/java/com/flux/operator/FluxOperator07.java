package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符flatMap和flatMapSequential
 * flatMap和flatMapSequential操作符把流中的每个元素转换成一个流，再把所有流中的元素进行合并。
 * flatMapSequential和flatMap之间的区别与mergeSequential和merge是一样的。
 * @author wendongchao
 * @ClassName FluxOperator07
 * @Date 2022/4/15 17:05
 */
public class FluxOperator07 {
    public static void main(String[] args) {
        Flux.just(5, 10).flatMap(x -> Flux.range(x * 10, 100).take(x)).toStream().forEach(System.out::println);
    }
}
