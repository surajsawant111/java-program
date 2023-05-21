Q8
write a program to print the following pattern
A b C d
E f G h
I j K l
M n O p

class Pattern{
	public static void main(String[]args){

		int N=4;
		char ch1='A';
		char ch2='a';
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(j%2==1){
					System.out.print(ch1 +" ");
					
				}else{
					System.out.print(ch2 +" ");
				}ch1++;
				 ch2++;
			}
			System.out.println();
		}
	}
}
