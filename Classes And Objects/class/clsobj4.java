class ClsObjDemo{

	ClsObjDemo(){
		System.out.println("In Core2Web");
	}
	int x=10;
	public static void main(String[]args){
		System.out.println("In Main");

		ClsObjDemo obj=new ClsObjDemo();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	int y=20;
}   
 //  ANS=In Main
 //      In Core2Web
 //      10
 //      20
       


   



/*     class ClsObjDemo {
  int x;

  int y;

  ClsObjDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field x:I
      10: aload_0
      11: bipush        20
      13: putfield      #3                  // Field y:I
      16: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      19: ldc           #5                  // String In Core2Web
      21: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      24: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #7                  // String In Main
       5: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: new           #8                  // class ClsObjDemo
      11: dup
      12: invokespecial #9                  // Method "<init>":()V
      15: astore_1
      16: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_1
      20: getfield      #2                  // Field x:I
      23: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
      26: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      29: aload_1
      30: getfield      #3                  // Field y:I
      33: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
      36: return
*/
