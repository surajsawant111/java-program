class College{
	int NoOfBuilding=4;
	String Department="EnTc";

	void Building(){
		String Lab1="Computer Lab";
		System.out.println(Lab1);
		String Lab2="Electrical Lab";
		System.out.println(Lab2);
	}
}
class Student{
		public static void main(String[] args){
			College obj=new College();
			obj.Building();
		}
}

