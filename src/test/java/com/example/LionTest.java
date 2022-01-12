package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void testGetKittensLion() throws Exception {
        lion = new Lion("Самец", feline);
        int expected = 0;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFoodLion() throws Exception {
        lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualFood);
    }

    @Test(expected = Exception.class)
    public void testCorrectException() throws Exception {
        lion = new Lion("Unknown", feline);
    }
}
