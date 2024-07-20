#include <stdio.h>
int fibonacci(int m)
{
    if (m == 0)
    {
        return 0;
        
    }
    else if (m == 1)
    {
        return 1;
        
    }
    else
    {
        return fibonacci(m - 1) + fibonacci(m- 2);
    }
    
}

int main()
{
    int num;
    printf("Please enter a number to calculate the Fibonacci sequence: ");
    scanf("%d", &num);
    printf("Fibonacci sequence of %d is %d\n", num, fibonacci(num));
    return 0;
    
}