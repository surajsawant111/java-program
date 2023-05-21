Q10
write a program to print the following pattern
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7

class For{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=N;i++){
			int sum=i;
			for(int j=1;j<=N;j++){
				System.out.print(sum++  +" ");
			}
			sum++;
			System.out.println();
		}
	}
}

		

