Program 3: Write a program to count the digits of the given number.
Input: 942111423

class While{
	public static void main(String[]args){
		int digit=942111423;
		int count=0;
		while(digit!=0){
			count++;
			digit=digit/10;
		}
			System.out.println(count);
		
	}
}
Output: count of digits = 9

