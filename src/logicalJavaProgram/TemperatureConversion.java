/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Temperature Conversion
 */
package logicalJavaProgram;

public class TemperatureConversion {
    public static void main(String[] args){
        double f,c;
        System.out.println("Choose type of Conversion\n1. Fahrenheit to Celsius \n2. Celsius to Fahrenheit");
        int ch=Utility.getUserInt();
        switch(ch) {
            case 1:
                System.out.println("Enter Temp in Fahrenheit:");
                f = Utility.getUserDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius is: " + c + " C");
                break;

            case 2:
                System.out.println("Enter Temp in Celcius:");
                c = Utility.getUserDouble();
                f = (9*c)/5+32;
                System.out.println("Fahrenheit is: " + f + " F");
                break;
            default:
                System.out.println("Invalid Input.Enter Valid Choice");
        }
    }
}
