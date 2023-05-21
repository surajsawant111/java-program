Program 5: Write a program to print the square of even digits of the given number.
Input: 942111423

class While{
	public static void main(String[]args){
		int digit=942111423;
		int count=0;
		while(digit!=0){
			int rem=digit%10;
			if(rem%2==1){
				System.out.println(rem*rem);
			}
			digit=digit/10;
		}
	}
}
output=4 16 4 16
