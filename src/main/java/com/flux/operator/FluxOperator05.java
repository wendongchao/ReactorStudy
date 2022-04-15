package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符reduce和reduceWith
 * reduce和reduceWith操作符对流中包含的所有元素进行累计操作，得到一个包含计算结果的Mono序列。
 * 累计操作是通过一个BiFunction来表示的。在操作时可以指定一个初始值。若没有初始值，则序列的第一个元素作为初始值。
 * @author wendongchao
 * @ClassName FluxOperator05
 * @Date 2022/4/15 16:43
 */
public class FluxOperator05 {
    public static void main(String[] args) {
        Flux.range(1, 100).reduce((x, y) -> x + y).subscribe(System.out::println);
        Flux.range(1, 100).reduceWith(() -> 100, (x, y) -> x + y).subscribe(System.out::println);
    }
}
