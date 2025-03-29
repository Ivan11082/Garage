package com.example.demo.garage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListTest {
    @Test
    void testNames() {
        //make spisok imen
        List<String> names = List.of("Alex", "Nadia", "Lyuba", "Ivan");
        String s = names.stream().collect(Collectors.joining(", "));
        System.out.println(s);
    }

    @Test
    void testNumbers() {
        //make spisok num
        IntStream num = IntStream.rangeClosed(1,  5);   
        num.forEach(System.out::println);  
    }
}
