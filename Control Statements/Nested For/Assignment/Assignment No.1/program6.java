Q6
write a program to print the following pattern
9 8 7
9 8 7
9 8 7

class For{
	public static void main(String[]args){
		int N=3;
	
		for(int i=1;i<=N;i++){
			int sum=9;
			for(int j=1;j<=N;j++){
				System.out.print(sum-- +" ");
			}
			System.out.println();
		}
	}
}



