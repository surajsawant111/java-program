import java.io.*;
import java.util.*;
class Core2Web{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Society,Wing,Flatno");
		String info=br.readLine();
		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info," ");
		String Token1=obj.nextToken();
		String Token2=obj.nextToken();
		String Token3=obj.nextToken();

		System.out.println(Token1);
		System.out.println(Token2);
		System.out.println(Token3);
	}
}
