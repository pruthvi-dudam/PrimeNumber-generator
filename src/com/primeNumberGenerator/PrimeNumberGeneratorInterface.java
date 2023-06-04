package com.primeNumberGenerator;
import java.util.List;

// Given Interface to implement Prime Generator functions
public interface PrimeNumberGeneratorInterface {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}
