package com.company;
import java.util.Scanner;
class Patient{
    private String patientname;

    {
        patientname = new String();
    }

    public double height ;
    public double weight ;

    public String getPatient_name() {
        return patientname;
    }

    public void setPatient_name(String patient_name) {
        patientname = patient_name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculate_BMI  (){
        double BMI;
        BMI = weight/(height*height);
        return BMI;
    }
}
class Patients{




}
public class health_care {
    public static void main(String[] args) {
        Patient dhruv = new Patient();
        dhruv.setPatient_name("Dhruv Modi");
        dhruv.setHeight(1.70);
        dhruv.setWeight(70);
        System.out.println(dhruv.getHeight());
        System.out.println(dhruv.getWeight());
        System.out.println(dhruv.calculate_BMI());

    }
}

