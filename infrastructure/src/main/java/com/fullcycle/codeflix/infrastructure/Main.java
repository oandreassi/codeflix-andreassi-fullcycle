package com.fullcycle.codeflix.infrastructure;

import com.fullcycle.codeflix.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}