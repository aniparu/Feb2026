package org.sample;

public class Sample {

	public static void main(String[] args)  {
		
		//try,catch,finally
		
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		}catch (Throwable e) {
			e.printStackTrace();
		}finally {
			System.out.println("I'm Finally");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);

		

	}

}
