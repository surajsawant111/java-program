Q10
write a program to print the following pattern
1
8 9
9 64 25
64 25 216 49

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=1;
		for(int i=1;i<=N;i++){
			int temp=sum;
			for(int j=1;j<=i;j++){
			if(i%2!=0){
				if(j%2==0){
					System.out.print(temp*temp*temp +" ");
				}else{
					System.out.print(temp*temp +" ");
				}
			}else{
				if(j%2!=0){
					System.out.print(temp*temp*temp +" ");
				}else{
					System.out.print(temp*temp +" ");
				}
			}
			temp++;
		}
		sum++;
		System.out.println();
	}
	}
}

