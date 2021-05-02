package com.startjava;

import java.util.Scanner;

public class ArrayClass {
    // In array we can store many values .It can be of any datatype .


    public void Array() {
        int[] value = new int[5];
        System.out.println("enter values");
        for (int i = 0; i < value.length; i++) {
            Scanner scan = new Scanner(System.in);
            value[i] = scan.nextInt();
        }
        System.out.println("array :");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }

        // we can give value of array at the time of declaration
        int[] values={1,2,3,4,5,6};

    }

    public void StringArray(){
        String[] words =new String[5];
        System.out.println("enter values ");
        for (int i = 0; i < words.length; i++) {
            Scanner scan = new Scanner(System.in);
            words[i]=scan.nextLine();
        }
        // fOR EACH LOOP
        for (String word:words)
              {
            System.out.println(word);
        }

    }

    public void MultiDimensionArray(){
        int[][] data=new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                Scanner scan = new Scanner(System.in);
                data[i][j]=scan.nextInt();
            }
        }

        // on the line of declaration
        String[][] newdata={{"sumit","samyak","ayush"},{"mishra","rastogi","pandey"}};
    }

}