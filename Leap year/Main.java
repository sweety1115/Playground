#include<stdio.h>
int main()
{
  //Type your code here
  int year;
  scanf("%d",&year);
  if((year % 400) == 0)
    printf("Leap year");
  else if((year % 100) == 0)
    printf("Not Leap year");
  else if((year % 4) == 0)
    printf("Leap year");
  else
    printf("Not Leap year");
          
  return 0;
}