Program 2:
WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99

import java.io.*;
class ArrayDemo{
	public static void main(String []args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Integer Element");
		int prod=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			prod=prod*arr[i];
		}
	}
	System.out.println("Product of even Element is: " +prod);
	}
}




