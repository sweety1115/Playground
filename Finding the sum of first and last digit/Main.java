#include <stdio.h>
int main() {
	//Type your codin
  int num,last_digit,first_digit,sum=0;
  scanf("%d",&num);
  last_digit=num%10;
  first_digit=num;
  while(num>=10)
  {
    num=num/10;
  }
  first_digit=num;
  sum=first_digit+last_digit;
  printf("%d",sum);
  
	return 0;
}