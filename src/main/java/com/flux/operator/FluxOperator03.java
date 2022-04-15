package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符zipWith
 * zipWith操作符把当前流中的元素与另一个流中的元素按照一对一的方式进行合并。
 * 在合并时可以不做任何处理，由此得到的是一个元素类型为Tuple2的流；
 * 也可以通过一个BiFunction函数对合并的元素进行处理，所得到的流的元素类型为该函数的返回值。
 * @author wendongchao
 * @ClassName FluxOperator03
 * @Date 2022/4/15 16:33
 */
public class FluxOperator03 {
    public static void main(String[] args) {
        Flux.just("a", "b").zipWith(Flux.just("c", "d")).subscribe(System.out::println);
        Flux.just("a", "b").zipWith(Flux.just("c", "d"), (s1, s2) -> String.format("%s-%s", s1, s2)).subscribe(System.out::println);
    }
}
