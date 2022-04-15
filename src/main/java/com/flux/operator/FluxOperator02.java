package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符Filter
 * 对流中包含的元素进行过滤，只留下满足Predicate指定条件的元素。
 * @author wendongchao
 * @ClassName FluxOperator02
 * @Date 2022/4/15 16:31
 */
public class FluxOperator02 {
    public static void main(String[] args) {
        Flux.range(1, 10).filter(i -> i%2 == 0).subscribe(System.out::println);
    }
}
