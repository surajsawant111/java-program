Program 9: Write a program to reverse the given number.
Input: 942111423

class reverseNo{
        public static void main(String[] args){
                int No = 942111423;
                int rev = 0;
                int temp = No;
                int rem=0;
                while(temp != 0){
                        rem= temp%10; 
                        rev = rev * 10 + rem ; 
                        temp = temp/10;
                }
                System.out.println(No + "After Reverse : = " + rev );
        }
}       
Output: 324111249

