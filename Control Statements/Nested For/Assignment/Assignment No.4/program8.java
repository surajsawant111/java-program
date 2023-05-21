Q8
write a program to print the following pattern
10
I H
7 6 5
D C B A

class Pattern{
	public static void main(String[]args){
		int N=4;
		char ch='J';
		int sum=10;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch +" ");
				}else{
					System.out.print(sum +" ");
				}
				 ch--;
			         sum--;
		}
		System.out.println();
	}
}
}
