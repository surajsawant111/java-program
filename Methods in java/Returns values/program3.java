class Demo{
	public static void main(String[]args){

		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.0f);
		obj.fun('C');
		obj.fun(true);
	}
	void fun(float x){
		System.out.println("MAIN");
		System.out.println(x);
	}
}
