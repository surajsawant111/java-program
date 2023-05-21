Q2
write a program to print the following pattern
4 5 6 7
4 5 6 7
4 5 6 7
4 5 6 7

class For{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=N;i++){
			int var=4;
			for(int j=1;j<=N;j++){
				System.out.print(var++  +" ");
			}
			System.out.println();
		}
	}
}

 
