package com.kgr.service;

public class Main {

    public static void main(String[] args) {

        MyService myService = new MyService();

        myService.sortRouteRequestList().forEach(System.out::println);
    }
}
