#include <stdio.h>
int main() {
	//Type your code
  int i,num,sum=0;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
    sum=sum+i;
  }
  printf("%d\n",sum);
	return 0;
}