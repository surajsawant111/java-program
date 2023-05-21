class IPL{

	IPL(){
		System.out.println("RCB");
	}
	public static void main(String[]args){

		IPL obj1=new IPL();
	        IPL obj2=new IPL();
	}
}  
  //    ANS=RCB
  //        RCB
     
    
 /*  class IPL {
  IPL();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: ldc           #3                  // String RCB
       9: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      12: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #5                  // class IPL
       3: dup
       4: invokespecial #6                  // Method "<init>":()V
       7: astore_1
       8: new           #5                  // class IPL
      11: dup
      12: invokespecial #6                  // Method "<init>":()V
      15: astore_2
      16: return
*/

