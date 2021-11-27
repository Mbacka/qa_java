package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionTest {

    Feline feline = new Feline();
    Lion lion;

    @Test
    public void testGetKittensLion() throws Exception {
        lion = new Lion("Самец", feline);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodLion() throws Exception {
        lion = new Lion("Самец", feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void testCorrectException() throws Exception {
        lion = new Lion("Unknown", feline);
    }
}
