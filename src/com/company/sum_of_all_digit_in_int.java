package com.company;
import java.util.Scanner;

public class sum_of_all_digit_in_int {
    static int SumAllDigit (int a){
        if (a==0)

            return 0;

        return (a%10 + SumAllDigit(a/10));

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Digit :-  ");
        int num = Sc.nextInt();
        System.out.println(SumAllDigit(num));


    }
}
