class Demo{
	public static void main(String[]args){

		gun();
		fun();
	}
         void gun(){
		System.out.println("gun method");
	}
	static void fun(){
		System.out.println("In fun method");

		Demo obj=new Demo();
		obj.fun();

		
	}
}


