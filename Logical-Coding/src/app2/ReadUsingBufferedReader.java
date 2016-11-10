package app2;

import java.io.*;

public class ReadUsingBufferedReader {
	public static void main(String[] args) throws IOException {
        System.out.println("Reading File with BufferedReader class");
        //Name of the file
        String fileName="abc.txt";
        try{
        
        //Create object of FileReader
        FileReader inputFile = new FileReader(fileName);
        
        //Instantiate the BufferedReader Class
        BufferedReader bufferReader = new BufferedReader(inputFile);

        //Variable to hold the one line data
        String line;
        
        // Read file line by line and print on the console
        while ((line = bufferReader.readLine()) != null)   
		{
			System.out.println("File Line is: " + line);
        }
        //Close the buffer reader
        bufferReader.close();
        }
		catch(Exception e)
		{
			System.out.println("Error in reading file:" + e.getMessage());                  
        }
}
}