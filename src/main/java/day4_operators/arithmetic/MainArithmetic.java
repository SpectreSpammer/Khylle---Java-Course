package day4_operators.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {

        double baseSalary = 50000.75;
        double bonus = 25000.75;
        int yearsOfService = 7;

        //Addition +
        double totalPay = baseSalary + bonus;
        System.out.println(" 1. Total pay for Khylle is Php " + totalPay);

        //Subtraction -
        double sss = 2000.75;
        double netPay = totalPay - sss;
        System.out.println(" 2. Net pay for Khylle is Php " + netPay);

        //Multiplication *
        double annualPay = baseSalary * 12;
        System.out.println(" 3. Annual Salary for Khylle is Php " + annualPay);

        //Division /
        double averageAnnualSalaryIncrease = baseSalary / yearsOfService;
        System.out.println(" 4. Average Annual Salary Increase for Khylle is Php " + averageAnnualSalaryIncrease);

        //Modulus %
        int daysUntilNextPayIncrease = 365 % 90;
        System.out.println(" 5. Days until next pay increase for Khylle is " + daysUntilNextPayIncrease);
    }
}
