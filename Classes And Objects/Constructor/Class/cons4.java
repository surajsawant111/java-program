class MacD{
	int item=20;
	String product="Fries";

	void Menu(){
		String Menu1="veg";
		String Menu2="Non-veg";

		System.out.println(item);
	        System.out.println(product);

	}
}
class Demo{
	public static void main(String[]args){

		MacD obj=new MacD();
		obj.Menu();
	}
}
