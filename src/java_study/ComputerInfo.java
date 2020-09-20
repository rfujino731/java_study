package java_study;

class Computer {
	public String os;
	public int memory;
	public int storage;	
}

public class ComputerInfo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer desktop = new Computer();
		desktop.os = "Windows 10";
		desktop.memory = 4;
		desktop.storage = 250;
		
		System.out.println("OS: " + desktop.os);
		System.out.println("memory: " + desktop.memory + "GB");
		System.out.println("storage: " + desktop.storage + "GB");
		
		Computer desktop2 = desktop;
		//desktop2は、すでに生成されているdesktopインスタンスを参照している		
		
		desktop2.os = "Ubuntu";
		System.out.println("\nOS: " + desktop.os);
		System.out.println("memory: " + desktop.memory + "GB");
		System.out.println("storage: " + desktop.storage + "GB");
		
		System.out.println("\nOS: " + desktop.os);
		System.out.println("memory: " + desktop.memory + "GB");
		System.out.println("storage: " + desktop.storage + "GB");
		
	}

}
