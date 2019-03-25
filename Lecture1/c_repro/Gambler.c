#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
    int cash;
    cash = atoi(argv[1]);
    int bet = 0;
    int goal = atoi(argv[2]);
    int trial = atoi(argv[3]);
    int win = 0;
    for(int i = 0; i < trial; i++)
    {
        cash = atoi(argv[1]);
        while(cash > 0 && cash < goal)
        {
            double roll = (double) rand()/RAND_MAX;
            if (roll > 0.5)
            {
               cash++;
            }
            else
            {
                cash--;
            }
            bet++;
        }
        if(cash > 0) win++;
    }

    printf("Won %d games in %d trials.\n", win, trial);
    printf("And the average number of bet is %5.3f.\n", (float) bet/trial);
    return 0;
}
