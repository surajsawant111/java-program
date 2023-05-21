Program 10: Write a program to check whether the number is a Palindrome
number or not. (2332)

class palindrome_No{
        public static void main(String[] args){
                int num = 2332;
                int rev = 0;
                int temp = num;
                while(temp != 0){
                        rev = rev * 10 + (temp % 10); 
                        temp /= 10;
                }
                if(num == rev){
                        System.out.println(num + " is a palindrome Number");
                }else{
                        System.out.println(num + " is Not a palindrome number");
                        }
                 }       
            }       
~                   Output: 2332 is a palindrome number

