#include<stdio.h>
int main()
{
   int n;
  scanf("%d",&n);
  if(n%4==0 && (n%400 ||n%100!=0))
    printf("Leap year");
  else
    printf("Not Leap year");
 // else
   // printf("not leap year");
  return 0;
}