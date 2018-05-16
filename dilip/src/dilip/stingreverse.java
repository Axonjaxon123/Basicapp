package dilip;

import java.io.IOException;
import java.util.Scanner;

public class stingreverse {
public static void main(String[] args) throws IOException {
	 // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner br= new Scanner(System.in);
      System.out.print("Enter string: ");
      String s = br.nextLine();
      String reverse = "";
      String temp="";
      int length = s.length()-1;

      for (int i = 0;i<=length;i++){
    	  temp+=s.charAt(i);
    	  
    	  if(s.charAt(i)==' '|| (i==length))
    	  {
    		  for(int j=temp.length()-1;j>=0;j--)
    		  {
    			  reverse+=temp.charAt(j);
    			  if(j==0 || (i!=length))
    			  {
    				  reverse= reverse+" ";
    			  }
    			  temp=" ";
    		  }
    		
    	  }

     }
      System.out.println(temp);
}
}
