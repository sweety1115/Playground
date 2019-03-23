#include<stdio.h>
int main()
{
  //Type your code here
  int a,lastdigit,firstdigit,sum=0;
  scanf("%d",&a);
  lastdigit=a%10;
  firstdigit=a;
  while(a>=10)
  {
    a=a/10;
  }
  firstdigit=a;
  sum=firstdigit+lastdigit;
  printf("%d",sum);
  return 0;
}