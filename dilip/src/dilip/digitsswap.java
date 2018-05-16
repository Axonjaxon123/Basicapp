package dilip;

public class digitsswap {
	public static void main(String[] args) {
	    Swapdigits(2413);

	}
	public static void Swapdigits(int number){

	    while(number>0){
	        int y=number/1000;
	        int x=number%10;
	        int original=number-y;
	        System.out.println(original);
	    }
	     System.out.println();
	    }

	}

