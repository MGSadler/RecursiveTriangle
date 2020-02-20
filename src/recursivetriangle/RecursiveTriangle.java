/* Modify the example in Horstmann Section 5.9, pp. 228-230 so that the triangle displays 
“in reverse order” as in the example below, which allows the user to set the number of 
lines to print and the String used for printing the triangle.

 * Use a method to prompt the user for the number of lines (between 1 and 10) to print.
This method should take no parameters and return an int value.

 * Use a method to prompt the user for the string to be used when printing the pattern.
This method should take no parameters and return a String value.

 * Use a method called printTriangle that takes an int and a String as parameters 
(i.e., the return values from the two methods mentioned above) and has no return value. 
That method should use recursion to print the “reversed triangle” as in the following example.

 * EXAMPLE:  The call to printTriangle(numLines, pattern) should print the following, assuming numLines
has the value 4 and pattern has the value “[]”.

[][][][]
[][][]
[][]
[]

 * Thoughts
You could write and test each method as you go. Alternatively, you could write the whole 
program with “everything in main” and then decompose it into methods.
 */
package recursivetriangle;

import java.util.Scanner;

public class RecursiveTriangle {

    public static int lineInput() {
        Scanner input = new Scanner(System.in);
        int numLines;
        System.out.println("Please enter a number between 1 and 10; this will be the amount of lines printed: ");
        numLines = input.nextInt();
        return numLines;
    }
    public static String patternInput(){
        Scanner input = new Scanner(System.in);
        String pattern;
        System.out.print("Please enter a pattern: ");
        pattern = input.next();
        return pattern;
    }
    public static void printTriangle(int sideLength, String pattern){
        if (sideLength < 1){
            return;
        }
        for (int i = 0; i < sideLength; i++){
            System.out.print(pattern);
        }
        System.out.println();
        printTriangle(sideLength -1, pattern);
    }
    public static void main(String args[]){
        int numLines = lineInput();
        String pattern = patternInput();
        printTriangle(numLines, pattern);
    }
}
