package com.jared.javaChip8.opCodes;

import com.jared.javaChip8.Chip8;

/**
 * @author Jared
 * <p>
 * 
 *
 *
 */
public class CallSubroutineOpCode extends OpCode {

	/**
	 * Op code should have the form 0x2NNN where nnn is the location of the subroutine in memory
	 * Calls subroutine at NNN by pushing the current pc onto the stack and updating the pc to NNN
	 */
	@Override
	public void execute(short opCode, Chip8 chip8) {
		chip8.stackPush(chip8.getPC());
		short memAddress = (short) (opCode & 0x0FFF);
		chip8.setPC(memAddress);

	}

}
