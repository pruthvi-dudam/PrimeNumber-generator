package com.primeNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator implements PrimeNumberGeneratorInterface{

    // Generates a list of Prime Numbers
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primesList = new ArrayList<>();
        int start = Math.min(startingValue, endingValue);
        int end = Math.max(startingValue, endingValue);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primesList.add(i);
            }
        }

        return primesList;
    }

    // Checks if a number is Prime or not
    @Override
    public boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }

        for (int i = 2; i <= value/2 ; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
