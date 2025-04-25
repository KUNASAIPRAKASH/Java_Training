package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Prakash", 25),
				new Person("sai", 23)
				);
		
		
		List<String> adultNames=people.stream()
				.filter(p -> p.getAge() >= 21)
				.map(p->p.getName().toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		adultNames.forEach(System.out::println);

		boolean age25=people.stream().anyMatch(p->p.getAge()==25);
		
		System.out.println("is anyone exactly 25? "+age25);
		
	}

}
