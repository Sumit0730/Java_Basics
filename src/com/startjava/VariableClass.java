package com.startjava;

public class VariableClass {
    /* To calculate the range of datatype use formula
          [ - 2^(n-1) to 2^(n-1)-1 ]   where n= (no of byte) * 8
     */
    int num = 10; // size-4 byte
    short sh = 123; // size-2 byte
    long lg = 12365; // size-8 byte
    byte by = 127; // size-1 byte

    float fl = 123.3f; // size-4 byte
    double db = 12.23; // size-8 byte

    char ch = 'd'; // size-2 byte
    boolean bool = true; // size-1 byte


    public void Printdatatype() {
        System.out.println(num);
        System.out.println(sh);
        System.out.println(lg);
        System.out.println(by);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(ch);
        System.out.println(bool);
    }

    public static void main(String[] args) {
        VariableClass obj=new VariableClass(); //object declaration

    }
}