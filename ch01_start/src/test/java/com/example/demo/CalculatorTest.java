package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void sumTest() {
		Calculator c =new Calculator();
		int result =c.sum(20, 30);
		
		assertEquals(40,result);
		
		System.out.println("정상입니다.");
		
	}
}
