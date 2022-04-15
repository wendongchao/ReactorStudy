package com.flux.operator;

import reactor.core.publisher.Flux;

/**
 * 操作符take
 * take系列操作符用来从当前流中提取元素。提取方式如下：
 *
 * 　　　　take(long n)，take(Duration timespan)和takeMillis(long timespan)：按照指定的数量或时间间隔来提取
 *
 * 　　　　takeLast(long n)：提取流中的最后N个元素
 *
 * 　　　　takeUntil(Predicate<? super T> predicate) ：提取元素直到Predicate返回true
 *
 * 　　　　takeWhile(Predicate<? super T> continuePredicate)：当Predicate返回true时才进行提取
 *
 * 　　　　takeUntilOther(Publisher<?> other)：提取元素直到另外一个流开始产生元素
 * @author wendongchao
 * @ClassName FluxOperator04
 * @Date 2022/4/15 16:38
 */
public class FluxOperator04 {
    public static void main(String[] args) {
        Flux.range(1, 1000).take(10).subscribe(System.out::println);
        Flux.range(1, 1000).takeLast(10).subscribe(System.out::println);
        Flux.range(1, 1000).takeWhile(i -> i < 10).subscribe(System.out::println);
        Flux.range(1, 1000).takeUntil(i -> i == 10).subscribe(System.out::println);
    }
}
