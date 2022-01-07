package com.company;
import java.util.Scanner;

public class temprature_converture_c_to_f {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.print("If you want to convert temperature from Celsius  to Fahrenheit , Press \"1\"  " +
                "\nAnd if you want to  convert temperature from  Fahrenheit To Celsius , Press  \"2\"\n");

        int a = Sc.nextInt();
        System.out.println("Enter value of your temperature :- ");
        float temp = Sc.nextFloat();

        if (a ==1) {
            float  fa;
            fa = ((temp*9.0f / 5)+32 );
            System.out.println("Temperature in Fahrenheit is " +fa+" F");

        }
        else {
                float ce;
                ce   = (temp - 32.0f) *(5.0f/9);
            System.out.println("Temperature in Celsius is :" + ce);


        }
}
}
