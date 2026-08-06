
import java.util.*;
public class LargestElementInTheArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array size:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
	int a=arr[0];
	
	for(int i=1;i<n;i++) {
		
		if(arr[i]>a) {
			a=arr[i];
		}
		
	}
	
	System.out.println("Largest element in Array is:"+a);
	
	sc.close(); // It is a good practice.
	
}
}
