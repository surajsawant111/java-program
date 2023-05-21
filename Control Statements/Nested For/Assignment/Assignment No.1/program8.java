Q8
write a program to print the following pattern
d d d d
c c c c
b b b b
a a a a

class For{
	public static void main(String[]args){
		int N=4;
		char ch='d';
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print(ch +" ");
			}
			ch--;
			System.out.println();
		}
	}
}
