package org.sample;

//parent
public class Project {

	public Project() {

		System.out.println("parent Non-Parameterized constructor");
	}

	public Project(String name) {
		System.out.println("parent Parameterized constructor");
		System.out.println("employee name:" + name);
	}

}
