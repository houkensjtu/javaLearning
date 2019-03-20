#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void main(int argc, char* argv[]){
    float c = atof(argv[1]);
    float m = atof(argv[2]);
    float y = atof(argv[3]);
    float k = atof(argv[4]);

    float w = 1 - k;
    float r = 255 * w * ( 1 - c );
    float g = 255 * w * ( 1 - m );
    float b = 255 * w * ( 1 - y );

    printf("red   = %d.\n", (int) roundf(r));
    printf("green = %d.\n", (int) roundf(g));
    printf("blue  = %d.\n", (int) roundf(b));
}