/*Program 3:
WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6*/

import java.io.*;
class ArrayDemo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter Integer Element");
		int prod=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1){
				prod=prod*arr[i];
			}
		}
		System.out.println("Product of odd Index is: "+prod);
	}
}
