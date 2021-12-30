/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Perfect Number sum of all divisors is equal to number.Check if a number is Perfect.
 */
package logicalJavaProgram;

public class PerfectNumber {
    //main method
    public static void main(String[] args){
        //variable declaration
        int number,sum=0;
        //input
        System.out.println("Enter a number: ");
        number=Utility.getUserInt();
        //logic
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        //output
        if(sum==number){
            System.out.println(number+" is a Perfect number.");
        }
        else{
            System.out.println(number+" is not a Perfect number.");
        }
    }
}
