public class Newton{
    public static double sqrt(double c, double esp){

        if(c < 0) return Double.NaN;

        double root = c;
        
        while (root - c/root > esp*root)
            root = (root + c/root)/2;
        return root;
    }
    public static void main(String[] args){

        double[] a = new double[args.length];

        for (int i = 0; i < args.length; i++){
            a[i] = Double.parseDouble(args[i]);
            StdOut.println(sqrt(a[i], 1e-6));
        }


    }
}