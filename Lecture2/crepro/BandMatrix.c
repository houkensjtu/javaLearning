#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void main(int argc, char* argv[]){
    int rank  = atoi(argv[1]);
    int width = atoi(argv[2]);

    for (int i = 1; i <= rank; i++){
        for (int j = 1; j <= rank; j++){
             if (abs(i-j) > width  ){
                 printf("0  ");
             }
             else{
                 printf("*  ");
             }
        }
        printf("\n");
    }
}