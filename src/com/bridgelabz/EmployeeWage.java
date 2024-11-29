package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        double randomNumber = Math.random() * 2;
        System.out.println("random number generated "+ randomNumber);
        int result = (int) randomNumber;
        System.out.println("result : "+ result);
        if (result == 1){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
