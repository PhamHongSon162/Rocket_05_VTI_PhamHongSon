package backend;

import entity.CPU;

public class Question1ex3 {
	public void question1() {

		CPU cpu = new CPU(100);
		CPU.Ram ram = cpu.new Ram(8, "ASUS");
		CPU.Processor processor = cpu.new Processor(8, "Dell");

		
		System.out.println(ram.getClockSpeed());
		System.out.println(processor.getCache());
	}
}
