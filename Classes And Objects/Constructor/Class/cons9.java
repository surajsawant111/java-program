class Employee{
        int emplyId=10;
        String str="kanha";

	static int y=50;

        void empinfo(){
                System.out.println("emplyId= " +emplyId);
                System.out.println("str= " +str);
		System.out.println("y= " +y);
        }
}
class MainDemo{
        public static void main(String[]arrhs){

		Employee emp1=new Employee();
		Employee emp2=new Employee();

		emp1.empinfo();
		emp2.empinfo();

		System.out.println("----------------------------------------------");

		emp2.emplyId=20;
		emp2.str="Rahul";
		emp2.y=5000;

		emp1.empinfo();
		emp2.empinfo();
	}
}

