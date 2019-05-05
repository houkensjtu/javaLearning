public class deck{
    public static void main(String[] args){
        String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        // Using Unicode of the suits.        
        String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};

        String[] deck = new String[52];

        for (int i = 0; i < suit.length; i++){
            for (int j = 0; j< rank.length; j++){
                deck[i*13 + j] = rank[j] + suit[i];
            }
        }
        
        int N = Integer.parseInt(args[0]);
        for ( int m = 0; m < N; m++){
            int k = (int) (Math.random() * 52);
            System.out.print(deck[k] + " ");
        }
        System.out.println("");

    }
}