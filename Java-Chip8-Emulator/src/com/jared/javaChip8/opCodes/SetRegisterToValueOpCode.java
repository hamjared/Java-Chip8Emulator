package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

public class SetRegisterToValueOpCode extends OpCode {

	@Override
	public void execute(short opCode, Chip8 chip8) {
		byte register = (byte) ((opCode & 0x0F00) >> 8);
		byte value = (byte) ((opCode & 0x00FF));
		
		chip8.setRegister(register, value);
	}

}
