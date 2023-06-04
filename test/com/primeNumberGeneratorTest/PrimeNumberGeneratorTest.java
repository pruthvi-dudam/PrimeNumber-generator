package com.primeNumberGeneratorTest;
import com.primeNumberGenerator.PrimeNumberGenerator;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

// Unit tests for the application, including edge cases, negative cases and performance cases
public class PrimeNumberGeneratorTest {
    private final PrimeNumberGenerator generator = new PrimeNumberGenerator();

    @Test
    public void testGenerate_PrimesInRange() {
        List<Integer> primes = generator.generate(1, 20);
        Assert.assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), primes);
    }

    @Test
    public void testGenerate_EmptyRange() {
        List<Integer> primes = generator.generate(24, 28);
        Assert.assertTrue(primes.isEmpty());
    }

    @Test
    public void testGenerate_SingleNumberInRange_Prime() {
        List<Integer> primes = generator.generate(13, 13);
        Assert.assertEquals(List.of(13), primes);
    }

    @Test
    public void testGenerate_SingleNumberInRange_NotPrime() {
        List<Integer> primes = generator.generate(10, 10);
        Assert.assertTrue(primes.isEmpty());
    }

    @Test
    public void testGenerate_NegativeRange() {
        List<Integer> primes = generator.generate(-10, 10);
        Assert.assertEquals(List.of(2, 3, 5, 7), primes);
    }

    @Test
    public void testGenerate_LargeRange() {
        List<Integer> primes = generator.generate(1000, 1050);
        Assert.assertEquals(List.of(1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049), primes);
    }

    @Test
    public void testIsPrime_PrimeNumber() {
        Assert.assertTrue(generator.isPrime(17));
    }

    @Test
    public void testIsPrime_NotPrimeNumber() {
        Assert.assertFalse(generator.isPrime(15));
    }

    @Test
    public void testIsPrime_NegativeNumber() {
        Assert.assertFalse(generator.isPrime(-7));
    }

    @Test
    public void testGenerate_RangeStartingGreaterThanEnding() {
        List<Integer> primes = generator.generate(30, 20);
        Assert.assertEquals(List.of(23, 29), primes);
    }

    @Test
    public void testIsPrime_Zero() {
        Assert.assertFalse(generator.isPrime(0));
    }

    @Test
    public void testIsPrime_One() {
        Assert.assertFalse(generator.isPrime(1));
    }

    @Test
    public void testGenerate_LargeRangePerformance() {
        long startTime = System.currentTimeMillis();
        List<Integer> primes = generator.generate(1000, 10000);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        Assert.assertTrue("Execution time exceeds threshold", executionTime < 100);
        Assert.assertTrue("Insufficient primes generated", primes.size() > 100);
    }
}

