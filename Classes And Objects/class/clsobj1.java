class ClsObjDemo{

	int x=10;
	static int y=20;
	void fun(){
		int z=30;
	}
}    

  /*      class ClsObjDemo {
  int x;

  static int y;

  ClsObjDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field x:I
      10: return

  void fun();
    Code:
       0: bipush        30
       2: istore_1
       3: return

  static {};
    Code:
       0: bipush        20
       2: putstatic     #3                  // Field y:I
       5: return
*/
