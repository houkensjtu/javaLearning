public class threesum{
   public static int count(int[] a){
      int N = a.length;
      int cnt = 0;
      for (int i=0; i<N; i++)
         for (int j=i; j<N; j++)
            for (int k=j; k<N; k++)
               if(a[i]+a[j]+a[k]==0)
                  cnt++;
      return cnt;
   }
   public static void main(String[] args){
      int[] a = StdIn.readAllInts();
      
      double start = System.currentTimeMillis() / 1000.0;
      int cnt = count(a);
      double now   = System.currentTimeMillis() / 1000.0;
      StdOut.printf("%d (%.0f seconds)\n", cnt, now-start);
   }
}