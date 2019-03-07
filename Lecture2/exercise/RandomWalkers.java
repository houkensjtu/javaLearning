public class RandomWalkers{
    public static void main(String[] args){

        // Read the max distance from origin from cmd line.
        int r = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double random = Math.random();
        double i = 0;

        for ( int  j = 1; j <= n; j++ ){

            int position[] = {0,0};

            while ( Math.abs(position[0]) + Math.abs(position[1]) < r){
                random = Math.random();
                if (random <= 0.25){
                    position[0] += 1;
                }
                else if (random <= 0.5){
                    position[0] -= 1;
                }
                else if (random <= 0.75){
                    position[1] += 1;
                }
                else {
                    position[1] -= 1;
                }
                // Keep track of the number of the steps.
                i++;
            }
        }
        System.out.println("average number of steps = " + i/n);
    }
}