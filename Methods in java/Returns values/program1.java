class Demo{
	void fun(int x){
		System.out.println(x);
		
	}
	public static void main(String[]args){
		
		System.out.println("In main");
		Demo obj=new Demo();
		obj.fun();
		System.out.println("End main");
	}
}
