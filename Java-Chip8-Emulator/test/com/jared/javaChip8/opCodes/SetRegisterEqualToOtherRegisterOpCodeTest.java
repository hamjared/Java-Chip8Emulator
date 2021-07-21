package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class SetRegisterEqualToOtherRegisterOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.setRegister((byte) 0x6, (byte) 13);
		OpCode oc = new SetRegisterEqualToOtherRegisterOpCode();
		oc.execute((short) 0x8560, chip8);
		assertEquals(chip8.getRegister((byte) 0x6), chip8.getRegister((byte) 0x5));
	}

}
