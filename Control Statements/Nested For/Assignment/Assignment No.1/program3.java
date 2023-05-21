Q3
write a program to print the following pattern
14 14 14 14
15 15 15 15
16 16 16 16
17 17 17 17

class For{
	public static void main(String[]args){
		int N=4;
		int sum=14;
		for(int i=1;i<=N;i++){		
			for(int j=1;j<=N;j++){
				System.out.print(sum +" ");
				

			}
			sum++;
			System.out.println();
		}
	}
}
