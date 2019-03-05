public class BandMatrix{
    public static void main(String[] args){
        // The size of the matrix.
        int n = Integer.parseInt(args[0]);
        // The width of the band of *.
        int width = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ( j-i < width && j - i > -width){
                System.out.print("* ");
                }
                else{
                System.out.print("0 ");
                }
            }
            System.out.print("\n"); // Print a new line at the end of each row.
        }
    }
}