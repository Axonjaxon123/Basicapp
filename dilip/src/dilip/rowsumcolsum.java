package dilip;

public class rowsumcolsum {
	public static void main(String[] args) {
		int [][]a= { {7, 2, 10, 4, 3},
                {14, 3, 5, 9, 16},
                {99, 12, 37, 4, 2},
                {8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17} };
		int r=0,c,rsum=0,csum=0;
		
		for( c=0;c<5;c++)
		{
			for(r=0;r<5;r++)
			{rsum+=a[c][r];//if we replace r and c we ll get cols sum
				//System.out.format("%4d", + rsum);
		//	System.out.print(rsum+" ");
			}
			
	System.out.println(rsum);
			rsum=0;
		}
		
	}

}
