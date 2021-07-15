package com.jared.javaChip8;

import java.util.HashMap;
import java.util.Map;

import com.jared.javaChip8.opCodes.ClearScreenOpCode;
import com.jared.javaChip8.opCodes.ReturnOpCode;

public abstract class OpCode {
	
	public Map<Short, OpCode> opcodeMap = OpCode.getOpCodes();
	
	public abstract void execute(short opCode, Chip8 chip8);

	public static Map<Short, OpCode> getOpCodes() {
		// TODO Complete getOpCodes with the following logic
		Map<Short, OpCode> map = new HashMap<>();
		map.put((short) 0x00E0, new ClearScreenOpCode());
		map.put((short) 0x00EE, new ReturnOpCode());
		
		return null;
	}

}
