Q9
write a program to print the following pattern
1
8 27
64 125 216

class Pattern{
	public static void main(String[]args){
		int N=3;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum*sum*sum +" ");
				sum++;
			}
			System.out.println();
		}
	}
}






