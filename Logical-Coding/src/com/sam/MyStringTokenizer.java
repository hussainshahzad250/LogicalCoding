package com.sam;
import java.util.StringTokenizer; 
public class MyStringTokenizer 
{
    public static void main(String a[])
	{
        String s1 = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(s1);
        while(st.hasMoreElements())
		{
            System.out.println(st.nextElement());
        }
    }
}