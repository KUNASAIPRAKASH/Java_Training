package com.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_prac {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Prakash", "Sai", "Kuna", "Prakash");
		List<Integer> age = Arrays.asList(24, 22, 30, 16);

		List<String> filteredNames = names.stream().filter(name -> name.startsWith("S")).map(String::toUpperCase)
				.collect(Collectors.toList());

		List<String> sort = names.stream().sorted().collect(Collectors.toList());

		List<String> unique = names.stream().distinct().collect(Collectors.toList());

		long numOfEle = names.stream().count();
		
		
		List<Integer> adults=age.stream()
				.filter(n->n>=21)
				.collect(Collectors.toList());
		

		System.out.println(filteredNames);
		System.out.println(sort);
		System.out.println(unique);

		System.out.println(numOfEle);
		
		
		System.out.println(adults);
		

	}

}
