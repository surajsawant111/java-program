Q5
write a program to print the following pattern
A B C D
B C D
C D
D

class Pattern{
	public static void main(String[]args){
		int N=4;
		char ch='A';
		for(int i=1;i<=N;i++){
			char temp=ch;
			for(int j=1;j<=N-i+1;j++){
				System.out.print(temp +" ");
				temp++;
				
			}
			ch++;
			 System.out.println();
		}
	}
}
