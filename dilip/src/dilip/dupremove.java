package dilip;

import java.util.ArrayList;
import java.util.Arrays;

public class dupremove {
	public static void main(String[] args) {
		String s="narendra";
	
	//	char ch=s.toCharArray();
		
		/*for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]);
			if(c[i]=='n' ||c[i]=='a' || c[i]=='r' )
			{
				continue;
			}
		
		
		}*/
		int count=0;
		 for(char i='a'; i<='z'; i++)
         {
             for(int j=0; j<s.length(); j++)
             {
             	char  ch=s.charAt(j); 
                 if(ch==i) 
                     count++; 
                
             }
            
            if(count==1)
             {
                 System.out.println(i+"  ");
             }
             count = 0;
           
             
         }
		
		//ArrayList l=new ArrayList(Arrays.asList(c));
	//	l.add("10");
		//System.out.println(l);
		 String s1="babaacde";
		 int a=s1.indexOf("b");
		 System.out.println(a);
		 int a1=IndexOfSecond(s1,"b                                                                                                                                                                                                                                                                                                                                                                                                                     ");
		 System.out.println(a1);
	}

	private static int IndexOfSecond(String s1, String s2) {
		// TODO Auto-generated method stub
		int a=s1.indexOf(s2);
		if(a==-1)
		{
			return -1;
		}
		return s1.indexOf(s2,a+1);
		
	}

}
