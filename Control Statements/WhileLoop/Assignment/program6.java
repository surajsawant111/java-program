Program 6: Write a program to print the sum of all even numbers and
multiplication of odd numbers between 1 to 10.

class While{
	public static void main(String[]args){

		int sum=0;
		int product=1;
		int i=1;
		while(i<=10){
			if(i%2==0){
			sum=sum+i;
		}
		else{
			product=product*i;
		}i++;
	}System.out.println(sum);
	 System.out.println(product);
	}
}	
output: sum of even numbers between 1 to 10 = 30
Multiplication of odd numbers between 1 to 10 = 945


