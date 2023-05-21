Q10
write a program to print the following pattern
1 2 3 4
4 5 6
6 7
7

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i+1;j++){
				System.out.print(sum++ +" ");
			}sum--;
			System.out.println();
		}
	}
}
