package com.test.java8newfeature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap2 {

	public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                                          "1", "2.3");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num -> Stream.of(num)).
                         forEach(System.out::println);
    }
}
