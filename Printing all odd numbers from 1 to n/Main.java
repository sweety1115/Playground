#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  for(int count=1;count<=num; count=count+1)
  {
    if(count %2 == 1)
      printf("%d\n",count);
  }
 
	return 0;
}