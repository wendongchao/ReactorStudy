package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符concatMap
 * concatMap操作符的作用也是把流中的每个元素转换成一个流，再把所有流进行合并。
 * concatMap会根据原始流中的元素顺序依次把转换之后的流进行合并，
 * 并且concatMap堆转换之后的流的订阅是动态进行的，而flatMapSequential在合并之前就已经订阅了所有的流。
 * @author wendongchao
 * @ClassName FluxOperator08
 * @Date 2022/4/15 17:23
 */
public class FluxOperator08 {
    public static void main(String[] args) {
        Flux.just(5, 10).concatMap(x -> Flux.range(x * 10, 100).take(x)).toStream().forEach(System.out::println);
    }
}
