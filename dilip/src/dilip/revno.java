package dilip;

public class revno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123, rem,r = 0,r1=0,r2=0;
		/*while(n>0)
		{
			rem=n%10;
			
			r=r*10+rem;
			
			System.out.print(r);
			n=n/10;
			System.out.println(n);
			
		}
		//System.out.println(r);
*/		
		{
			rem=n%10;
			r=rem*100;
			n=n/10;
			System.out.println(r);
			
			r1=(n%10);
			n=n/10;
			System.out.println(r1);
			r2=(n%10)*10;
			System.out.println(r2);
			System.out.println(r+r1+r2);
		}
	}

}
