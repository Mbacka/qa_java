package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;
    LionAlex alex;

    @Test
    public void testGetFriendsAlex() throws Exception {
        alex = new LionAlex(feline);
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        alex = new LionAlex(feline);
        String expectedHome = "Нью-Йоркский зоопарк";
        String actualHome = alex.getPlaceOfLiving();
        assertEquals(expectedHome, actualHome);
    }

    @Test
    public void testGetKittens() throws Exception {
        alex = new LionAlex(feline);
        int expectedKittens = 0;
        int actualKittens = alex.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
}
