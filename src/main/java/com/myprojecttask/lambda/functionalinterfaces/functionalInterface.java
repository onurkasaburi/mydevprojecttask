package com.myprojecttask.lambda.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionalInterface {


    public static void main(String[] args) {

        // accepts single parameter and returns a single value
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(35));

        // does not accept any arguments  but returns an object

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // accepts single argument and return any result

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        // accepts single value returns true or false

        Predicate<Integer> lessThan = i -> (i < 10);
        System.out.println(lessThan.test(5));



    }
}
