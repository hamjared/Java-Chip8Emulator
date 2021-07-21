package com.jared.javaChip8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayDeque;
import java.util.Deque;

import com.jared.javaChip8.opCodes.OpCode;

public class Chip8 {
	
	private static short STARTING_ADDRESS = 0x200;
	
	private short pc;
	private short I; // memory access address register
	private short opCode;
	private byte[] registers;
	private Deque<Short> stack;
	private byte[] memory;
	
	public Chip8() {
		registers = new byte[16];
		stack = new ArrayDeque<Short>(12);
		memory = new byte[4096];
		pc = 0;
		I = 0;
		opCode = 0;
		
	}
	
	public void loadRom(String fileName) throws FailedToLoadRomException {
		File file = new File(fileName);
		byte[] fileContents;
		try {
			fileContents = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Failed to read rom at " + fileName);
			throw new FailedToLoadRomException();
		}
		
		System.arraycopy(fileContents, 0, memory, STARTING_ADDRESS, fileContents.length);
	}

	public void run() {
		while(true) {
			emulateCycle();
		}

	}
	
	public void setRegister(byte register, byte value) {
		registers[register] = value;
	}
	
	public byte getRegister(byte register) {
		return registers[register];
	}
	
	public short stackPop() {
		return stack.pop();
	}
	
	public void setMemory(short address, byte value) {
		memory[address] = value;
	}
	
	public byte readMemory(short address) {
		return memory[address];
	}
	
	public void stackPush(short value) {
		stack.push(value);
	}
	
	public void skipNextInstruction() {
		pc += 2;
	}
	
	public void setPC(short value) {
		pc = value;
	}
	
	public short getPC() {
		return pc;
	}
	
	private void fetchOpCode() {
		opCode = (short) ((memory[pc] << 8 ) | memory[pc+1]);
		pc += 2;		
	}
	
	private void emulateCycle() {
		fetchOpCode();
		OpCode.decodeOpCode(opCode).execute(opCode, this);;
	}

	public static void main(String[] args) {
		Chip8 chip8 = new Chip8();
		chip8.run();

	}

}
