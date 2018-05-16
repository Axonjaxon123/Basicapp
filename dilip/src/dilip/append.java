package dilip;

public class append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hi jab";
		char c[]=s.toCharArray();
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<c.length;i++)
		{
			if(s.charAt(i)!=' ')
			{
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
	}

}
