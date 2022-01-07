package com.company;
import java.util.Scanner;
public class Sec_or_min_to_year_converter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("You want to convert 'second' or  \'minute\' 1 Press \'1\' for sec and" +
                " Press \'Any other no\' for minutes ");
        int time = Sc.nextInt();
        if (time == 1) {
            System.out.print("Enter Seconds :-");
            long a = Sc.nextLong();
            long i = 31536000, j = 2628288, k = 604800, l = 86400;
            long year, month, week, day, hour, minute, sec, temp = 0;
            year = a / i;
            temp = a % i;
            month = temp / j;
            temp = temp % j;
            week = temp / k;
            temp = temp % k;
            day = temp / l;
            temp = temp % l;
            hour = temp / 3600;
            temp = temp % 3600;
            minute = temp / 60;
            temp = temp % 60;
            sec = temp;
            System.out.print("Your Entered Seconds have " + year + " year " + month + "  month " + week + " week " + day + " day " +
                    minute + " minute " + sec + " seconds ");

        } else {
                System.out.print("Enter minutes  :-");
                long a = Sc.nextLong();
                long i = 525600, j = 43800, k = 10080, l = 1440;
                long year, month, week, day, hour, minute, temp = 0;
                year = a / i;
                temp = a % i;
                month = temp / j;
                temp = temp % j;
                week = temp / k;
                temp = temp % k;
                day = temp / l;
                temp = temp % l;
                hour = temp / 60;
                temp = temp % 60;
                minute = temp;
                System.out.print("Your Entered minutes have " + year + " year " + month + " month " + week + " week " + day + " day " +
                        minute + " minute ");
            }

        }
    }

