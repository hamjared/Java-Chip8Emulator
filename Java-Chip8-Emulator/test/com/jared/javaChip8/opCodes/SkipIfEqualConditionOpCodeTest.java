package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jared.javaChip8.Chip8;

public class SkipIfEqualConditionOpCodeTest {

	@Test
	public void testExecute() {
		Chip8 chip8 = new Chip8();
		chip8.setPC((short) 0x200); 
		chip8.setRegister((byte)0x1, (byte)0x50);
		OpCode oc = new SkipIfEqualConditionOpCode();
		oc.execute((short) 0x3150, chip8);
		assertEquals(0x200 + 2, chip8.getPC());
		
		oc.execute((short) 0x3149, chip8);
		assertEquals(0x200 + 2, chip8.getPC());
		
	}

}
