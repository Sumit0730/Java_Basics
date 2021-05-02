package com.startjava;

public class StringClass {

    String Firstname="Sumit";
    String Lastname="Mishra";


    public void Stringfunction(){
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println( Lastname.toUpperCase());

    }

    public static void main(String[] args) {
        StringClass obj=new StringClass();
        obj.Stringfunction();
        System.out.println(obj.Firstname.toUpperCase());
    }
}
