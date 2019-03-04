public class coinGame {
    public static void main(String args[]){

        // Count the number of the cycle of one game.
        int cycleSum = 0;
        // Read the number of how many games will be played from cmdline argument.
        double numGame = Double.parseDouble(args[0]);

        for (int i = 1; i <= numGame; i++){
            
            int coins[] = {5,5,5,5,5};
            int cycle = 0;
            boolean gameContinue = true;
            //System.out.println("Game start :");
            //System.out.println("Coins are " + coins[0] + " " + coins[1] + " " + coins[2] + " " + coins[3] + " " + coins[4]);
            while (gameContinue){
                int deposit = 0;
                for (int j = 0; j<coins.length; j++){
                    if (coins[j] < 25 && coins[j] > 0){
                        coins[j] = coins[j] - 1;
                        deposit ++;
                    }
                    else if (coins[j] == 0) {}
                    else {
                        gameContinue = false;
                        break;
                    }                
                }
                if (gameContinue){
                    int next = Math.round ( (float) Math.random() * 4 );
                    coins[next] = coins[next] + deposit;
                    //System.out.println("Coins are " + coins[0] + " " + coins[1] + " " + coins[2] + " " + coins[3] + " " + coins[4]);
                    ++cycle;}
            }
            cycleSum += cycle;
            System.out.println("Games over! The number of cycle was " + cycle );
        }
        System.out.println("Mean value of total cycle was: " + cycleSum/numGame);
    }
}