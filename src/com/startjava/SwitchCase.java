package com.startjava;

import java.util.Scanner;

public class SwitchCase {



    public void Switch(){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        String operation=scan.next();

        switch (operation){

            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "divide":
                System.out.println(a/b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "modulus":
                System.out.println(a%b);
                break;
        }
    }

    public static void main(String[] args) {
        SwitchCase obj=new SwitchCase();
        obj.Switch();
    }
}
