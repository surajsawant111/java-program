class Demo{
	int x=10;
	private int y=20;

	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[]args){
		Demo obj=new Demo();
		obj.fun();

		System.out.println(obj.x);
		System.out.println(obj.y);//Error

		System.out.println(x);//Error
		System.out.println(y);//Error

	}
} 
        ANS=we cannot accesss data/number for the other class (Demo).

