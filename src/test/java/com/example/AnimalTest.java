package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Test
    public void testGetFoodHerbivorousAnimal() throws Exception {
        animal = new Animal();
        List<String> expectedAnimal = Arrays.asList("Трава", "Различные растения");
        List<String> actualAnimal = animal.getFood("Травоядное");
        assertEquals(expectedAnimal, actualAnimal);
    }

    @Test
    public void testGetFoodPredatorAnimal() throws Exception {
        animal = new Animal();
        List<String> expectedAnimal = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualAnimal = animal.getFood("Хищник");
        assertEquals(expectedAnimal, actualAnimal);
    }

    @Test(expected = Exception.class)
    public void testGetFoodExceptionAnimal() throws Exception {
        animal = new Animal();
        animal.getFood("Unknown");
    }

    @Test
    public void testGetFamily() {
        animal = new Animal();
        String expectedDescription = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualDescription = animal.getFamily();
        assertEquals(expectedDescription, actualDescription);
    }
}
