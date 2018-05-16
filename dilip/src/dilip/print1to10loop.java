package dilip;

public class print1to10loop {
public static void main(String[] args) {
	 print1to10loop p= new print1to10loop();
	 p.print(1);
}

private void print(int i) {
	// TODO Auto-generated method stub
	if(i<=10)
	{
		System.out.println(i);
		print(i+1);
	}
}
}
