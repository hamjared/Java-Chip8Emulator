package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class GotoOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.setPC((short) 0x200);
		OpCode oc = new GotoOpCode();
		oc.execute((short) 0x1453, chip8);
		assertEquals(0x453, chip8.getPC());
	}

}
