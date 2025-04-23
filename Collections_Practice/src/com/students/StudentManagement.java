package com.students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentManagement {

	public static void main(String[] args) {
		
		List<String> students= new ArrayList<>();
		students.add("prakash");
		students.add("sai");
		
		
		System.out.println("Student List: "+students);
		
		
		Set<String> courses= new HashSet<>();
		courses.add("Java");
		courses.add("python");
		courses.add("DSA");
		
		
		System.out.println("Available courses: "+courses);
		
		
		Map<String,Map<String,String>> studentGrades=new HashMap<>();
		
		
		Map<String, String> prakashGrades=new  HashMap<>();
		
		prakashGrades.put("Java", "A");
		prakashGrades.put("Python","B");
		prakashGrades.put("DSA", "A");
		
		studentGrades.put("Prakash", prakashGrades);
		
		Map<String, String> saiGrades=new HashMap<>();
		saiGrades.put("Java", "C");
		saiGrades.put("Python", "A");
		saiGrades.put("DSA", "D");
		
		studentGrades.put("sai", saiGrades);
		
		for(String student:studentGrades.keySet()) {
			System.out.println("\nGrades for "+student+":");
			Map<String,String> grades=studentGrades.get(student);
			for(String sub:grades.keySet()) {
				System.out.println(sub+"->"+grades.get(sub));
			}
		}
		
		
	}
	
	
	
	
}
