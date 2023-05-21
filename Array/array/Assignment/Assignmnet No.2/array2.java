Program 2:
WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8.

import java.io.*;
class Array{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Array Element");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int ecount=0,ocount=0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==1){
				ecount++;
			}else{
				ocount++;
			}
		}
		System.out.println("Even Count is: "+ecount);
		System.out.println("Odd Count is: "+ocount);
	}
}


