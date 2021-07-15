package com.jared.javaChip8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimerTest {

	@Test
	public void testGetTimer() throws InterruptedException {
		Timer time = new Timer();
		time.setTimer((short) 120);
		Thread.sleep(1000);
		short timerValue = time.getTimer();
		
		assertEquals(60, timerValue);
	}
	
	@Test
	public void testGetTimer2() throws InterruptedException {
		Timer time = new Timer();
		time.setTimer((short) 20);
		Thread.sleep(1000);
		short timerValue = time.getTimer();
		
		assertEquals(0, timerValue);
	}

}
