package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FelineKittensTest {
    private final int countKittens;
    private final int expectedKittens;

    public FelineKittensTest(int countKittens, int expectedKittens) {
        this.countKittens = countKittens;
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKittens() {
        return new Object[][]{
                {0, 0},
                {3, 3},
                {5, 5},
        };
    }

    @Test
    public void testShouldBeKittens() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens(countKittens);
        assertEquals(expectedKittens, actualKittens);
    }
}
