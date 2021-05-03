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
class String_Builder {



    public static void main(String[] args) {

        // this is used to append the current string variable
        int a=20;
        String name="";
        name+="hello";
        name+=" ";
        name+=" world!!!";
        System.out.println(name);
        // to avoid this step or to make it easier in use the concept of string builder is introduced

        StringBuilder str =new StringBuilder("");
        str.append("hello ");
        str.append("My name is sumit");
        System.out.println(str.toString());

        /////////// String Formatting///////////////////////////////////////////////////////////////
        System.out.println("hello\tmy name is sumit\nI m a programmer");
        System.out.printf("My age is %d",20);

    }
}
