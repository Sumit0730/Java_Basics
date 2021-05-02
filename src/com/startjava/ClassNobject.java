package com.startjava;


class Class1{
    int b;
    String name1;
    float c;
}


public class ClassNobject {
    // There will be only one public class in a class.
    // If you want more class make class using class keyword only.
    int a;
    String name;

    public static void main(String[] args) {
        Class1 obj1=new Class1();
        obj1.b=10;
        obj1.c=12.2f;
        obj1.name1="sumit";
        System.out.println(obj1.c);
    }
}





