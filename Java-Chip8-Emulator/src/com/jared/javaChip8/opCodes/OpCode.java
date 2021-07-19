package com.jared.javaChip8.opCodes;

import java.util.HashMap;
import java.util.Map;

import com.jared.javaChip8.Chip8;

public abstract class OpCode {
	
	public static Map<Short, OpCode> opcodeMap = OpCode.getOpCodes();
	
	public abstract void execute(short opCode, Chip8 chip8);
	
	public static OpCode decodeOpCode(short opCode) {
		short msb = (short) (opCode & 0xF000);
		short key;
		switch(msb) {
		case 0x0000:
			key = (short) (opCode & 0xF0FF);
			break;
		case (short) 0x8000:
			key = (short) (opCode & 0xF00F);
			break;
		case (short) 0xE000:
			key = (short) (opCode & 0xF0FF);
			break;
		case (short) 0xF000:
			key = (short) (opCode & 0xF0FF);
			break;
		default:
			key = msb;
			break;
		}
		
		return opcodeMap.get(key);
		
	}

	public static Map<Short, OpCode> getOpCodes() {
		Map<Short, OpCode> map = new HashMap<>();
		map.put((short) 0x00E0, new ClearScreenOpCode()); 
		map.put((short) 0x00EE, new ReturnOpCode());
		map.put((short) 0x1000, new GotoOpCode());
		map.put((short) 0x2000, new CallSubroutineOpCode());
		map.put((short) 0x3000, new SkipIfEqualConditionOpCode());
		map.put((short) 0x4000, new SkipIfNotEqualConditionOpCode());
		map.put((short) 0x5000, new SkipIfRegistersEqualConditionalOpCode());
		map.put((short) 0x6000, new SetRegisterToValueOpCode());
		map.put((short) 0x7000, new AddValueToRegisterOpCode());
		map.put((short) 0x8000, new SetRegisterEqualToOtherRegisterOpCode());
		map.put((short) 0x8001, new SetRegisterEqualtoBitWiseOrOfOtherRegisterOpCode());
		map.put((short) 0x8002, new SetRegisterEqualtoBitWiseAndOfOtherRegisterOpCode());
		map.put((short) 0x8003, new SetRegisterEqualtoBitWiseExclusiveOrOfOtherRegisterOpCode());
		map.put((short) 0x8004, new AddTwoRegistersOpCode());
		map.put((short) 0x8005, new SubtractRegisterYFromXOpCode());
		map.put((short) 0x8006, new RightShiftRegisterOpCode());
		map.put((short) 0x8007, new SubtractRegisterXFromYOpCode());
		map.put((short) 0x800E, new LeftShiftRegisterOpCode());
		map.put((short) 0x9000, new SkipIfRegisterXNotEqualYOpCode());
		map.put((short) 0xA000, new SetMemAccessRegisterOpCode());
		map.put((short) 0xB000, new JumpToAddressOpCode());
		map.put((short) 0xC000, new SetRegisterToRandomNumberOpCode());
		map.put((short) 0xD000, new DrawSpriteOpCode());
		map.put((short) 0xE09E, new SkipIfKeyPressOpCode());
		map.put((short) 0xE0A1, new SkipIfKeyNotPressOpCode());
		map.put((short) 0xF007, new SetRegisterToValueOfDelayTimerOpCode());
		map.put((short) 0xF00A, new WaitForKeyPressOpCode());
		map.put((short) 0xF015, new SetValueOfDelayTimeOpCode());
		map.put((short) 0xF018, new SetValueOfSoundTimeOpCode());
		map.put((short) 0xF01E, new AddRegisterToMemAccessRegisterOpCode());
		map.put((short) 0xF029, new SetMemAccessRegisterToFontCharacterLocationOpCode());
		map.put((short) 0xF033, new StoreBinaryCodedDecimalOfRegisterInMemAccessRegister());
		map.put((short) 0xF055, new DumpRegistersToMemoryOpCode());
		map.put((short) 0xF065, new LoadRegistersFromMemoryOpCode());
		
		return map;
	}

}
