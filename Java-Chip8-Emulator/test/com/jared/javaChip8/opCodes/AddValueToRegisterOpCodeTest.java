package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class AddValueToRegisterOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.setRegister((byte) 0x4, (byte) 10);
		OpCode oc = new AddValueToRegisterOpCode();
		oc.execute((short) 0x7453, chip8);
		assertEquals(10 + 0x0053, chip8.getRegister((byte) 0x4));
	}

}
