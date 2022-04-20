package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream创建
 * @ClassName StreamCreate
 * @Author wendongchao
 * @Date 2022/4/20 17:30
 */
public class StreamCreate {
    public static void main(String[] args) {
        //
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream(); // 创建一个顺序流
        stream.forEach(System.out::println);
        Stream<String> parallelStream = list.parallelStream();// 创建一个并行流
        parallelStream.forEach(System.out::println);

    }
}
