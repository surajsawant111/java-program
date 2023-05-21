Q5
write a program to print the following pattern
26 Z 25 Y
24 X 23 W
22 V 21 U
20 T 19 S

class Pattern{
	public static void main(String[]args){
		int N=4;
		int sum=26;
		char ch='Z';
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(j%2==1){
					System.out.print(sum-- +" ");
				}else{
					System.out.print(ch-- +" ");
				}
			}
			System.out.println();
		}
	}
}
