class StringDemo{
	public static void main(String[]args){

		String str1="Kanha";
		String str2=str1;
		String str3=new String(str2);

	        System.out.println(str1);
	        System.out.println(System.identityHashCode(str1));

	        System.out.println(str2);
	        System.out.println(System.identityHashCode(str2));

	        System.out.println(str3);
	        System.out.println(System.identityHashCode(str3));	
	}
}    
           ANS=
                Kanha
                225534817
                Kanha
                225534817
                Kanha
                1878246837

