package com.lab1_67_java;

public class Main {

    public static void main(String[] args) {
        Farm Farm1 = new Farm();
        Farm Farm2 = new Farm("Kyiv", 150 );
        Farm Farm3 = new Farm("Kharkiv", 300 , 100);
        System.out.println("Farm1");
        System.out.println(Farm1);
        System.out.println("Farm2");
        System.out.println(Farm2);
        System.out.println("Farm3");
        System.out.println(Farm3);
        System.out.println(Farm.getStaticField());
    }

}
