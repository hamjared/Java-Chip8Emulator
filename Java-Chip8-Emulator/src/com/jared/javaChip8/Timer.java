package com.jared.javaChip8;

public class Timer {
	
	// The time has an initial value of 0, once a value other than 0 is set - the timer counts down 
	// at a rate of 60Hz stopping once the value reaches 0 
	private short value = 0;
	private long timeLastSet = 0L;
	
	public void setTimer(short value) {
		this.value = value;
		this.timeLastSet = System.nanoTime();
	}
	
	public short getTimer() {
		long timePassed = System.nanoTime() - timeLastSet;
		timePassed = timePassed/(1000000000L);
		timePassed = timePassed*60;
		return (short) (value - timePassed > 0 ? value-timePassed : 0);
	}

}
