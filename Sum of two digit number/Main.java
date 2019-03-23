#include<stdio.h>
int main()
{
  //Type your code here
  int n,lastdigit,firstdigit,sum;
  scanf("%d",&n);
  lastdigit=n%10;
  firstdigit=n/10;
  sum=firstdigit+lastdigit;
  printf("%d",sum);
  return 0;
}