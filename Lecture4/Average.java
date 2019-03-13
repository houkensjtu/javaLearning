public class Average{
    public static void main(String[] args){
        double sum = 0;
        int n = 0;
        while (!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            n++;
        }
        double average = sum / n;
        StdOut.println("The average is " + average);
    }
}