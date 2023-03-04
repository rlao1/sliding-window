package com.example.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static com.example.slidingwindow.SlidingWindow.CountGoodSubstrings;

class SlidingWindowTest {

    @Test
    public void shouldTestCountGoodSubstrings() {
        String test = "aababcabc";
        Assertions.assertEquals(4, CountGoodSubstrings(test));
    }

    @Test
    public void shouldTestCountGoodSubstringsAgain() {
        String test = "oopoop";
        Assertions.assertEquals(0, CountGoodSubstrings(test));
    }

    @org.junit.jupiter.api.Test
    void countGoodSubstrings() {
    }
}