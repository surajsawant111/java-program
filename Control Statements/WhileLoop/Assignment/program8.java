Program 8: Write a program to print the countdown of days to submit the
assignment

Input : day = 7

class countdown_Of_days{
           public static void main(String[] args){
           int day = 7;
              if(day == 0){
                System.out.println(day + " days Assignment is Overdue");
              }else{
                  while(day>=1){
                    System.out.println(day + " days remaining");
                    day--;
              }
                  if(day == 0){
                     System.out.println(day + " days remaining is Overdue");
              }
           }
        }
    }
    
    Output: 7 days remaining
6 days remaining
5 days remaining
.
.
1 day remaining
0 days Assignment is Overdue

