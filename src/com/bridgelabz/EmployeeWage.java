package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static int calculateDailyWage() {
        return WAGE_PER_HOUR * FULL_DAY_HOUR;
    }

    public static int calculatePartTimeWage(int partTimeWagePerHour) {
        return PART_TIME_HOUR * partTimeWagePerHour;
    }

    public static int calculateMonthlyWage() {
        return WORKING_DAYS_PER_MONTH * calculateDailyWage();
    }

    public static boolean isEmployeePresent() {
        return Math.random() < 0.5;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program");

        if (isEmployeePresent()) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }

        int dailyWage = calculateDailyWage();
        int partTimeWage = calculatePartTimeWage(15);
        int monthlyWage = calculateMonthlyWage();

        System.out.println("Daily Employee Wage: " + dailyWage);
        System.out.println("Part-Time Employee Wage: " + partTimeWage);
        System.out.println("Monthly Employee Wage: " + monthlyWage);

        System.out.println("\nPress 1 to see Daily Employee Wage");
        System.out.println("Press 2 to see Part-Time Employee Wage");
        System.out.println("Press 3 to see Monthly Employee Wage");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Daily Employee Wage: " + dailyWage);
                break;
            case 2:
                System.out.println("Part-Time Employee Wage: " + partTimeWage);
                break;
            case 3:
                System.out.println("Monthly Employee Wage: " + monthlyWage);
                break;
            default:
                System.out.println("Invalid input. Please press 1, 2, or 3.");
        }

        sc.close();
    }
}
