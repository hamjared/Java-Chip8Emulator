package com.jared.javaChip8.opCodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class OpCodeTest {

	@Test
	public void testClearScreenOpCode() {
		OpCode oc = OpCode.decodeOpCode((short) 0x00E0);
		assertTrue(oc instanceof ClearScreenOpCode);
	}
	
	@Test
	public void testReturnOpCode() {
		OpCode oc = OpCode.decodeOpCode((short) 0x00EE);
		assertTrue(oc instanceof ReturnOpCode);
		
	}
	
	@Test
	public void testGotoOpCode() {
		OpCode oc = OpCode.decodeOpCode((short) 0x1EAB);
		assertTrue(oc instanceof GotoOpCode);
	}
	
	@Test
	public void testCallOpCode() {
		OpCode oc = OpCode.decodeOpCode((short) 0x2EAB);
		assertTrue(oc instanceof CallSubroutineOpCode);
	}
	
	@Test
	public void testSkipNextInstructioRegisterEqualsValue() {
		OpCode oc = OpCode.decodeOpCode((short) 0x3210);
		assertTrue(oc instanceof SkipIfEqualConditionOpCode);
	}
	
	@Test
	public void testSkipNextInstructioRegisterNotEqualsValue() {
		OpCode oc = OpCode.decodeOpCode((short) 0x4210);
		assertTrue(oc instanceof SkipIfNotEqualConditionOpCode);
	}
	
	@Test
	public void testSkipIfRegistersEqual() {
		OpCode oc = OpCode.decodeOpCode((short) 0x5210);
		assertTrue(oc instanceof SkipIfRegistersEqualConditionalOpCode);
	}
	
	@Test
	public void testSetRegisterToValue() {
		OpCode oc = OpCode.decodeOpCode((short) 0x6210);
		assertTrue(oc instanceof SetRegisterToValueOpCode);
	}
	
	@Test
	public void testAddValueToRegister() {
		OpCode oc = OpCode.decodeOpCode((short) 0x7210);
		assertTrue(oc instanceof AddValueToRegisterOpCode);
	}
	
	@Test
	public void testSetRegisterValueToAnotherRegister() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8210);
		assertTrue(oc instanceof SetRegisterEqualToOtherRegisterOpCode);
	}
	
	@Test
	public void testSetRegisterValueToAnotherRegisterBitWiseOr() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8211);
		assertTrue(oc instanceof SetRegisterEqualtoBitWiseOrOfOtherRegisterOpCode);
	}

	@Test
	public void testSetRegisterValueToAnotherRegisterBitWiseAnd() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8212);
		assertTrue(oc instanceof SetRegisterEqualtoBitWiseAndOfOtherRegisterOpCode);
	}

	@Test
	public void testSetRegisterValueToAnotherRegisterBitWiseExclusiveOr() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8213);
		assertTrue(oc instanceof SetRegisterEqualtoBitWiseExclusiveOrOfOtherRegisterOpCode);
	}
	
	@Test
	public void testAddRegisterToAnother() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8214);
		assertTrue(oc instanceof AddTwoRegistersOpCode);
	}
	
	@Test
	public void testSubtractRegisterFromAnother() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8215);
		assertTrue(oc instanceof SubtractRegisterYFromXOpCode);
	}
	
	@Test
	public void testRightShift() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8216);
		assertTrue(oc instanceof RightShiftRegisterOpCode);
	}
	
	@Test
	public void testSubtractXFromY() {
		OpCode oc = OpCode.decodeOpCode((short) 0x8217);
		assertTrue(oc instanceof SubtractRegisterXFromYOpCode);
	}
	
	@Test
	public void testLeftShift() {
		OpCode oc = OpCode.decodeOpCode((short) 0x821E);
		assertTrue(oc instanceof LeftShiftRegisterOpCode);
	}
	
	@Test
	public void testSkipIfRegistersNotEqual() {
		OpCode oc = OpCode.decodeOpCode((short) 0x9340);
		assertTrue(oc instanceof SkipIfRegisterXNotEqualYOpCode);
	}
	
	@Test
	public void testSetMemAccessRegister() {
		OpCode oc = OpCode.decodeOpCode((short) 0xA123);
		assertTrue(oc instanceof SetMemAccessRegisterOpCode);
	}
	
	@Test
	public void testJumpToAddress() {
		OpCode oc = OpCode.decodeOpCode((short) 0xB123);
		assertTrue(oc instanceof JumpToAddressOpCode);
	}
	
	@Test
	public void testRandomNumber() {
		OpCode oc = OpCode.decodeOpCode((short) 0xC123);
		assertTrue(oc instanceof SetRegisterToRandomNumberOpCode);
	}
	
	@Test
	public void testDrawsprite() {
		OpCode oc = OpCode.decodeOpCode((short) 0xD123);
		assertTrue(oc instanceof DrawSpriteOpCode);
	}
	
	@Test
	public void testSkipIfKeyPressed() {
		OpCode oc = OpCode.decodeOpCode((short) 0xE19E);
		assertTrue(oc instanceof SkipIfKeyPressOpCode);
	}
	
	@Test
	public void testSkipIfKeyNotPressed() {
		OpCode oc = OpCode.decodeOpCode((short) 0xE1A1);
		assertTrue(oc instanceof SkipIfKeyNotPressOpCode);
	}
	
	@Test
	public void testSetRegisterToDelayTimer() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF207);
		assertTrue(oc instanceof SetRegisterToValueOfDelayTimerOpCode);
	}
	
	@Test
	public void testWaitForKeyPress() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF20A);
		assertTrue(oc instanceof WaitForKeyPressOpCode);
	}
	
	@Test
	public void testSetDelayTimer() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF215);
		assertTrue(oc instanceof SetValueOfDelayTimeOpCode);
	}
	
	@Test
	public void testSetSoundTimer() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF218);
		assertTrue(oc instanceof SetValueOfSoundTimeOpCode);
	}
	
	@Test
	public void testAddRegisterToMemAccessRegister() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF21E);
		assertTrue(oc instanceof AddRegisterToMemAccessRegisterOpCode);
	}
	
	@Test
	public void testMemAccessRegisterToCharacter() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF229);
		assertTrue(oc instanceof SetMemAccessRegisterToFontCharacterLocationOpCode);
		
	}
	
	@Test
	public void testBCD() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF233);
		assertTrue(oc instanceof StoreBinaryCodedDecimalOfRegisterInMemAccessRegister);
	}
	
	@Test
	public void testRegisterDump() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF255);
		assertTrue(oc instanceof DumpRegistersToMemoryOpCode);
	}
	
	@Test
	public void testRegisterLoad() {
		OpCode oc = OpCode.decodeOpCode((short) 0xF265);
		assertTrue(oc instanceof LoadRegistersFromMemoryOpCode);
	}
	
	
}
