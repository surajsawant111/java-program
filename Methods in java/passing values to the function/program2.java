import java.util.*;
class Sub{
	static void sub(int x,int y){
		int ans=x-y;
		System.out.println(ans);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int values");
		int a=sc.nextInt();
		int b=sc.nextInt();

		sub(a,b);
	}
}
