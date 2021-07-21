package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

public class SkipIfRegistersEqualConditionalOpCode extends OpCode {

	/**
	 *
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		byte reg1 = (byte) ((opCode & 0x0F00) >> 8);
		byte reg2 = (byte) ((opCode & 0x00F0) >> 8);
		if( chip8.getRegister(reg1) == chip8.getRegister(reg2)) {
			chip8.skipNextInstruction();
		}

	}

}
