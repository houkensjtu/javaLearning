public class bouncingBall{
    public static void main(String[] args){
        double rx = 0.2;
        double ry = 0.2;

        double vx = 0.05;
        double vy = 0.0015;

        double gravity = 0.008;
        
        double radius = 0.2;

        double canvas = 2.0;

        StdDraw.setXscale(-canvas,canvas);
        StdDraw.setYscale(-canvas,canvas);

        while(true){
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(0,0,canvas);
            vy -= gravity;
            rx += vx;
            ry += vy;
            if(Math.abs(rx)+radius >= canvas) {vx = -vx;}
            if(Math.abs(ry)+radius >= canvas) {vy = -vy; ry = -canvas+radius;}
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.filledCircle(rx,ry,radius);
            StdDraw.show(10);
        }
    }
}