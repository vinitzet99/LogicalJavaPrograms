/**
 * @author Vinit Kumar
 * @date 28/12/2021
 * Divide Rs N into 1,2,5,10,50,100,500,1000 Rs such that minimum no of notes returned
 */
package logicalJavaProgram;

public class VendingMachine {
    //main method
    public static void main(String[] args){
        //variable declaration
        int ruppees,count=0,division;
        int notes[]={1000,500,100,50,10,5,2,1};
        //input
        System.out.println("Enter Rupees: ");
        ruppees= Utility.getUserInt();
        /**logic
         * traverse till all notes are used
         *      divided amount by note to get possible number of notes for that note
         *      update amount
         */
        for(int i=0;i<notes.length;i++){
            division=ruppees/notes[i];
            count+=division;
            System.out.println(division+" of Rs "+notes[i]);
            ruppees=ruppees%notes[i];
        }
        System.out.println("Total count of notes: "+count);

    }
}
