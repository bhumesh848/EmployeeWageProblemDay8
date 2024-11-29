package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;

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

        int dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily Employee Wage is "+ dailyEmpWage);

        int partTimeWagePerhour = 15;
        int partTimeWage = PART_TIME_HOUR * partTimeWagePerhour;
        System.out.println("Part time employe wage is " + partTimeWage);

        System.out.println("Press 1 to see daily employee wage");
        System.out.println("Press 2 to see part time employee wage");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number){
            case 1 :
                System.out.println("Daily Employee Wage is "+ dailyEmpWage);
                break;
            case 2:
                System.out.println("part Time Employe wage is "+ partTimeWage);
                break;
            default:
                System.out.println("Invalid Input , press 1 or 2 .");
        }

    }
}