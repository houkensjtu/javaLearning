public class Ruler {
   public static String ruler(int N)
   {
      if (N==0) return " ";
      return ruler(N-1) + N + ruler(N-1);
   }
   public static void main(String[] args)
   {
       int N = Integer.parseInt(args[0]);
       System.out.println(ruler(N));
   }
}