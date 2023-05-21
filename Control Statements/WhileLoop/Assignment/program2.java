Program 2: Write a program to calculate the factorial of the given
number.
Input: 6

class While{
	public static void main(String[]args){
		int fact=1;
		int N=6;
		int i=1;
		while(i<=N){
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
Output: factorial 6 is 720

