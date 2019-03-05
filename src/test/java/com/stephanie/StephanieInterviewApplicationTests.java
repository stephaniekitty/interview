package com.stephanie;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stephanie.fun.FunForNumber;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StephanieInterviewApplicationTests {

	@Autowired
	FunForNumber funForNumber;
	
	@Test
	public void contextLoads() {
		System.out.println("  === test case ===");
		funForNumber.printFunNumberForStage1();
		
		// If update the method. to change its return value is String type,
		// this testing case could use AssertEquals for verification.		
	}
	
}
