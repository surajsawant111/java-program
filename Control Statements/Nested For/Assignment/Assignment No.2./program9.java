Q9
write a program to print the following pattern
1C3 4B2 9A1
16C3 25B2 36A1
49C3 64B2 81A1

class Pattern{
	public static void main(String[]args){

		int N=3;
		int sum=1;
		int sum2=3;
		
		for(int i=1;i<=N;i++){
			int num=sum2;
			char ch='C';
			for(int j=1;j<=N;j++){
				System.out.print(sum*sum +""+ch-- +""+num-- +" ");
				sum++;
			}
			System.out.println();
		}
	}
}
