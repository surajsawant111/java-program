class Unary{

	public static void main(String[] args){

		int x=5;
		int y=7;
                
		pre-order:
		System.out.println(++x);
	        System.out.println(++y);

		System.out.println(--x);
		System.out.println(--y);

		System.out.println(x);
		System.out.println(y);

		post order:

		System.out.println(x++);
		System.out.println(y++);

		System.out.println(x--);
		System.out.println(y--);

		System.out.println(x);
		System.out.println(y);

		pre-order and post order addition:-


                int ans1=++x+x++;
	        int ans2=--y+y--;

                System.out.println(ans1);
		System.out.println(ans2);
	        System.out.println(x);
                System.out.println(y); 
	  	
	


	}
}


class Core2web{

	public static void main(String[] args){

	      	System.out.println(4.0/0);
       }

}



class Core2web{
	static int var = 2;
	public static void main(String[] args){
		var=(var=4)*(++var);
		System.out.println(var);
	}
}


class Core2web{
	public static void main(String[] args){
		boolean var1,var2,var3;
		System.out.println(var3=(var2=false)==true);
	}
}


class Core2web{

	public static void main(String[] args){
		int b=10;
		System.out.println(b=3);
	}
}


class Core2web{
	public static void main(String[] args){
		int var1,var2=10,var3;
		var1=var2=var3=45;
		System.out.println(var1+ ""+var2+""+var3);
	}
}



class Core2web{
	public static void main(String[] args){
		int a=10,b=10,c=10,d=10;
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(+-c);
		System.out.println(-++d);
	}
}
