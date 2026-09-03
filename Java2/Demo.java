package com.mit.bank;

public class Demo<T> {
    private T data;

    public Demo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Demo<Integer> demo1 = new Demo<>(1000);
        System.out.println(demo1.getData());

        Demo<String> demo2 = new Demo<>("Hello, World!");
        System.out.println(demo2.getData());
    }
}