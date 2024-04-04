import java.util.*;
class MergeArray{
	public static void main(String[] args) {
		
		int [] x = {0,2,0,3,0,5,6,0,0};
                int y [] = {1,8,9,10,15};
		System.out.println(Arrays.toString(mergeArr(x,y)));
	}
	public static int [] mergeArr(int x [], int y []){
		int m = x.length;
		int ind = 0;  // pointer to fetch the elements of y
   
		
		// For merging the two array
               for (int i=0; i<m; i++) {
		       if (x[i]==0) {
		       	       x[i] = y[ind++];
		       }
	       }
    
	
	// For sorting the merged array

               for (int i=0; i<m-1; i++) {
		       for (int j=i+1; j<m; j++) {
			       if (x[i]>x[j]) {
				       int temp = x[i];
				       x[i] = x[j];
       	  	  	               x[j] = temp;
			      } 
		       }
	       }
	       return x;
	}
}
