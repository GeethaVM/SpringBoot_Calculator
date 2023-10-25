package com.calculator.api.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorApiControllerTest {
	
	@InjectMocks
	CalculatorApiController calculatorApiController;
	
	String answer = "answer : ";
	String detail = "detail : ";
	double result;
	double number1 = 80;
	double number2 = 4;
	
	@Test
	public void additionTest() {
		result = number1+number2;
		String actualResult = answer + result + " , " + detail + number1 + " + " + number2 + " = " + result;
		String expectedResult = calculatorApiController.addition(number1, number2);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void subtractionTest() {
		result = number1-number2;
		String actualResult = answer + result + " , " + detail + number1 + " - " + number2 + " = " + result;
		String expectedResult = calculatorApiController.subtraction(number1, number2);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void multiplicationTest() {
		result = number1*number2;
		String actualResult = answer + result + " , " + detail + number1 + " * " + number2 + " = " + result;
		String expectedResult = calculatorApiController.multiplication(number1, number2);
		assertEquals(actualResult, expectedResult);
	}
	@Test
	public void divisionTest() {
		result = number1/number2;
		String actualResult = answer + result + " , " + detail + number1 + " / " + number2 + " = " + result;
		String expectedResult = calculatorApiController.division(number1, number2);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void squareTest() {
		result = number1*number1;
		String actualResult = answer + result + " , " + detail + "Square of " + number1 + " = " + result;
		String expectedResult = calculatorApiController.square(number1);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void squarerootTest() {
		result = Math.sqrt(number1);
		String actualResult = answer + result + " , " + detail + "Squareroot of " + number1 + " = " + result;
		String expectedResult = calculatorApiController.squareroot(number1);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void factorialTest() {
		result = 24;
		String actualResult = answer + result + " , " + detail + 4 + " ! = " + result;
		System.out.println(actualResult);
		String expectedResult = calculatorApiController.factorial((int)number2);
		System.out.println(expectedResult);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void minmaxTest() {
		int minNum = -9;
		int maxNum = 99;
		String actualResult = " min : " + minNum + " , max : " + maxNum;
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(99);
		numbers.add(-3);
		numbers.add(56);
		numbers.add(-9);
		String expectedResult = calculatorApiController.minmax(numbers);
		assertEquals(actualResult, expectedResult);
	}
	
}
