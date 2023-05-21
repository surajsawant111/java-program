
****
****
****
****

class Pattern{
	public static void main(String[]args){
		int N=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=N;j++){
				if(j%2==1||j%2==0){
					System.out.print(" * ");
				}else{
					System.out.print("-");
				}
			}	
			System.out.println();
			
		}
	}
}

 
