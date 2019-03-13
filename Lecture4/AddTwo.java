public class AddTwo{
    public static void main(String[] args){
        StdOut.print("Input the first number:");
        int x = StdIn.readInt();
        StdOut.print("Input the second number:");
        int y = StdIn.readInt();
        int sum = x + y;
        StdOut.println("The sum of the two numbers is :" + sum);
    }
}