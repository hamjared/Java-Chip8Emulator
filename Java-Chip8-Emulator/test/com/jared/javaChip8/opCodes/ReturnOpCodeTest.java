package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class ReturnOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.stackPush((short) 0x300);
		
		OpCode r = new ReturnOpCode();
		r.execute((short) 0x00E0, chip8);
		
		assertEquals(0x300, chip8.getPC());
	}

}
