Q3
write a program to print the following pattern
14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=14;
		for(int i=1;i<=N;i++){
			int x=sum+i-1;
			for(int j=1;j<=N;j++){
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
	}
}
