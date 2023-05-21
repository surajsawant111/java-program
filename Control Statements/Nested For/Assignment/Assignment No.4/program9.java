Q9
write a program to print the following pattern

1
8 9
27 16 125
64 25 216 49

class Pattern{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=N;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print(temp*temp*temp +" ");
				}else{
					System.out.print(temp*temp +" ");
				}
				temp++;
			}
			System.out.println();
		}

	}
}
