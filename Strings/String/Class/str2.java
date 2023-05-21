class StringDemo{
	public static void main(String[]args){

		String str1="Kanha";
                String str2="Kanha";
		String str3=new String("Kanha");
		String str4=new String("Kanha");
		String str5=new String("Rahul");
		String str6="Rahul";

		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
                
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));

		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));

		System.out.println(str6);
		System.out.println(System.identityHashCode(str6));

	}
}             

        ANS=
              Kanha
              225534817
              Kanha
              225534817
              Kanha
              1878246837
              Kanha
              929338653
              Rahul
              1259475182
              Rahul
              1300109446 
