#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  int u=n%10;
  printf("%d",u);
	return 0;
}