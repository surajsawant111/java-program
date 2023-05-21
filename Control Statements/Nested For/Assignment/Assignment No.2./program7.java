Q7
write a program to print the following pattern
1 2 9
4 25 6
49 8 81

class Pattern{
	public static void main(String[]args){
		int N=3;
		int sum=1;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(sum%2==1){
					System.out.print(sum*sum +" ");
				}else{
					System.out.print(sum +" ");
					
				}sum++;
			}
			System.out.println();
		}
	}
}
