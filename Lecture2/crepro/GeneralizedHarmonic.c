#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void main(int argc, char* argv[]){
    float n = atof(argv[1]);
    float r = atof(argv[2]);
    float harmonic = 0;
    for (int i = 1; i <= n; i++){
        harmonic += 1.0 / pow(i,r);
    }
    printf("The harmonic is %5.3f.\n", harmonic);
}