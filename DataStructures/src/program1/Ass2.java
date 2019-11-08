package program1;

import java.util.Arrays;

public class Ass2 {
	public static void main(String args[]) {
		
		int arr1[]= {1,8,9,6,3};
		int arr2[]= {5,1,9,2,4};
		int arr[]= new int[arr1.length];
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr[count]=arr1[j];
					count++;
					
				}
			}
		}
		
		int arr3[]=new int[count];
		for(int k=0;k<count;k++) {
			arr3[k]=arr[k];
		}
		Arrays.sort(arr3);
		
		
		for(int i=0;i<count;i++) {
			if(i!=count-1) {
			int z=arr3[i];
			int x=arr3[i+1];
			if(z!=x) {
						System.out.println(arr3[i]);
					}
				}
			else {
				int z=arr3[i];
				int x=arr3[i-1];
				if(z!=x) {
							System.out.println(arr3[i]);
						}
				
			}
		}
		
	}

}
