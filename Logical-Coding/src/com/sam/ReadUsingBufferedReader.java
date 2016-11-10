package com.sam;
import java.io.*;
public class ReadUsingBufferedReader 
{
	public static void main(String[] args) 
	{
		System.out.println("Reading File with BufferedReader class");
		String fileName="test.text";
		try
		{
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;
			while ((line = bufferReader.readLine()) != null)   
			{
				System.out.println("File Line is: " + line);
			}
			bufferReader.close();
		}
		catch(Exception e)
		{
			System.out.println("Error in reading file:" + e.getMessage());                  
		}
	}
}