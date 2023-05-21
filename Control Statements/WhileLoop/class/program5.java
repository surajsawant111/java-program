class While{
	public static void main(String[]args){
		int N=6;
		int fact=1;
		int a=1;
		while(a<=N){
			fact=fact*a;
			a++;
		}
		System.out.println("factorial of " + N +" is "+fact);
	}
}

