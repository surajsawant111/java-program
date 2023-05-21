Q5
write a program to print the following pattern
10 10 10 10
11 11 11
12 12
13

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=10;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i+1;j++){
				System.out.print(sum +" ");
				
			}sum++;
			System.out.println();
		}
	}
}
