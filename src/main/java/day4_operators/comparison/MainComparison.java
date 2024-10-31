package day4_operators.comparison;

public class MainComparison {
    public static void main(String[] args) {

        int yearsOfService = 10;
        double baseSalary = 50000;
        double bonus = 24000;
        int hoursWorked = 41;
        double hourlyRate = 500;


        // equal to ==
        if(yearsOfService == 7){
            System.out.println("1. Khylle has been with the company for exactly 7 yrs. ");
        }else {
            System.out.println("1. Khylle years of service is not 7 yrs. ");
        }

        //not equal to !=
        if(baseSalary != 50000.75){
            System.out.println("2. Khylle`s base salary is not Php 50,000 ");
        }else {
            System.out.println("2. Khylle`s base salary is Php 50,000 ");
        }

        //greater than >
        if(hoursWorked > 40){
            System.out.println("3. Khylle worked 40hrs this week.");
        }else {
            System.out.println("3. Khylle is under time this week.");
        }

        //less than <
        if(hourlyRate < 500){
            System.out.println("4. Khylle`s hourly rate is less than Php 500.");
        }else {
            System.out.println("4. Khylle`s hourly rate is Php 500 or more.");
        }

        // greater than or equal to >=
        double totalPay = baseSalary + bonus;
        if(totalPay >= 75000){
            System.out.println("5. Khylle`s total pay is Php 75,000 or more.");
        }else {
            System.out.println("5. Khylle`s total pay is less than Php 75,000.");
        }

        // less than or equal to <=
        if(yearsOfService <= 10){
            System.out.println("6. Khylle`s has been with the company for 10 yrs or less.");
        }else {
            System.out.println("6. Khylle`s has been with the company for more than 10 yrs.");
        }
    }
}
