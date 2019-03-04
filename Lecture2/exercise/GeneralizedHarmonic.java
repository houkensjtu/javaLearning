public class GeneralizedHarmonic{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        double harmonic = 0.0;

        // The generalized harmonic number is defined as : H(n,r) = 1/1^r + 1/2^2 + ... 1/n^r
        for (int i = 1; i <= n; i++){
            harmonic += 1.0/Math.pow( (double) i, r);
        }
        System.out.println(harmonic);
    }
}