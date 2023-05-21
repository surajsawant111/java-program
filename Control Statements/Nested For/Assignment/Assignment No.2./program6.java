Q6
write a program to print the following pattern
1 4 9
16 25 36
49 64 81

class Pattern{
	public static void main(String[]args){
		int N=3;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print(sum*sum +" ");
				sum++;
			}
			System.out.println();
		}
	}
}
