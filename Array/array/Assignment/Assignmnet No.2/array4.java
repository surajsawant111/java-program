Program 4:
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6.

import java.io.*;
class Array{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Element");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(" Element to Search");
		int search=Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				System.out.println("Element found at Index: "+i);
			}
		}
	}
}
