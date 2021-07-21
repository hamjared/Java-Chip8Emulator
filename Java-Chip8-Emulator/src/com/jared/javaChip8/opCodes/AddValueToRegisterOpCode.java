package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

/**
 * @author Jared
 *
 */
public class AddValueToRegisterOpCode extends OpCode {

	/**
	 * OpCode Resembles 0x7XNN where X is the register and NN is the value to add to the register 
	 * Rx = Rx + NN
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		byte register = (byte) ((opCode & 0x0F00) >> 8);
		byte value = (byte) ((opCode & 0x00FF));
		
		chip8.setRegister(register, (byte) (chip8.getRegister(register) + value));

	}

}
