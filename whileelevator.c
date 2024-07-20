#include <stdio.h>
int main()
{
    char n;
    while(1)
    {
    
    printf("check if elevator is available?(Y/N):");
    scanf("%c", &n);
    
    if(n == 'Y' || n == 'y')
    {
        printf("I will take the elevator to reach the top floor.");
        break;
        
    }
    else if(n == 'N' || n == 'n')
    {
        printf("I will take the stairs to climb upto the top floor");
        break;
    }
    else
    {
        printf("Invalid input");
        
    }
    }
  return 0;
}