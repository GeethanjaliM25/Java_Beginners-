package com.mit.bank;

// Functional Interface
interface Greet {
    String sayHello();

    default void sayBye() {
        System.out.println("Goodbye!");
    }

    static void sayHola() {
        System.out.println("Hola Amigo,Lambda");
    }
}

interface Add {
    int add(int a, int b);
}

interface CheckEvenOdd {
    boolean isEven(int number);
}

interface CheckPrime {
    boolean isPrime(int number);
}

// Main class
public class LambdaDemo {

    public static void main(String[] args) {

        // Lambda Expression 1
        Greet g1 = () -> "Hello Lambda";

        System.out.println(g1.sayHello());

        // Lambda Expression 2
        Greet g2 = () -> {
            String greeting = "Welcome to Lambda";
            return greeting;
        };

        System.out.println(g2.sayHello());

        Add add = (a, b) -> a + b;

        System.out.println(add.add(5, 10));

        // Lambda Expression 4
        CheckEvenOdd numberCheck = n -> (n % 2 == 0);

        System.out.println(numberCheck.isEven(10));
        System.out.println(numberCheck.isEven(7));

        // Lambda Expression 5
        CheckPrime primeCheck = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(primeCheck.isPrime(7));
        System.out.println(primeCheck.isPrime(10));

        g1.sayBye();
        Greet.sayHola();
    }
}