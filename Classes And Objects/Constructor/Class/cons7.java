class Employee{
	int emplyId=10;
	String str="kanha";

	void empinfo(){
		System.out.println("emplyId" +emplyId);
		System.out.println("str" +str);
	}
}
class MainDemo{
	public static void main(String[]arrhs){

		Employee emp1=new Employee();
		emp1.empinfo();

		System.out.println(emp1.emplyId);
		System.out.println(emp1.str);
	}
}
