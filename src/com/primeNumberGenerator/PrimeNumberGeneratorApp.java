package com.primeNumberGenerator;

import java.util.List;
import java.util.Scanner;

// Driver Class to run the application
public class PrimeNumberGeneratorApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number Generator!");

        Scanner scanner = new Scanner(System.in);
        PrimeNumberGenerator generator = new PrimeNumberGenerator();
        String numberCheckRegex = "-?\\d+";

        boolean flag = true;
        while (flag) {
            System.out.println("Please select an option number:");
            System.out.println("1 - Input range");
            System.out.println("2 - Quit");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    boolean isValidRange = false;
                    String input1 = "";
                    String input2 = "";

                    while (!isValidRange) {
                        System.out.println("Please input the range (starting value and ending value):");
                        input1 = scanner.nextLine();
                        input2 = scanner.nextLine();

                        if (input1.matches(numberCheckRegex) && input2.matches(numberCheckRegex)) {
                            isValidRange = true;
                        } else {
                            System.out.println("Invalid range input. Please try again.");
                        }
                    }

                    int startingValue = Integer.parseInt(input1);
                    int endingValue = Integer.parseInt(input2);

                    List<Integer> primes = generator.generate(startingValue, endingValue);

                    System.out.println("Prime numbers in the range " + startingValue + " to " + endingValue + ":");
                    System.out.println(primes);
                    break;
                case "2":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using Prime Number Generator!");
        scanner.close();
    }
}
