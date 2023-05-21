Q10
write a program to print the following pattern

F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1

class Pattern{
	public static void main(String[]args){

		int N=6;
		for(int i=1;i<=N;i++){
			int sum=6;
			char ch='F';
			for(int j=1;j<=N;j++){
				if(j%2==1){
					System.out.print(ch +" ");
				}else{
					System.out.print(sum+ " ");
				}
				ch--;
				sum--;
			}
			System.out.println();
		}
	}
}
