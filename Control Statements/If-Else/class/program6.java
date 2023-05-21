Given an integer value of input.
-print fizz if it is divisible by 3.
-print buzz if it is divisible by 5.
-print fizz buzz if it is divisible by both.
-if not then print "not divisible by both".

class Core2Web{
	public static void main(String[]args){
		int x=17;

		if(x%3==0){
			System.out.println("fizz");
		}else if(x%5==0){
			System.out.println("buzz");
		}else if(x%5==0&&x%3==0){
			System.out.println("fizz buzz");
		}else{
			System.out.println("not divisible by both");
		}
         }
}

