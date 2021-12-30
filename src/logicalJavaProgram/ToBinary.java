/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Generate Binary Conversion for Decimal Number
 */
package logicalJavaProgram;

public class ToBinary {
    //method to convert decimal to Binary
    public static int[] toBinary(int number){
        //variable declaration
        int[] binary=new int[50];
        int i=0,j,k,bit=0;
        /**logic
         * initialize array values
         * while number is not 0
         *      calculate remainder and put it in array
         * append extra 0 to convert to 4 bit if necessary
         * print binary code
         */
        for(j=0;j<50;j++){
            binary[j]=2;
        }
        while(number>0){
            binary[i++]= number%2;
            number= number/2;
        }
        k=i;
        if(i%4!=0) {
            for(j=0;j<4-(i%4);j++) {
                binary[k++]=0;
            }
        }
        i=k;
        //output
        System.out.print("Binary Conversion is  : ");
        for(j=i-1;j>=0;j--){
            System.out.print(binary[j]);
            bit++;
            if(bit%4==0){
                System.out.print(" ");
            }
        }
        return binary;
    }
    //main method
    public static void main(String[] args){
        //variable declaration
        int number,j,bit=0,i=0;
        //input
        System.out.println("Enter a number: ");
        number= Utility.getUserInt();
        int[] binary=toBinary(number);
    }
}
