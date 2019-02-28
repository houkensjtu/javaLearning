public class CMYKtoRGB{
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double w = 1 - k;
        double r = 255 * w * ( 1 - c );
        double g = 255 * w * ( 1 - m );
        double b = 255 * w * ( 1 - y );

        System.out.println("red   = " + (int) Math.round(r));
        System.out.println("green = " + (int) Math.round(g));
        System.out.println("blue  = " + (int) Math.round(b));
    }
}