#include<stdio.h>
int power_of_a_number(int base,int exponent);
int main(){
    // Type your code here
  int base,exponent;
  scanf("%d%d",&base,&exponent);
  printf("%d",power_of_a_number(base,exponent));
  return 0;
}
int power_of_a_number(int base,int exponent)
{
  int power=1;
  while(exponent>=1)
  {
    power=power*base;
    exponent--;
  }
  return power;
}
  