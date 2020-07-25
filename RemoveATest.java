package com.epam.junit.tdd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveATest {

	/* TODO list for my feature (Removing 'A' if it is present in first 2 characters of the string) 
	 * 1.'A' present at the first index of the string  :   ABCD => BCD
	 * 2.Two A's present in first 2 characters  :   AACD => CD
	 * 3.'A' present at the second index of the string  :   BACD => BCD
	 * 4.No A's present in the first two characters of the string  :  BBAA => BBAA
	 * 5.String of length n characters :  AABBA =>BBA
	 */
	RemoveCharA removeAChar;
	
	@BeforeEach
	void setUp() {
	removeAChar = new RemoveCharA();
		
	}

	@Test
	void testAtFirstIndex() {
			assertEquals("BCD",removeAChar.remove("ABCD"));
	}
	
	
	@Test
	void testAtTwoIndexes() {
			assertEquals("CD",removeAChar.remove("AACD"));
	}
	
	@Test
	void testAtSecondIndex() {
		assertEquals("BCD",removeAChar.remove("BACD"));
	}
	
	@Test
	void testForNoA() {
		assertEquals("BBAA",removeAChar.remove("BBAA"));
	}
	
	@Test
	void testForNChars() {
		assertEquals("BBA",removeAChar.remove("AABBA"));
	}

}