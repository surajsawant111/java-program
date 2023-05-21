import java.io.*;
class Society{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Name");
		String Name=br.readLine();

		//System.out.println("Enter Wing");
		//char ch=(char)br.read();
                //br.skip(1);

		System.out.println("Enter No");
	        String temp=br.readLine();
	        int n=Integer.parseInt(temp);	
	//	int no=Integer.parseInt(br.readLine());

		System.out.println(Name);
		//System.out.println(ch);
		System.out.println(temp);
		System.out.println(n);
	}
}
