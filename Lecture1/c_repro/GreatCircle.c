#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void main(int argc, char* argv[]){
    float x1 = atof(argv[1]) * M_PI / 180.0;
    float y1 = atof(argv[2]) * M_PI / 180.0;
    float x2 = atof(argv[3]) * M_PI / 180.0;
    float y2 = atof(argv[4]) * M_PI / 180.0;

    printf("%f %f %f %f \n", x1, y1, x2, y2);

    float r = 6371.0;

    float sine = sqrt( pow(sin((x2-x1)/2),2) + cos(x1) * cos(x2) * pow(sin((y2-y1)/2),2));
    float distance = 2 * r * asin( sine );

    printf("%5.3f kilometers.\n",distance);

}