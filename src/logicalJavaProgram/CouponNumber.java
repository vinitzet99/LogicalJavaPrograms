/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Count total coupon alphanumeric numbers that can be generated for N length.
 */
package logicalJavaProgram;

public class CouponNumber {
    //main method
    public static void main(String[] args){
        //variable declaration
        int length;
        long count;
        //input
        System.out.println("Enter the length: ");
        length= Utility.getUserInt();

        /**logic
         * total alphanumeric values are 26+26+10=62
         * for n length 62 times n
         */
        count= (long) Math.pow(62,length);
        //output
        System.out.println("Count is: "+count);
    }
}
