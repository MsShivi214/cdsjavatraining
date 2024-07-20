#include<stdio.h>
int main() {
   int l, m, matrix[3][3], transpose[3][3];
   printf("Enter elements of the matrix:\n");
   for(l=0; l<3; l++)
      for(m=0; m<3; m++) {
         printf("Enter element a%d%d: ",l+1,m+1);
         scanf("%d", &matrix[l][m]);
      }

   printf("\nOriginal matrix:\n");
   for(l=0; l<3; l++) {
      for(m=0; m<3; m++) {
         printf("%d\t",matrix[l][m]);
         if(m==2)
            printf("\n");
      }
   }

   for(l=0; l<3; l++)
      for(m=0; m<3; m++)
         transpose[m][l] = matrix[l][m];

   printf("\nTransposed matrix:\n");
   for(l=0; l<3; l++) {
      for(m=0; m<3; m++) {
         printf("%d\t",transpose[l][m]);
         if(m==2)
            printf("\n");
      }
   }
   return 0;
}