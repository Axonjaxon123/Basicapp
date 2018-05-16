package dilip;

public class missingno {

	public static void main(String[] args) {
		
		int a[]={2,4,8};
		
		int n=a.length+1;
		int sum=n*(n+1)/2;
		
		int rsum=0;
		for(int i=0;i<a.length;i++)
		{
			rsum+=a[i];
		}
		int mis=sum-rsum;
		System.out.println(mis);
	}
}
