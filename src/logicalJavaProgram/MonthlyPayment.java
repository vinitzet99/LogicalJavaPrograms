/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Calculate monthly payment by payment= P*r/(1-(1+r)^(-n))
 */
package logicalJavaProgram;

public class MonthlyPayment {
    //main method
    public static void main(String[] args){
        //variable declaration
        double P,Y,R,n,r,payment;
        //input
        P= Double.parseDouble(args[0]);
        Y= Double.parseDouble(args[1]);
        R= Double.parseDouble(args[2]);
        /**logic
          * calculate n and r
         *  use n and r for calculating payment
         */
        r=R/(12*100);
        n=12*Y;
        payment= (P*r/(1-Math.pow((1+r),(-n))));
        //output
        System.out.println("Monthly Payment is: "+(float)payment);
    }
}
