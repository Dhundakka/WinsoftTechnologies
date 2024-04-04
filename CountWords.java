import java.util.*;
class CountWords{


	public static void main(String[] args) {
		
       String words = "Hi my name is sheetal";

       String arr [] = words.split(" ");

       HashMap<Integer,String> map = new HashMap<Integer,String>();
      
       int ct = 1;

       for (String word : arr) {
       	   
       	   map.put(ct++,word);
       }

       int wordcount = 0;

       for (Map.Entry<Integer,String> entry : map.entrySet() ) {
       	   
           wordcount++;
       }
      System.out.println("Total word count is : "+wordcount);

	}
}
