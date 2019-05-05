public class Charge{

   private final double rx, ry;
   private final double q;
   
   // Constructor
   public Charge(double x0, double y0, double q0){
       rx = x0;
       ry = y0;
       q = q0;
   }
   
   // Methods
   public double potentialAt(double x, double y){
       double k = 8.99e09;
       double dx = x - rx;
       double dy = y - ry;
       return k * q / Math.sqrt(dx*dx + dy*dy);
   }
   public String toString()
   {   return q + " at " + "(" + rx + ", " + ry +")"; }

   // Main
   public static void main(String[] args){
       Charge c = new Charge(.72, .31, 21.3);
       StdOut.println(c);
       StdOut.printf("%6.2e\n", c.potentialAt(.42, .71));
   }
}