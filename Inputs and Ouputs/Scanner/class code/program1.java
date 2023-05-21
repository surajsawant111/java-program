import java.io.*;
class Soci{
        public static void main(String[] args) throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Name");
                String Name=br.readLine();

                System.out.println("Enter Wing");
                char ch=(char)br.read();
                //br.skip(1);

                System.out.println("Enter No");
		Integer.parseInt(br.read());

                System.out.println(Name);
                System.out.println(ch);
                System.out.println(a);
        }
}

