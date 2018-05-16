package dilip;

public class Dilip1 {
	 
		void m1(int i) throws DilipNotFoundException
		 {
			 if(i<56)
			 {
				 throw new  DilipNotFoundException(i);
			 }
			 else
			 {
				 System.out.println("Dilip is here");
			 }
			 
		 }
		 public static void main(String[] args)  {
			 Dilip1 d= new Dilip1();
			 try {
				d.m1(100);
			} catch (DilipNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
