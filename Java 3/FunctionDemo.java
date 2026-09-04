package com.mit.sam;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionDemo {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        // =========================
        // 1. SUPPLIER
        // =========================

        Supplier<String> s = () -> "Geethanjali";

        System.out.println(s.get());
        print(s.get());

        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());

        // =========================
        // 2. CONSUMER
        // =========================

        // Consumer using Lambda
        Consumer<String> c = (str) -> System.out.println(str);
        c.accept("Adios");

        // Consumer using Method Reference
        Consumer<String> c1 = System.out::println;
        c1.accept("Hello");

        // Consumer using our own method reference
        Consumer<String> c2 = FunctionDemo::print;
        c2.accept("Aloha");

        // =========================
        // 3. PREDICATE
        // =========================

        Predicate<Integer> nonNegative = (x) -> x >= 0;

        System.out.println(nonNegative.test(3));
        System.out.println(nonNegative.test(-2));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;

        System.out.println(isEven.test(5));

        // =========================
        // 4. BIPREDICATE
        // =========================

        BiPredicate<String, String> contains = (str, substr) -> str.contains(substr);

        System.out.println(contains.test("Geethanjali", "Geetha"));
        System.out.println(contains.test("Geethanjali", "Java"));

        // =========================
        // 5. FUNCTION
        // =========================

        Function<String, Integer> length = (str) -> str.length();

        System.out.println(length.apply("Geethanjali"));

        Function<Integer, Integer> square = (x) -> x * x;

        System.out.println(square.apply(5));

        // =========================
        // 6. BIFUNCTION
        // =========================

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 20));

        BiFunction<String, String, String> combine = (first, last) -> first + " " + last;

        System.out.println(combine.apply("Geetha", "Janjali"));
    }
}