#include <stdio.h>

int main() {
    int a,b,c;
    printf("Enter the values of a and b:");
    scanf("%d %d", &a, &b);
    c=a;
    a=b;
    b=c;
    printf("After swap a = %d and b = %d", a,b);
    
    printf("\n");
    printf("without using 3rd variable\n");
    
    
    a = a+b;
    b = a-b;
    a = a-b;
    printf("After swap b = %d and a = %d", a,b);
    return 0;
}