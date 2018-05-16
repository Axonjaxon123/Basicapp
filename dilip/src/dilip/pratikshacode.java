package dilip;

import java.util.Scanner;

public class pratikshacode {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a name");
	String s1 = s.nextLine();
	 char[] a=s1.toCharArray();
	 for(int i=0; i<a.length; i++)
	 {
	    for(int j=i+1; j<a.length; j++)

	    	if(a[i]==a[j])
		 {	 
			 System.out.println("the duplicate char:"+a[i]);
			 s.close();
			 
			 }
	 }
}
}
