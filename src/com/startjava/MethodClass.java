package com.startjava;

public class MethodClass {
    /* If we need some operation so many time we can use loop but if we want that operation at some different place we have to write that code
       again and again.
       TO overcome this problem the concept of method is introduced we can create a method of particular part we can call that method whenever in use.
     */

    // This method is used to say hello
    void Sayhello(){
        System.out.println("Hello Everyone!!!!!");
    }

    int a=12;
    String name="sumit";

    // Getter method is used to get the value of the class so that we can use that variable data in the program
    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }


    // Setter method is used to set the value.

    public void setA(int a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }




    public static void main(String[] args) {
        MethodClass obj=new MethodClass();
        obj.Sayhello();
        System.out.println(obj.getA());
        System.out.println(obj.getName());
    }
}
