#include <stdio.h>
#include <stdbool.h>

char RepeatedCharacter(const char *str) {
    bool seen[256] = { false };  

    for (int i = 0; str[i] != '\0'; i++) {
        if (seen[(unsigned char)str[i]]) {
            return str[i];
        }
        seen[(unsigned char)str[i]] = true;
    }
    
    return '\0'; 
}

int main() {
    char input[100];  

    printf("Enter a string: ");
    fgets(input, sizeof(input), stdin);  

    
    size_t length = 0;
    while (input[length] != '\0') {
        length++;
    }
    if (input[length - 1] == '\n') {
        input[length - 1] = '\0';
    }

    char repeatedChar = RepeatedCharacter(input);
    
    if (repeatedChar != '\0') {
        printf("First repeated character is: %c\n", repeatedChar);
    } else {
        printf("No repeated characters found.\n");
    }
    
    return 0;
}