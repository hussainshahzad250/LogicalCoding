package com.cantech.java8Feature;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {

//		1. FIRST WAY
		InputStream in = new FileInputStream(new File("abc.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuilder out = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			out.append(line);			
		}		
		System.out.println(out.toString());
		reader.close();
		
//		2. SECOND WAY
		System.out.println();
		System.out.println("SECOND WAY TO PRINT FILE DATA");
		FileReader fileReader = new FileReader(new File("abc.txt"));
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line1;
		while((line1=bufferedReader.readLine()) !=null){
			System.out.println(line1);
		}
		bufferedReader.close();
	}

}
