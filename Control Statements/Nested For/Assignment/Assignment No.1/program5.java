Q5
write a program to print the following pattern
12 12 12
11 11 11
10 10 10

class For{
	public static void main(String[]args){
		int N=3;
		int sum=12;
		for(int i=1;i<=N;i++){
			
			for(int j=1;j<=N;j++){
				System.out.print(sum +" ");
			}
			sum--;
			System.out.println();
		}
	
	}
}

