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


### Lecture 7: Performance

1. The challenge

Will I be able to use my program to solve a large practical problem?
If *not*, how might I *understand its performance characteristics so as to improve it?*

- To predict program behavior: Will my program finish? When will my program finish?
- To compare algorithms and implementations: How can I make my program faster?
- An algorithm design success story: N-body simulation in 1970s, problem steps reduced *from N^2 to NlogN.*
- Another algorithm design success story: fast Fourier transform in 1950s; breakdown a wave of N samples into periodic components. Again, the algorithm reduced the problem size *from N^2 to NlogN.*

- An algorithm challenge: three sum proble: Given N numbers, count the triples that sum to 0.

```Java
public class threesum{
   public static int count(int[] a){
      int N = a.length;
      int cnt = 0;
      // Keep i<j<k to avoid repeating.
      for (int i=0; i<N; i++)
         for (int j=i; j<N; j++)
            for (int k=j; k<N; k++)
               if(a[i]+a[j]+a[k]==0)
                  cnt++;
      return cnt;
   }
   public static void main(String[] args){
      int[] a = StdIn.readAllInts();
      StdOut.println(count(a));
   }
}
```

2. Empirical analysis

- a first step in analyzing run time: Collecting sample data (actual or artificial)

```Java
public class Generator{
    public static void main(String[] args){
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        for (int i=0; i<N; i++)
           StdOut.println(StdRandom.uniform(-M,M));
    }
}
```
- Measuring run time:
```Java
double start = System.currentTimeMillis() / 1000.0;
int cnt = count(a);
double now   = System.currentTimeMillis() / 1000.0;
StdOut.printf("%d (%.0f seconds\n", cnt, now-start);
```

3. Mathematicl model
- Can we write down an accurate formula for the run time of our program?
- D.E.Knuth: Yes!
- Need to find *the cost* of each operation; *the frequency* of execution of each operation.
- A warm-up example: 1-sum
```Java
public static int count(int[] a){
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i<N; i++){
        if (count[i]==0)
            cnt++
    }
    return cnt;
}
```
- Breakdown of the running time of each operation:
  - Call of function : 20ns
  - Var delcaration : 2ns
  - Assignment : 2ns
  - ...
  - Increment : 1/2ns
  - Comparison : 1/2ns
  - Array access : 1/2ns

- Count the number of each operation. Only increment, array access and comparison are operated multiple times, actually *N times.*
- Result : Run time = c*N + 26.5, where c is between 2 and 2.5.

- Simplify the notation : 
  - *Tilde notation* : Use only *the fastest growing term* (when N grow to +Inf.).
  - Example : *3/4N^2 + 4N + 12 ~ 3/4N^2*

4. Doubling method

- Is the run time of my program ~aN^b? Yes. Might also have a (lgN)^c factor.
- As N increases, T(N)/T(N/2) tends to 2^b.
- Doubling method:
  - Start with a moderate size.
  - Double the size.
  - Repeat.

- Order of the growth: If f(N)~a*g(N), we say g(N) is the order of the growth of the function.
- g(N) is a property of algorithm, not the computer.
  - g(N)~N : Linear
  - g(N)~N^2 : Quadratic
  - g(N)~N^3 : Cubic
  - g(N)~lgN : Logarithmic
  - g(N)~NlgN : Linearithmic
  - g(N)~2^N : Exponential

  
### Lecture 8: Abstract data type
1. What is data type?

- Data type is a set of values and a set of operations on those data.
- We want to write programs to process data of type other than the primitive data type (int, float, bool, etc..)
- Examples: Color data type (3 8bit integers), Picture (2D array of Color), String...
- Clients can use ADT(Abstract data type) without knowing the implementation of it.

- We have alreday use ADT! (Strings). Java's String ADT allows you to write program to manipulate String, without knowing the implementation.

2. Use a ADT
You need to know...
- Its name.
- How to construct a new object.
- How to apply operations on the object.

```Java
String s;
s = new String("Hello!");
Stdout.Println(s.substring(0,5));
```

- Quiz : What is ADT? Answer: it's a data type whose implemention is hidden from the client.

3. Using the Color ADT

```Java
public class Color{
    ...;
}

// Constructor 
Color(int r, int g, int b);
int getRed();
int getBlue();
int getGreen();
...
```
- Example : Alber's color square.

```Java
public class AlberSquare{
    public static void main(String[] args){
        int r1 = Integer.parseInt(args[0]);
        int g1 = Integer.parseInt(args[1]);
        int b1 = Integer.parseInt(args[2]);
        Color c1 = new Color(r1,g1,b1);

        int r2 = Integer.parseInt(args[3]);
        int g2 = Integer.parseInt(args[4]);
        int b2 = Integer.parseInt(args[5]);
        Color c2 = new Color(r2,g2,b2);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.25,.5,.2);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.75,.5,.2);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.25,.5,.1);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.75,.5,.1);
    }
}
```

- Sample output:

![AlberSquare](./Lecture8/albersquare.jpg)

4. Image processing

Convert an image to grey scale; scale up or down an image.
(Image is an array of Color.)


### Lecture 9: Creating data types

1. Basic building blocks of programming
- primitive data types
- Math
- conditional and loop
- array
- Standard IO
- functions and modules
- objects

2. Object-oriented programming )OOP)
- create your own data type
- use them in your program

3. How to create your own ADT
- Define the set of values (instance variables)
- Implement operations on values (methods)
- Create and intialize new objects (constructors)

In Java, a data-type implementation is known as a Class.
```Java
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
        return k * q / Math.sqrt(dx*dx + dy*dy)
    }
    public String toString()
    {   return q + " at " + "(" + rx + ", " + ry +")"; }

    // Main (as a test client)
    public static void main(String[] args){
        Charge c = new Charge(.72, .31, 21.3);
        StdOut.println(c);
        StdOut.printf("%6.2e\n", c.potentialAt(.42, .71));
    }
}
```

4. The point charge data type

- Dataset : position rx, ry and charge q.
- toString method get called by print(Object).
- potentialAt(x,y) calculate the potential due the charge at (x,y).

Modifiers:
- private : denies client access and therefore makes data type abstract.
- final : disalow any change on the data after the object is created.

Constructor:
```Java
public class Charge{
    ...
    public Charge(double x0, double y0, double q0){
        rx = x0;
        ry = y0;
        q  = q0;
    }
    ...
}
```
5. Turtle graphics

6. Complex numbers

7. Summary
- Create your own data types
- Use them in your own programm
- help us to simulate the physical world
- Example: charged particle, color, sound, genome...

- Java does not have a data type for every possible application.
- Data types enable us to add our own abstractions.
- Examples: Complex numbers, vectors, matrix, picture...

### Lecture 10: Programming languages

1. The tower of babel
- Ways to solve a programming problem. Different languages are appropriate for different problems.
- Java 
  - You can now write a threesum program.
- C/C++
  - You can also write it in C language.
  - Big difference : there is no object in C.
  - In C/C++, you are responsible for memory allocation. Might lead to memory leak.
- Python
  - Python can be used like a calculator.
  - Instead of braces, use indent to sperate blocks.
  - No type declarations.
  - Array creation idiom (range(N)).
  - for idiom (for i in range(N):).
  - Compilation vs. Interpretation.
  - No compilation time type check.
- Matlab
  - Use Matlab like Java or C.
  - More typicl usage is for matrix processing.
  - Big difference : Matlab is not free.
  - Matlab is written in Java.
  - The Java compiler are written in C.
  - Good matrix libraries are available for C/C++/Java/Python.

2. Java in context

- Why use Java in this course?
  - Widely used; free; full set of modern abstraction; modern libraries; automatic type checking...
- Then why learn other languages?
  - Offer something new about computation.
  - Need to interface with other co-workers.
  - Better than Java for the specific application.
  - Provides intellectual challenge.
  - New style of programming.

3. Programming style
- Procedural : C
- Scripted : Python, Ruby
- Special purpose : Matlab, Postscript
- Object-oriented : focus on objects that do things
- Functional : Haskell, OCaml...

4. Object-oriented programming
- Software is a simulation of the real world.
- Why OOP?
  - Is my program easy to write?
  - Is it easy to find errors and maintain?
  - Is it correct and efficient?
  - Features of OOP:
    - Encapsulation to hide information -> Robust
    - Type checking -> Avoid erros
    - Libraries -> Reuse of code
    - Immutability -> Stability of data

5. Type checking
- Static (compile time) type checking (e.g. Java)
  - All variables have declared types.
  - System checks for type errors at compile time.
- Dynamic (run time) type checking (e.g. Python)
  - Values, not variables have defined types.
  - System checks for type errors at runtime.
-  Which is better? -> Religious war!

6. Functional programming
- Why can't we use functions as arguments in Java?
  - Actually we can in Java 8.
- Completely avoid side effect in program.
- Functions are first-class entities. (Can be arguments and return values of other functions)
- Often leads to compact code.
- An example in Python:

```Python
def square(x):
  return x*x

def table(f,sequence):
  for x in sequence:
     print(x)
     print(f(x))

table(square,range(10))
```
- Why learn functional programming?
  - Offers something new.
  - Introduce a new programming style.
  - Intellectual challenge.

Continue to PartII...
