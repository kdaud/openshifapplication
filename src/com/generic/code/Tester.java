package com.generic.code;

import java.util.ArrayList;

public class Tester {
	
	static {
		System.out.println("Committer at OpenMRS");
	}
	
	public void printCommitter() {
		Student student[] = new Student[4];
		student[0] = new Student("Gama", "BSS", 4.66);
		student[1] = new Student("Juma", "BBC", 4.74);
		//	student[2]=new Lecturer("Kitumba","System Engineering", 100);
		
		ArrayList<Student> rawList = new ArrayList<>();
		rawList.add(new Student("Duku", "BSN", 3.99));
		//Collections 
		//rawList.add(new Lecturer("Lowu", "Computing & Informatics", 30));
		
	}
	
}
