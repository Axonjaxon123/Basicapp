package dilip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringreverse2 {
	
	public static void main(String[] args) throws IOException {
	/*	String eString=" \"This is the one\"";
		String double_quoteString[]=eString.split("\"");
		eString=double_quoteString[1];
		String[] splitStrings=eString.split("\\s+");
		String reverse="";
		for(int i=0;i<splitStrings.length;i++)
		{
		    if(i!=0)
		    reverse+=" ";

		    for(int j=splitStrings[i].length()-1;j>=0;j--)
		    {
		        reverse+=splitStrings[i].charAt(j);
		    }
		}

		reverse="\""+reverse+"\"";
		System.out.println("reverse is "+reverse);*/
		String eString=" \"This is the one\"";
		String double_quoteString[]=eString.split("\"");
		eString=double_quoteString[1];
		String[] splitStrings=eString.split("\\s+");
		String reverse="";
		for(int i=0;i<splitStrings.length;i++)
		{
		    if(i!=0)
		    reverse+=" ";

		    for(int j=splitStrings[i].length()-1;j>=0;j--)
		    {
		        reverse+=splitStrings[i].charAt(j);
		    }
		}

		reverse="\""+reverse+"\"";
		System.out.println("reverse is "+reverse);
	}

}
