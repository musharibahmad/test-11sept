
import java.util.Scanner;

public class Week2_Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== WEEK 2 LAB TASKS MENU =====");
            System.out.println("1. Simple Interest Calculator");
            System.out.println("2. Student Grade Evaluator");
            System.out.println("3. Temperature Converter");
            System.out.println("4. Salary Calculator");
            System.out.println("5. Travel Distance Converter");
            System.out.println("6. Age Checker");
            System.out.println("7. BMI Calculator");
            System.out.println("8. Currency Converter");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    simpleInterestCalculator(sc);
                    break;
                case 2:
                    studentGradeEvaluator(sc);
                    break;
                case 3:
                    temperatureConverter(sc);
                    break;
                case 4:
                    salaryCalculator(sc);
                    break;
                case 5:
                    travelDistanceConverter(sc);
                    break;
                case 6:
                    ageChecker(sc);
                    break;
                case 7:
                    bmiCalculator(sc);
                    break;
                case 8:
                    currencyConverter(sc);
                    break;
                case 9:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice != 9);

        sc.close();
    }

    // ===== Task 1: Simple Interest Calculator =====
    public static void simpleInterestCalculator(Scanner sc) {
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + interest);
    }

    // ===== Task 2: Student Grade Evaluator =====
    public static void studentGradeEvaluator(Scanner sc) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = (total / 500.0) * 100;
        String grade;
        if (percentage < 40)
            grade = "Fail";
        else if (percentage < 60)
            grade = "Pass";
        else if (percentage < 75)
            grade = "Good";
        else if (percentage < 90)
            grade = "Very Good";
        else
            grade = "Excellent";

        System.out.println("Total Marks: " + total + " out of 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
    }

    // ===== Task 3: Temperature Converter =====
    public static void temperatureConverter(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    }

    // ===== Task 4: Salary Calculator =====
    public static void salaryCalculator(Scanner sc) {
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter bonus percentage: ");
        double bonus = sc.nextDouble();
        double total = basic + (basic * bonus / 100);
        System.out.println("Total Salary: " + total);
    }

    // ===== Task 5: Travel Distance Converter =====
    public static void travelDistanceConverter(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double meters = km * 1000;
        double miles = km * 0.621371;
        double feet = km * 3280.84;
        System.out.println("Distance in meters: " + meters + " m");
        System.out.println("Distance in miles: " + miles + " miles");
        System.out.println("Distance in feet: " + feet + " ft");
    }

    // ===== Task 6: Age Checker =====
    public static void ageChecker(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "You are an Adult." : "You are a Minor.";
        System.out.println(result);
    }

    // ===== Task 7: BMI Calculator =====
    public static void bmiCalculator(Scanner sc) {
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi < 25)
            System.out.println("Category: Normal");
        else if (bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");
    }

    // ===== Task 8: Currency Converter =====
    public static void currencyConverter(Scanner sc) {
        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();
        System.out.print("Enter exchange rate: ");
        double rate = sc.nextDouble();
        double pkr = usd * rate;
        System.out.println("Amount in PKR: " + pkr);
    }
}
// Week2_Lab2.java
// Semester: Fall 2025
// Lab 2 – Programming Fundamentals (JAVA)
// Topics: Basic Syntax, Input/Output, Datatypes, Variables, Ternary Operator

import java.util.Scanner;

public class Week2_Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== WEEK 2 LAB TASKS MENU =====");
            System.out.println("1. Simple Interest Calculator");
            System.out.println("2. Student Grade Evaluator");
            System.out.println("3. Temperature Converter");
            System.out.println("4. Salary Calculator");
            System.out.println("5. Travel Distance Converter");
            System.out.println("6. Age Checker");
            System.out.println("7. BMI Calculator");
            System.out.println("8. Currency Converter");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    simpleInterestCalculator(sc);
                    break;
                case 2:
                    studentGradeEvaluator(sc);
                    break;
                case 3:
                    temperatureConverter(sc);
                    break;
                case 4:
                    salaryCalculator(sc);
                    break;
                case 5:
                    travelDistanceConverter(sc);
                    break;
                case 6:
                    ageChecker(sc);
                    break;
                case 7:
                    bmiCalculator(sc);
                    break;
                case 8:
                    currencyConverter(sc);
                    break;
                case 9:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice != 9);

        sc.close();
    }

    // ===== Task 1: Simple Interest Calculator =====
    public static void simpleInterestCalculator(Scanner sc) {
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + interest);
    }

    // ===== Task 2: Student Grade Evaluator =====
    public static void studentGradeEvaluator(Scanner sc) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = (total / 500.0) * 100;
        String grade;
        if (percentage < 40)
            grade = "Fail";
        else if (percentage < 60)
            grade = "Pass";
        else if (percentage < 75)
            grade = "Good";
        else if (percentage < 90)
            grade = "Very Good";
        else
            grade = "Excellent";

        System.out.println("Total Marks: " + total + " out of 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
    }

    // ===== Task 3: Temperature Converter =====
    public static void temperatureConverter(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    }

    // ===== Task 4: Salary Calculator =====
    public static void salaryCalculator(Scanner sc) {
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter bonus percentage: ");
        double bonus = sc.nextDouble();
        double total = basic + (basic * bonus / 100);
        System.out.println("Total Salary: " + total);
    }

    // ===== Task 5: Travel Distance Converter =====
    public static void travelDistanceConverter(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double meters = km * 1000;
        double miles = km * 0.621371;
        double feet = km * 3280.84;
        System.out.println("Distance in meters: " + meters + " m");
        System.out.println("Distance in miles: " + miles + " miles");
        System.out.println("Distance in feet: " + feet + " ft");
    }

    // ===== Task 6: Age Checker =====
    public static void ageChecker(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "You are an Adult." : "You are a Minor.";
        System.out.println(result);
    }

    // ===== Task 7: BMI Calculator =====
    public static void bmiCalculator(Scanner sc) {
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi < 25)
            System.out.println("Category: Normal");
        else if (bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");
    }

    // ===== Task 8: Currency Converter =====
    public static void currencyConverter(Scanner sc) {
        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();
        System.out.print("Enter exchange rate: ");
        double rate = sc.nextDouble();
        double pkr = usd * rate;
        System.out.println("Amount in PKR: " + pkr);
    }
}
D:  D:\
External Libraries
Scratches and Consoles

