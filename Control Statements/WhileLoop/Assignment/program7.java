Program 7: Write a program which take’s number from user’s if number is even
print that number in reverse order or if number is odd print that number in
reverse order by difference two?
Input:6
Input:7

class While{
	public static void main(String[]args){
		int num=6;
		int rem=7;

		if(num%2==0){
			while(num>=1){
				System.out.print(num +" ");
				num--;
			}
		}
		else{
			while (rem>=1){
				System.out.print(num +" ");
				num=num-2;
			}
			}System.out.println();
		}
	}
output:6 5 4 3 2 1
output:7 5 3 1.


