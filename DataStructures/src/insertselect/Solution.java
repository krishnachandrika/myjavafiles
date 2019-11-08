package insertselect;
class Solution{
	public int[] sortInsertion(int[] arr){
		// fill you code Here
		
		if(arr!=null) {
			for (int i=1; i<arr.length; i++)
			   {
			      int key=arr[i]; 
			      int j=i;
			      while (j>0 && arr[j-1]>key)
			      {
			           arr[j]=arr[j-1];
			           j--;
			      }
			      arr[j]=key;
			}
			return arr;
			}
			return null;
		}
	public int[] sortSelection(int[] arr){
		// fill you code Here
		if(arr!=null) {
			  for (int i=0; i < arr.length-1; i++)
			   {
			      int minimum = i;
			      for (int j=i+1; j<arr.length; j++)
			            if (arr[j]<arr[minimum]) 
			            	minimum = j;
			      int temp = arr[i];
			      arr[i] = arr[minimum];
			      arr[minimum] = temp;
			}
			  return arr;
			}
		return null;
	}
}