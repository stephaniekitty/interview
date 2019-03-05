package com.stephanie.fun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FunForNumber implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		printFunNumberForStage1();
		printFunNumberForStage2();
	}
	
	public void printFunNumberForStage1() {
		for (int i=1; i<=100; i++) {			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}		
		}
	}
	
	public void printFunNumberForStage2() {
		for (int i=1; i<=100; i++) {				
			if((i%3 == 0 && i%5 == 0) || isContainNum(Integer.toString(i), "3") || isContainNum(Integer.toString(i), "5")) {
				System.out.println("FizzBuzz");
			} else if (i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}		
		}
	}
	

    private static boolean isContainNum(String num, String contain) {
    	boolean isContainNum = false;
    	isContainNum = num.contains(contain);   
    	return isContainNum;
	}

}
