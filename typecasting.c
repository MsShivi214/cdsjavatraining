#include <stdio.h>  
  
int main() 
{  
    printf("Implicit type casting");
    
    int num1;  
    float num2 ;  
      
    printf("Enter the values for num1 and num2: \n \n");
    scanf("%d %f", &num1, &num2);
    
    float result; 
    result = num1 + num2; 
    printf("The result is: %f\n", result);  
    
    printf("\n");
    
    printf("Explicit type casting");
    
    float num3;  
    printf("Enter the values for num1: \n");
    scanf("%f", &num3);
    int num4;  
    num4 = (int) num3; 
    
    printf("The result is: %d\n", num4);  
    return 0;  
    
}  
  