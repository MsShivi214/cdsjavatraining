#include <stdio.h>

void findRepeatedValues(int arr[], int size) {
    int foundRepeated = 0;

    printf("Repeated values: ");
    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                // Check if the value is already printed
                int alreadyPrinted = 0;
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        alreadyPrinted = 1;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    printf("%d ", arr[i]);
                    foundRepeated = 1;
                }
                break; // Exit inner loop if a duplicate is found
            }
        }
    }

    if (!foundRepeated) {
        printf("None");
    }

    printf("\n");
}

int main() {
    int size;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &size);

    int arr[size];

    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    findRepeatedValues(arr, size);

    return 0;
}