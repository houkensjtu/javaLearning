#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char* argv[]){
    double b = atof(argv[1]);
    double c = atof(argv[2]);

    double d = b * b - 4 * c;
    printf("The 1st root is %5.2f.\n", (-b + sqrt(d)) / 2);
    printf("The 2nd root is %5.2f.\n", (-b - sqrt(d)) / 2);
}