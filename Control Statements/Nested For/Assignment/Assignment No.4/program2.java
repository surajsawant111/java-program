Q2
write a program to print the following pattern
1
3 4
6 7 8
10 11 12 13
15 16 17 18 19

class Pattern{
	public static void main(String[]args){
		int N=5;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum++ +" ");
			}sum++;
			 System.out.println();
		}
	}
}


