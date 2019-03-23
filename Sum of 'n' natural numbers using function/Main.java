#include<stdio.h>
int main() {
    // Type your code here
  int sum(int);
  int n,s;
  scanf("%d",&n);
  s=sum(n);
  printf("%d",s);
}
int sum(int n)
{
  if(n<=0)
    return 0;
  else
    return(n+sum(n-1));
}
  