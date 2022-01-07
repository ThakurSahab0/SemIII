package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class leap_year {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Year : ");
            int n=in.nextInt();
            if((n%4==0 && n%100!=0)||n%400==0)
            {
                System.out.println("Leap Year ");
            }
            else
            {
                System.out.println("Not Leap Year ");
            }
        }
    }

