package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class SetRegisterToValueOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.setPC((short) 0x200);
		OpCode oc = new SetRegisterToValueOpCode();
		oc.execute((short) 0x6453, chip8);
		assertEquals(0x0053, chip8.getRegister((byte) 0x4));
	}

}
