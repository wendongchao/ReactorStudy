package com.flux.operator;

import reactor.core.publisher.Flux;

import java.util.Arrays;

/**
 * 操作符combineLatest
 * combineLatest操作符把所有流中的最新产生的元素合并成一个新的元素，作为返回结果流中的元素。
 * 只要其中任何一个流中产生了新的元素，合并操作就会被执行一次，结果流中就会产生新的元素。
 * @author wendongchao
 * @ClassName FluxOperator09
 * @Date 2022/4/15 17:26
 */
public class FluxOperator09 {
    public static void main(String[] args) {
        Flux.combineLatest(Arrays::toString, Flux.range(0,100).take(5), Flux.range(50, 100).take(5)).toStream().forEach(System.out::println);
    }
}
