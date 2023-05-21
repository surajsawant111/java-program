class Core2Web{
	int NoOfCourse=4;
	String FavouriteCourse="Java";

	void display(){
		System.out.println(NoOfCourse);
		System.out.println(FavouriteCourse);
	}
}
class User{
	public static void main(String[]args){

		Core2Web obj=new Core2Web();
		obj.display();
	}
	
}



