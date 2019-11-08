package sorts;

public class ass2 {
	
	public static void main(String args[]) {		
		int arr[]= {1,5,3,9,7,3,8,4};
		for (int j=0; j<arr.length; j++) {           
            int key=arr[j];
            int i=j-1;
           
            while (i>=0 && arr[i] < key) {
                arr[i+1] = arr[i];
                i= i-1;
                arr[i+1]=key;
            }
        }
        for (int k=0; k<arr.length; k++) {
            System.out.println(arr[k]);
        }		
	}

}
