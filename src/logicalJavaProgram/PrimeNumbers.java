/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Number which is only divisible by 1 and itself is prime number. Check if a number is Prime.
 */
package logicalJavaProgram;

public class PrimeNumbers {
    public static void main(String[] args){
        //variable declaration
        int number,flag=0;
        //input
        System.out.println("Enter a number: ");
        number=Utility.getUserInt();
        //logic
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=1;
                break;
            }
        }
        //output
        if(flag==0){
            System.out.println(number+" is Prime.");
        }
        else{
            System.out.println(number+" is not Prime");
        }
    }
}
