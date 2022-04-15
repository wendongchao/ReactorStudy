package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符merge和mergeSequential
 * merge和mergeSequential操作符用来把多个流合并成一个Flux序列。
 * merge按照所有流中元素的实际产生序列来合并，而mergeSequential按照所有流被订阅的顺序，以流为单位进行合并。
 * @author wendongchao
 * @ClassName FluxOperator06
 * @Date 2022/4/15 16:51
 */
public class FluxOperator06 {
    public static void main(String[] args) {
        Flux.merge(Flux.range(0, 100).take(5), Flux.range(50, 100).take(5)).toStream().forEach(System.out::println);
        Flux.mergeSequential(Flux.range(0, 100).take(5), Flux.range(50, 100).take(5)).toStream().forEach(System.out::println);
    }
}
