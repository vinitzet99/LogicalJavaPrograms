/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Newton's method:
 * Generate Binary Conversion for Decimal Number then swap nibbles and find new generated number
 */
package logicalJavaProgram;

public class Binary {
    //method to convert binary to decimal
    public static void toDecimal(int[] binary,int length){
        //variable declaration
        int sum=0,i;
        /**
         * power 2 for i if 1
         * add to get decimal
         */
        for(i=length-1;i>=0;i--){
            if(binary[i]==1) {
                sum = (int) (sum + Math.pow(2, i));
            }
        }
        System.out.println("\nDecimal Conversion is : "+sum);
    }
    public static void main(String[] args){
        //variable declaration
        int temp,number,j,length,i=0,k,changeValue,bit=0;
        //input
        System.out.println("Enter a number: ");
        number= Utility.getUserInt();
        int[] binary=ToBinary.toBinary(number);
        //find length of binary
        for(i=0;i<50;i++){
            if(binary[i]==2){
                break;
            }
        }
        length=i;
        changeValue=i/4-1;
        /**reversing binary
         * find position to be changed
         * interchange the nibble
         */
        for(j=0;j<length/8;j++){
            for(k=0;k<4;k++){
                temp=binary[j*4+k];
                binary[j*4+k]=binary[changeValue*4+k];
                binary[changeValue*4+k]=temp;
            }
            changeValue--;
        }
        /**
         * print reverse
         */
        System.out.print("\nReverse Conversion is : ");
        for(j=i-1;j>=0;j--) {
            System.out.print(binary[j]);
            bit++;
            if (bit % 4 == 0) {
                System.out.print(" ");
            }
        }
        //convert to decimal
        toDecimal(binary,i);
    }
}
