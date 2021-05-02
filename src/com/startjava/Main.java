package com.startjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // to get user input we use scanner class
        UserInput();

        VariableClass mob=new VariableClass();
        mob.Printdatatype();
    }

    private static void UserInput() {
        Scanner scan =new Scanner(System.in);
        int value= scan.nextInt();
        float value2=scan.nextFloat();
        String name =scan.next();// it can read the input till  first space
        String last=scan.nextLine();// it can read whole line input

    }
}
