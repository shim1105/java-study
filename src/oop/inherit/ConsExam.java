package oop.inherit;

import java.util.Scanner;

class Book{
	String name;
	Book(String name){
		this.name=name;
	}
	Book(){
		this("자바의 정석");
	}
	
}
public class ConsExam extends Book{
	ConsExam(){
		super();
	}
	public static void main(String[] args) {
		ConsExam ce= new ConsExam();
		System.out.println(ce.name);
		
		
		}
}
