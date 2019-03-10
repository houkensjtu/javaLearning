# learningJava
> Code practices when learning the Java language.
The course : [Computer Science: Programming with a Purpose](https://introcs.cs.princeton.edu/java/home/)
### Lecture 1: BASIC PROGRAMMING CONCEPTS
1. Hello world program
2. Program development process
    - Virtual Terminal vs. IDE
3. Built-in data types

    Data type = Value + Behavior (operation)
    - char
    - int : add, subtract, multiply, divide...
    - String : concanate
    - double : same as int
    - boolean : and(&&), or(||), not(!)

    Some basic Java API:
    - void System.out.println(String s)
    - int Integer.parseInt(String s)
    - double Double.parseDouble(String s)
    - double Math.abs(double a)
    - long Math.round(double a)
    - double Math.E
    - double Math.PI

### Lecture 2: CONDITIONALS AND LOOPS
Conditionals and loops enable us to do more complex control flows.
1. The if statement
    ```Java
    // Absolute value
    if (x<0) { 
        x = -x; 
    }
    ```

    ```Java
    // Maximum
    if (x>y) {
        max = x; 
    } 
    else {
        max = y;
    }
    ```

    ```Java
    // Use if statement to build a simple two-number sort
    public class twoSort{
        public static void main(String[] args)
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (a>b){
                int t = a;
                a = b;
                b = t;
            }
            System.out.println(a,b);
        }
    }
    ```
2. The while statement
    ```Java
    public class powerOfTwo{
        public static main(String[] args)
        {
            int n = Integer.parseInt(args[0]);
            int v = 1;
            int i = 0;
            while ( i<= n)
            {
                System.out.println(v);
                i = i + 1;
                v = 2 * v;
            }
        }
    }
    ```
    - Newton-Raphson method to compute square root.

    3. The for loop

    ```Java
    int sum = 0;
    for (int i = 1; i <= N; i++)
        sum += i;
    System.out.println(sum);
    ```
    - Every for loop has an equivalent of while loop.

    4. Debugging
    - Programming is primarily a process of finding and fixing mistakes.
    - Four steps of programming : EDIT, COMPILE, RUN, TEST.
    - Performance matters.

    ### Lecture 3: ARRAYS
    The first data structure in this course.
    1. What is data structure?  
    A data structure is an arrangement of data that enables efficient processing by a program.

   ```Java
   double[] a;
   a = new double[10000];
   a[0] = 1;
   a[1] = 2;
   ```
   2. Critical concepts
   - index start at 0.
   - Given i, the access to a[i] is extremely efficient.
   - The assignment b = a makes the name b and a refer to the same arrar.

   3. Java built-in support feature for arrays
   ```Java
   // Declare an array.
   double[] a;

   // Create an array of fixed size.
   a = new double[10];

   // Refer to the length of the array.
   a.length;

   // Compact intialization.
   double[] a = new double[100];

   // Initialize with values.
   double[] x = {0.1, 0.6, 0.8};

   // Copy an array.
   double[] b = new double[100];
   for(int i = 0; i<a.length; i++)
       b[i] = a[i];
   ```
   4. Examples of array processing

   - Build a deck.
   
