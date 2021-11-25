package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String hasMane;
    private final boolean expected;
    @Mock
    Feline feline;

    public LionHasManeTest(String hasMane, boolean expected) {
        this.hasMane = hasMane;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testHasMane() throws Exception {
        Lion lion = new Lion(hasMane, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
