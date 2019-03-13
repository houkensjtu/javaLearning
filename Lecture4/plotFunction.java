public class plotFunction{
    public static void main(String[] args){
        
        int N = Integer.parseInt(args[0]);

        double[] x= new double[N+1];
        double[] y= new double[N+1];
        for (int i = 0; i <= N; i++){
            x[i] = 8 * Math.PI * i / N;
            y[i] = Math.sin(x[i]);
        }
        StdDraw.setXscale(0, Math.PI * 8);
        StdDraw.setYscale(-2,2);
        for (int i = 0; i < N; i++){
            StdDraw.line(x[i],y[i],x[i+1],y[i+1]);
        }
    }
}