Q1
write a program to print the following pattern
C2W1 C2W2 C2W3
C2W1 C2W2 C2W3
C2W1 C2W2 C2W3

class Pattern{
	public static void main(String[]args){

		int N=3;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print("C2W1" +" ");
			}
			System.out.println();
		}
	}
}
