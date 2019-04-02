public class Hanoi{
   public static String move(int N)
   {
       if (N==1) return N + "R ";
       return move(N-1) + N+"L " + move(N-1);
   }
   public static void main(String[] args)
   {
       int N = Integer.parseInt(args[0]);
       System.out.println(move(N));
   }
}