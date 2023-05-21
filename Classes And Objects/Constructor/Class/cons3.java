class Project{
	String projectname="Online Edu";
	int NoOfEmployee=20;

	void ClientInfo(){
		String ClientName="Core2Web";

		System.out.println(projectname);
		System.out.println(NoOfEmployee);
		System.out.println(ClientName);
	}
}
class Demo{
	public static void main(String[]args){

		Project obj=new Project();
		obj.ClientInfo();
	}
}
	
