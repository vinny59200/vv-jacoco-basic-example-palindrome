package com.vv.jacoco.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PalindromeTest {
    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }


    @Test
    public void whenNotEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("123321"));
    }
}
