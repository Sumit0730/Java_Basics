package com.startjava;

public class LoopClass {
    // There are three types of loop in java (while ,do-while and for )
    int a=5;
    int b=10;


    public void Whileloop(){
        while (a<b){
            System.out.println(" while loop executed");
            a=a+1;
        }
    }

    public void Forloop(){
        for (int i = 0; i < b; i++) {
            System.out.println("for loop executed ");
        }
    }

    public void DoWhile(){
        do {
            System.out.println("do while executed");
        }while (a<b);
    }

}
