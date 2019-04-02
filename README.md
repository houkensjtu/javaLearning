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
   - Shuffle a deck.

5. Two-dimensional array
- Declare and initialize.
   ```Java
   double[][] a;
   a = new double[100][100];
   a[i][j] = b[i][k] * c[k][j];

   // Refer to number of rows.
   a.length;

   // Refer to number of columns.
   a[i].length;

   // Refer to row i.
   a[i];

   // Initialize.
   double[][] a = new double[100][100];
   double[][] a = {{..., ..., ..., ...},
                   {..., ..., ..., ...},
                   ...
                  };

   ```
   
- Applications : Vector and matrice.
   ```Java
   double[] c = new double[N];
   for(int i=0; i < N; i++)
       c[i] = a[i] + b[i];

   double[][] = new double[N][N];
   for(int i = 0; i < N; i++)
       for(int j = 0; j < N; j++)
           c[i][j] = a[i][j] + b[i][j];
   ```

### Lecture 4: Standard input and output

Capable of taking infinite data from a stream (or file) instead of taking small amount of data from cmd line arguments.

1. StdIn and StdOut library. 
    - From this point on, use StdOut.println() instead of System.out.println();
    - StdOut program can be piped to a StdIn program.

2. StdDraw library
    - Draw simple shape use StdDraw.line(x1,y1,x2,y2)
    - Draw functions
    - Draw patterns based on some random behavior.

3. Animation
    - Bouncing ball.

### Lecture 5: Functions and libraries
1. Basic concepts
    - Modular programming : Organize programs as independent modules.
    - Reason : easier to share and reuse code to build bigger programs.
    - For now : Modules and libraries just are .java files with multiple functions in it. (But can be more.)
    - Funtions : Input, Output, and side effects. Examples seen so far : Math.random(), Math.abs(), Integer.parseInt(), StdIn.readInt()..

2. Case study : digital audio
    - Crash course of sound.
      A pure sound is a sin wave.  
      440Hz is concert A sound.  
      12 notes, logrithmic scale.  
      Sound is nothing more than array of double values.  
    - StdAudio library.
      Convert to and from .wav file format.  

    - HelloWorld for sound!
```Java

public class playThatTone{
    public static double[] tone(double hz, double duration){
        int N = (int) (44100 * duration);
        double[] a = new double[N+1];
        for (int i=0; i < N; i++){
            a[i] = Math.sin(2 * Math.PI * i * hz / 44100);
        }
        return a;
    }

    public static void main(String[] args){
        double hz = Double.parseDouble(args[0]);
        double duration = Double.parseDouble(args[1]);

        double[] a = tone(hz,duration);

        StdAudio.play(a);
    }
}

```
Bottom line : You can write program to manipulate sound.

3. Case study 2 : Gaussian distribution (DIY library)
    - Function can be defined with same name and different number of arguments.
```Java
// This is a diy Gaussian function library.
public class Gaussian{
    public static double pdf(double z){
        ...;
    }
    public static double pdf(double z, double mu, double sigma){
        ...;
    }
    public static void main(String[] args){
        // Put some test code here...
    }
}
```
    - And it's good practice to include some test code in the main function of the library.
    - To use a library : put the Gaussian.java file in the directory, and use Gaussian.xxx() to call the function.

### Lecture 6: Recursion

1. Why learn recursion?
- Represents a new mode of thinking
- Provides a powerful program paradim
- Gives insight into the nature of computation

2. Example : convert an integer into binary
- implement as a function of an integer N
- *The structure of recursion:*
  1. Base case : return sth. for a small N.
  2. Reduction step : assume that the function for small N works, then figure out a way to compute for large N.
  ```java
  public class integerToBinary{
      public static String convert (int N){
          // Base case
          if (N == 1) return "1";

          // Reduction step
          return convert(N/2) + (N % 2);
      }

      public static void main (String[] args){
          int N = Integer.parseInt(args[0]);
          System.out.println(convert(N));
      }
  }
  ```
  *Proof*
  In the example, assume convert() works for N/2, if N is odd then append "1", or if N is even, append "0".

  3. Common bugs for a recursive function
  - No base case.
  - Induction does not converge to the base case, leads to infinite loop.

3. Some more classic examples
  1. Ruler function
  ```java
  public class Ruler {
      public static String ruler(int N)
      {
         if (N=0) return " ";
         return ruler(N-1) + n + ruler(N-1);
      }
      public static void main(String[] args)
      {
          int N = Integer.parseInt(args[0]);
          System.out.println(ruler(N));
      }
  }
  ```
  Observation : ruler(1) calls ruler(0) twice, ruler calls ruler(1) twice, so 2x2 it calls 4 ruller, and so on.



  2. Hanoi tower puzzle
  ```java
  public class Hanoi{
      public static String move(int N)
      {
          if (N==1) return N + "R";
          return move(N-1) + N + "L" + move(N-1);
      }
      public static void main(String[] args)
      {
          int N = Integer.parseInt(args[0]);
          System.out.println(move(N));
      }
  }
  ```
  Observation : Why call move(n-1) twice? Because to move the whole tower, you have to move the n-1 tower once to the right, move the nth disk left, and move the n-1 tower again to the right, that will complete the movement.
  In the end, the program is very similar with Ruler().


    