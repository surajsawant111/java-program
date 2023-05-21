Q4
write a program to print the following pattern
1A 2B 3C
1A 2B 3C
1A 2B 3C

class Pattern{
	public static void main(String[]args){

		int N=3;
		for(int i=1;i<=N;i++){
			int sum=1;
			char ch='A';
			for(int j=1;j<=N;j++){
				System.out.print(sum++ +"" +ch++ + " " );
			}
			System.out.println();
		}
	}
}
		
