Q2
write a program to print the following pattern
1
2 3
4 5 6
7 8 9 10

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum++ +" ");
			}
			System.out.println();
		}
	}
}
