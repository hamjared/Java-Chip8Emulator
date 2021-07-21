package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

/**
 * @author Jared
 * <p>
 * Implemenataion of the Jump to memory address OpCode for the chip-8 emulator. 
 * This op code has the value 0x1NNN - Where NNN is the memory address to jump to
 *
 */
public class ReturnOpCode extends OpCode {

	/**
	 * Sets the program counter equal to the last 12 bits of the OpCode
	 * Op Code should resemble 0x1NNN where NNN is memory address to jump to. 
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		chip8.setPC(chip8.stackPop()); 
	}

}
