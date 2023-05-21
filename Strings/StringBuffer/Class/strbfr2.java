class StringBufferDemo{
	public static void main(String[]args){
		

		String str1="Shashi";
		System.out.println(System.identityHashCode(str1));

		str1=str1.concat("Bagal");
		System.out.println(System.identityHashCode(str1));
	}
}        ANS=
               225534817
               1878246837

