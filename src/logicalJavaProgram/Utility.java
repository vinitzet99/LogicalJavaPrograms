package logicalJavaProgram;
import java.util.Scanner;
public class Utility {
    private final static   Scanner sc=new Scanner(System.in);
    public static char getUserChar(){
        return sc.next().charAt(0);
    }
    public static Double getUserDouble(){
        return sc.nextDouble();
    }
    public static int getUserInt(){
        return sc.nextInt();
    }
}

