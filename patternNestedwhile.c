#include <stdio.h>
int main ()
{
    int i, n, in;
    printf ("ENTER  A NUMBER: ");
    scanf ("%d", &n);
    i = 1;
    while (i <= n)
    {
      printf ("\n");
      in = 1;
      while (in <= i)
   {
     printf ("%d ", in);
     in = in + 1;
   }
      i = i + 1;
    }
    return 0;
}