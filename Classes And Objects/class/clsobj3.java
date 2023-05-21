class ClsObjDemo{

	ClsObjDemo(){
		System.out.println("In Core2Web");
	}
	int x=10;
	public static void main(String[]args){
		System.out.println("In Main");
	}
	int y=20;
}    
     ANS=In Main.



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
       8: return
*/
