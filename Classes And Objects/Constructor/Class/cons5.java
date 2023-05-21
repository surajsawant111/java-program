class Mess{
	int messcapacity=40;
	String messname="Shreesha";
	static int messprice=3000;

	void MenuInfo(){

		System.out.println("MessCapacity= "+messcapacity);
		System.out.println("MessName= "+messname);
		System.out.println("MessPrice= "+messprice);
	}
}
class Customer{
	public static void main(String[]args){
		Mess ms1=new Mess();
		Mess ms2=new Mess();

		ms1.MenuInfo();
		ms2.MenuInfo();
		System.out.println("---------------------------------");

		ms2.messcapacity=50;
		ms2.messname="Samarth";
		ms2.messprice=3100;

		ms1.MenuInfo();
		ms2.MenuInfo();
	}
}


