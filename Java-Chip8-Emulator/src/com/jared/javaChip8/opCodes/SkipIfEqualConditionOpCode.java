package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

/**
 * @author Jared
 *
 */
public class SkipIfEqualConditionOpCode extends OpCode {

	/**
	 * opCode should resemble x3XNN
	 * If the value in register x == NN then the program counter is incremented by 2 - skipping the next instruction.
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		byte register = (byte) ((short) (opCode & 0x0F00) >> 8);
		byte value = (byte) (opCode & 0x00FF);
		if(chip8.getRegister(register) == value) {
			chip8.skipNextInstruction();
		}
		

	}

}
