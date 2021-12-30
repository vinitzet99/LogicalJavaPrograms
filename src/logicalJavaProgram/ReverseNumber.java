/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Find reverse of a number.
 */
package logicalJavaProgram;

public class ReverseNumber {
    public static void main(String[] args){
        //variable declaration
        int number,sum=0,remainder;
        //input
        System.out.println("Enter a number: ");
        number= Utility.getUserInt();
        /**logic
         * till no is not 0
         *      calculate remainder
         *      create reverse
         *      update number
         */
        while(number!=0){
            remainder=number%10;
            sum=sum*10+remainder;
            number=number/10;
        }
        //output
        System.out.println("Reverse of number is: "+sum);
    }
}
