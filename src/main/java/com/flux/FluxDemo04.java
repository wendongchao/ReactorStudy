package com.flux;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Random;

/**
 * 复杂创建方法generate
 * generate()方法通过同步和逐一的方式来产生Flux序列。
 * 序列的产生是通过调用所提供的的SynchronousSink对象的next()，complete()和error(Throwable)方法来完成的。
 * 逐一生成的含义是在具体的生成逻辑中，next()方法只能最多被调用一次。
 * 在某些情况下，序列的生成可能是有状态的，需要用到某些状态对象，此时可以使用
 * generate(Callable<S> stateSupplier, BiFunction<S, SynchronousSink<T>, S> generator)，
 * 其中stateSupplier用来提供初始的状态对象。
 * 在进行序列生成时，状态对象会作为generator使用的第一个参数传入，可以在对应的逻辑中对改状态对象进行修改以供下一次生成时使用。
 * @author wendongchao
 * @ClassName FluxDemo04
 * @Date 2022/4/15 16:08
 */
public class FluxDemo04 {
    public static void main(String[] args) {
        Flux.generate(sink -> {
            sink.next("Hello");
            sink.complete();
        }).subscribe(System.out::println);


        final Random random = new Random();
        Flux.generate(ArrayList::new, (list, sink) -> {
            int value = random.nextInt(100);
            list.add(value);
            sink.next(value);
            if( list.size() ==10 )
                sink.complete();
            return list;
        }).subscribe(System.out::println);
    }
}
