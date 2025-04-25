package com.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try(FileReader reader=new FileReader("oops_practice.txt")) {
			int charc;
			while((charc=reader.read())!=-1) {
				System.out.println((char)charc);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error: File not found - "+e.getMessage());
		} catch (IOException e1) {
			System.out.println("Error reading file-"+e1.getMessage());
		}
	}
	
}
