public class couponCollector{
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);

        boolean[] coupon = new boolean[N];
        for(int i = 0; i < coupon.length; i++){
            coupon[i] = false;
        }

        int cards = 0;
        int distinct = 0;

        while (distinct < N){

        int couponGet = (int) (Math.random() * N);
        cards++;

        if (coupon[couponGet] != true){
            coupon[couponGet] = true;
            distinct++;
        }
        
        }
 
        System.out.println("To collect " + N + " coupons, it cost us " + cards + " times!");

    }
}