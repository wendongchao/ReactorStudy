package com.flux;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

/**
 * @author wendongchao
 * @ClassName FluxDemo02
 * @Date 2022/4/15 15:29
 */
public class FluxDemo02 {
    public static void main(String[] args) {
        // flux 创建后，没有订阅就不消费
        Flux ints = Flux.range(1, 4);
        Flux seq1 = Flux.just("bole1", "bole2", "bole3");
        List iterable = Arrays.asList("bole_01", "bole_02", "bole_03");
        Flux seq2 = Flux.fromIterable(iterable);
        seq2.subscribe(i -> System.out.println(i));// subscribe订阅
    }
}
