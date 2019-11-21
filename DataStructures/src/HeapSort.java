package heap;

public class HeapSort {

	void heapSrt(int arr[]) {
		int n = arr.length; 
		  System.out.println("n "+n);
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
        	System.out.println("i "+ i);
            heapify(arr, n, i); 
        }
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
	}
	 void heapify(int arr[], int n, int i) 
	    { 
	        int largest = i; // Initialize largest as root 
	        int l = 2*i + 1; // left = 2*i + 1 
	        int r = 2*i + 2; // right = 2*i + 2 
	  
	        // If left child is larger than root 
	        if (l < n && arr[l] > arr[largest])
	        {
	        	System.out.println(" le "+arr[l]+ " > "+ arr[largest]);
	            largest = l; 
	        }
	  
	        // If right child is larger than largest so far 
	        if (r < n && arr[r] > arr[largest]) 
	        {
	        	System.out.println(" ri "+arr[l]+ " > "+ arr[largest]);

	            largest = r; 
	        }
	  
	        // If largest is not root 
	        if (largest != i) 
	        { 
	            int swap = arr[i]; 
	            arr[i] = arr[largest]; 
	            arr[largest] = swap; 
	  
	            // Recursively heapify the affected sub-tree 
	            heapify(arr, n, largest); 
	        } 
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,50,20,3,4,2};
		
		HeapSort ob=new HeapSort();
		
		ob.heapSrt(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

