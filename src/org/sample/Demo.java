package org.sample;

//child
public class Demo extends Project {

	public Demo() {
		this(435345);
		System.out.println("Non-Parameterized constructor");
	}

	public Demo(int id) {
        
		System.out.println("int Parameterized constructor");
		System.out.println("employee id:" + id);
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();

	}

}
