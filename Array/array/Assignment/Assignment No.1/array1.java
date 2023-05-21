Program 1:
WAP to take size of the array from the user and also take integer elements from the user
Print the sum of odd elements only
input: Enter size: 5
Enter array elements: 1 2 3 4 5


import java.io.*;

class ArrayDemo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;

		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Integer Element");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Odd Element is: " +sum);
	}
}









