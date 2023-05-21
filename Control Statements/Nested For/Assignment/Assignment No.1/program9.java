Q9
write a program to print the following pattern
C B A
C B A
C B A

class For{
	public static void main(String[]args){
		int N=3;
		for(int i=1;i<=N;i++){
			char ch='C';
			for(int j=1;j<=N;j++){
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}
	}
}


