package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

public class SetRegisterEqualToOtherRegisterOpCode extends OpCode {

	/**
	 * OpCode: 0xXY0 Where X and Y are both registers
	 * Rx = Ry
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		byte registerX = (byte) ((opCode & 0x0F00) >> 8);
		byte registerY = (byte) ((opCode & 0x00F0) >> 4);
		
		chip8.setRegister(registerX, chip8.getRegister(registerY));
	}

}
