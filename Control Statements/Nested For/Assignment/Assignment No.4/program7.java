Q7
write a program to print the following pattern
F
E 1
D 2 E
C 3 D 4
B 5 C 6 D
A 7 B 8 C 9

class Pattern{
	public static void main(String[]args){
		int N=6;
		int sum=1;
		char ch='F';
		for(int i=1;i<=N;i++){
			char temp=ch;
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print(temp +" ");
					temp++;
				}else{
					System.out.print(sum +" ");
					sum++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}
