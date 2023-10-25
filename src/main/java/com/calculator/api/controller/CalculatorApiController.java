package com.calculator.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculatorApi/v1")
public class CalculatorApiController {

	String response;
	double result;
	String answer = "answer : ";
	String detail = "detail : ";

	@GetMapping("/addition")
	public String addition(@RequestParam double number1, @RequestParam double number2) {
		result = number1 + number2;
		response = answer + result + " , " + detail + number1 + " + " + number2 + " = " + result;
		return response;
	}

	@GetMapping("/subtraction")
	public String subtraction(@RequestParam double number1, @RequestParam double number2) {
		result = number1 - number2;
		response = answer + result + " , " + detail + number1 + " - " + number2 + " = " + result;
		return response;
	}

	@GetMapping("/multiplication")
	public String multiplication(@RequestParam double number1, @RequestParam double number2) {
		result = number1 * number2;
		response = answer + result + " , " + detail + number1 + " * " + number2 + " = " + result;
		return response;
	}

	@GetMapping("/division")
	public String division(@RequestParam double number1, @RequestParam double number2) {
		result = number1 / number2;
		response = answer + result + " , " + detail + number1 + " / " + number2 + " = " + result;
		return response;
	}

	@GetMapping("/square/{number}")
	public String square(@PathVariable double number) {
		result = number * number;
		response = answer + result + " , " + detail + "Square of " + number + " = " + result;
		return response;
	}

	@GetMapping("/squareroot/{number}")
	public String squareroot(@PathVariable double number) {
		result = Math.sqrt(number);
		response = answer + result + " , " + detail + "Squareroot of " + number + " = " + result;
		return response;
	}

	@GetMapping("/factorial/{number}")
	public String factorial(@PathVariable int number) {

		result = 1;

		for (int i = 1; i <= number; i++) {
			result *= i;
		}

		response = answer + result + " , " + detail + number + " ! = " + result;
		return response;
	}

	@PostMapping("/min-max")
	public String minmax(@RequestBody List<Integer> numbers) {

		int minNum = numbers.get(0);
		int maxNum = numbers.get(0);
		int i;

		for (i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > maxNum) {
				maxNum = numbers.get(i);
			}
			if (numbers.get(i) < minNum) {
				minNum = numbers.get(i);
			}
		}

		response = " min : " + minNum + " , max : " + maxNum;
		return response;
	}

}
