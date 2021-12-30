/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Calculate the time elapsed
 */
package logicalJavaProgram;
import java.util.Scanner;

public class Stopwatch {
    /**
     * Asking user to enter character then press enter
     * By clicking enter sStopwatch starts and stops.
     * */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press any character and Press Enter to start the stopwatch.");
        char startCa =Utility.getUserChar();
        long start =System.currentTimeMillis();
        System.out.println("Press any character and Press Enter to stop the stopwatch.");
        char stopCa =Utility.getUserChar();
        long stop =System.currentTimeMillis();
        float timeElapsed=(float)(stop-start)/1000;
        System.out.println("Time elapsed is: "+timeElapsed+" seconds.");
    }
}
