#include <stdio.h>
int main()
{
	int n,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
   int i=n%10;
    sum=sum+i;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}