package com.startjava;

public class StaticKeyword {
    public int x=10;
    public static int y=20;

    public static void ShowNumber(){
        System.out.println(y);

      //  System.out.println(x); this will show error because in static method only static variables are valid.
        // we can use static variables in non-static methods.
    }


    public static void main(String[] args) {
        // we can call static variables by class name
        StaticKeyword.y=40;
        System.out.println(StaticKeyword.y);

        StaticKeyword.ShowNumber();

        // we cannot call instance variable by class name ,
        // we have to create object of that class first to call instance variable of class.

        StaticKeyword obj=new StaticKeyword();
        System.out.println(obj.x);
    }

}
