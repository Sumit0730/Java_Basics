package com.startjava;

class Machine{
    void Start(){
        System.out.println("Engine start!!!!!!");
    }
    void Stop(){
        System.out.println("Engine stop!!!!!!!!");
    }
}

class car extends Machine{
    void Brand(){
        System.out.println("Mahindra Thar");
    }
}
public class Inheritance extends car  {



    public static void main(String[] args) {
        car cars=new car();
        cars.Start();
        cars.Stop();
        cars.Brand();
    }

class AccessSpecifier{
        // public -: it can be access anywhere in a program.
        public int a=12;

        //private -: it can be access only in a same class
        private int d=85;

        //protected -: it can be access in a same class and same package.
        protected int c=30;
}

}
