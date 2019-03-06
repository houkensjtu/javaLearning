public class RandomWalker{
    public static void main(String[] args){

        // Read the max distance from origin from cmd line.
        int r = Integer.parseInt(args[0]);

        double random = Math.random();
        int position[] = {0,0};
        int i = 0;
        // Print the initial position.
        System.out.println("(" + position[0] + "," + position[1] + ")");

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
            System.out.println("(" + position[0] + "," + position[1] + ")");

            // Keep track of the number of the steps.
            i++;
        }
        System.out.println(i + " steps");
}
}