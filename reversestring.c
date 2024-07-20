#include <stdio.h>
#include <string.h>

void reverseString(char *str) {
    int length = strlen(str);
    int start = 0;
    int end = length - 1;
    char temp;

    while (start < end) {
        
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        
        start++;
        end--;
    }
}

int main() {
    char input[100];  
    printf("Enter a string: ");
    fgets(input, sizeof(input), stdin);  

    
    size_t length = strlen(input);
    if (input[length - 1] == '\n') {
        input[length - 1] = '\0';
    }

    reverseString(input);

    printf("Reversed string: %s\n", input);

    return 0;
}