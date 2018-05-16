package dilip;

import java.util.HashMap;

public class stringwituotln {
	  public static void main(String[] args) {
		  HashMap<String,String> varX=new HashMap();
		  varX.put("001", "DM");
		  varX.put("010", "DM");

		  // ...

		  int counter = 0;
		  String countingFor = "DM";
		  for(String key : varX.keySet()) {            // iterate through all the keys in this HashMap
		      if(varX.get(key).equals(countingFor)) {  // if a key maps to the string you need, increment the counter
		          counter++;
		      }
		  }
		  System.out.println(countingFor + ":" + counter);
}}