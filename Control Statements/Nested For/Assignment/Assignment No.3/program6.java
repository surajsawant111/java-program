Q6
write a program to print the following pattern
9
9 8
9 8 7
9 8 7 6

class Pattern{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=N;i++){
			int sum=9;
			for(int j=1;j<=i;j++){
				System.out.print(sum-- +" ");
			}
			System.out.println();
		}
	}
}
