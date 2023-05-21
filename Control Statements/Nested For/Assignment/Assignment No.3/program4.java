Q4
write a program to print the following pattern
3C 3C 3C 3C
3C 3C 3C
3C 3C
3C

class Pattern{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N-i+1;j++){
				System.out.print("3C" +" ");
			}
			System.out.println();
		}
	}
}
