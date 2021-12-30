/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Newton's method to compute square root of a number
 */
package logicalJavaProgram;

public class NewtonMethod {
    //main method
    public static void main(String[] args) {
        //variable declaration
        double c,epsilon = 1e-15,t;
        System.out.println("Enter no to find square root: ");
        c=Utility.getUserDouble();
        t=c;
        /**logic
         *  - initialize t = c
         *  - replace t with the average of c/t and t
         *  - repeat until desired accuracy reached
         */
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        // output
        System.out.println(t);
    }
}