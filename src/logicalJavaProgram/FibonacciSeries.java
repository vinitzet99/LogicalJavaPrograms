/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * series in which the next term is the sum of the previous two terms.
 */
package logicalJavaProgram;

public class FibonacciSeries {
    public static void main(String[] args){
        //variable declaration
        int term1,term2,number;
        //input
        System.out.println("Enter 1st term of the series");
        term1=Utility.getUserInt();
        System.out.println("Enter 2nd term of the series");
        term2=Utility.getUserInt();
        System.out.println("Enter no of terms for series: ");
        number=Utility.getUserInt();
        //logic and output
        for(int i=0;i<number;i++){
            if(i==0){
                System.out.print(term1+" ");
            }
            else if(i==1){
                System.out.print(term2+ " ");
            }
            else{
                term2=term1+term2;
                System.out.print(term2+ " ");
                term1=term2-term1;
            }
        }
    }
}
