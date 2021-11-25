package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline felineAsMock;

    @Test
    public void testEatMeatFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualList = feline.eatMeat();
        assertEquals(expectedList, actualList);

    }

    @Test
    public void testGetFoodWithArgFeline() throws Exception {
        felineAsMock.getFood("Хищник");
        Mockito.verify(felineAsMock).getFood("Хищник");
    }

    @Test
    public void testGetFamilyFeline() {
        Feline feline = new Feline();
        String expectedFamyly = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamyly, actualFamily);
    }

    @Test
    public void testKittensNoArgFeline() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
}
