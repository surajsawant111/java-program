class ConsDemo{

	int x=10;
	private int y=20;
	static int z=30;

	void display(){

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Demo{
	public static void main(String[]args){

		ConsDemo obj1=new ConsDemo();
		ConsDemo obj2=new ConsDemo();

		obj1.display();

		obj1.x=100;
		obj2.z=300;

		obj1.display();
		obj2.display();
	}
}
