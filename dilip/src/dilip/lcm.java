package dilip;

public class lcm {
public static void main(String[] args) {
	lcm l= new lcm();
	System.out.println(l.findLcm(4,6));
}

private int findLcm(int i, int j) {
	// TODO Auto-generated method stub
	int a=(i<j)?i:j;
	while(true)
	{
		if(a%i==0 && a%j==0)
			break;
		a++;
	}
	
	return a;
}
}
