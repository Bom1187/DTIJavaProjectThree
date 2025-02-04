package com.sau.dit.method;

public class MyClassMet02 {
    //ประเภท method
    //1 ไม่มี parameter ไม่มี return
    public  static  void showWow(){
        System.out.println("Wow wow wo");
    }

    //2 มี parameter ไม่มี return
    public  static  void sumNumber(int num1, int num2 ){
        System.out.println( num1 + num2 );
    }

    //3 ไม่มี parameter มี return
    public  static  String showSawasdee(){
        return "Sawasdee jaaa....";
    }

    //4 มี parameter มี return
    public  static  double calPowNumber(int a, int b){
        return Math.pow( a, b );
    }

    public static void main(String[] args) {
        showWow();
        sumNumber(50,20);
        sumNumber(70,500);

        System.out.println( showSawasdee() );
        String data = showSawasdee();
        System.out.println(data + "NinniN");

        System.out.println(calPowNumber(20,5));
        double result =  calPowNumber( 5, 3 );
        System.out.println("5^3 = " + result);
    }
}
