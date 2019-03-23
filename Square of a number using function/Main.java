#include<stdio.h>
int main() {
   // Type your code here
  int func(int);
  int num,ans;
  scanf("%d",&num);
  ans=func(num);
  printf("%d",ans);
}
  int func(int temp)
{
    return (temp*temp);
}

 
