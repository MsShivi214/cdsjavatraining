#include <stdio.h>

int main() {
    char name[100];
    int length = 0;
    printf("Enter your name:");
    fgets(name, sizeof(name), stdin);
    while(name[length] != '\0')
    {
        length++;
    }
    if(name[length - 1] == '\n')
    {
        length--;
    }
    printf("The length of my name is : %d", length);
    return 0;
}