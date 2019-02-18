package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome {
	public static void main(String[] args) {
		System.out.println("난 누군가...");
		Print p =new Print();
		p.printString("abc");
		PrintSome ps = new Print();
		Animal a=new Animal();
		a.run();
		
	}

	@Override
	public void printString(String str) {
		System.out.println(str);		
	}

	@Override
	public void printChar(char c) {
		System.out.println(c);		
	}

	@Override
	public void printInt(int num) {
		System.out.println(num);		
	}
}
