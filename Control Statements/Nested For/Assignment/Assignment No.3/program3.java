Q3
write a program to print the following pattern
10
9 8
7 6 5
4 3 2 1

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=10;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum-- +" ");
			}
			System.out.println();
		}
	}
}
