package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

/**
 * @author Jared
 * <p>
 *
 */
public class GotoOpCode extends OpCode {

	/**
	 * Opcode resembles 0x1NNN where NNN is the memory address to jump to 
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		chip8.setPC((short) (opCode & 0x0FFF));
	}

}
