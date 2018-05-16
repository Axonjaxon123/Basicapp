package dilip;

import java.util.Scanner;

public class pratiksha2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a name");
	String s1 = s.nextLine();

	 
	 for(char i='a'; i<='z'; i++)
     { int count=0;
         for(int j=0; j<s1.length(); j++)
         {
         	char  ch=s1.charAt(j); 
             if(ch==i) 
                 count++; 
             
         }
         if(count!=0)
         {
            System.out.println(i+"  "+count);
         }
         count = 0;
     }

	 
}
}
