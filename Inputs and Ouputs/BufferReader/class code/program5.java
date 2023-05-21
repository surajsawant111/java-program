import java.util.*;
import java.io.*;

class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter player info");
		String str=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str," ");
		System.out.println(st.hasMoreTokens()); It print true false
		System.out.println(st.countToken());   It count the number
		System.out.println(st.nextToken());     It print only one word
		
		}
	}
}
