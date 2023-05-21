/*Program 4:
Write a program, take 7 characters as input , Print only vowels from the array
Input: a b c o d p e.*/


import java.io.*;
class ArrayDemo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];

		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
			br.skip(1);

		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				System.out.print(arr[i] +"");
			}
		}
		System.out.println();
	}
}

