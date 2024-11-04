package Majorityelement;
import java.util.*;

public class MajorityOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		findMajority(arr,n);
	}
	static void findMajority(int arr[],int n) {
		int count =0;
		int index=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[j]==arr[i]) {
					count++;
					index=i;
				}
			}
		}
		if(count > n/2) {
			System.out.println("Majority Element:"+arr[index]);
		}
	}

}
