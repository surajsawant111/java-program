class StringDemo{
	public static void main(String[]args){

		String str1="Suraj";
		String str2="Sawant";

		System.out.println(str1+str2);

		String str3="SurajSawant";

		String str4=str1+str2;

		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		System.out.println(str4);		
		System.out.println(System.identityHashCode(str4));
	}
}
           ANS=     
                SurajSawant
                SurajSawant
                1555009629
                SurajSawant
                41359092

