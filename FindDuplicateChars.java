class FindDuplicateChars{

	public static void main(String[] args) {
	    
       String str = "vaishnavi";

      findDupChars(str);
	}
	public static void findDupChars(String str){

		for (int i=0; i<str.length()-1; i++) {
			
			int count =1;
			for (int j=i+1; j<str.length(); j++) {
				
				if (str.charAt(i)==str.charAt(j)) {
				  
				   count++;
				   break;
				}
			}
          if (count>1) {
          	 
          	 System.out.println(str.charAt(i));
          }
		}
	}
}
