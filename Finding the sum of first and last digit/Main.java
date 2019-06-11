#include <stdio.h>
int main() {
	int n,sum=0;
  scanf("%d",&n);
  int a=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  int d=n%10;
  sum=a+d;
  printf("%d",sum);
  
  
	return 0;
}