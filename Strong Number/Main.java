#include <stdio.h>
int main()
{
 int n,temp,sum=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    int rm=temp%10;
    int fact=1;
    for(int i=1;i<=rm;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    temp=temp/10;
  }
  if(n==sum)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}