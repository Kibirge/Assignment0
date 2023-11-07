import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Marcel
 *  Class:          CS30S
 * 
 *  Assignment:     A0.0
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class Base2ToBase10 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
    
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
        int n = 0;              //base to number 
        char v=' ';             //character value number
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("binData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Marcel" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A0.0" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
        System.out.println("Binary         Decimal");
        strin = fin.readLine();
        
    // ***** Main Processing *****
    while(strin!=null){
        //System.out.print(strin);
        n = 0;
        for(int i = 0; i < strin.length(); i++){
            v=strin.charAt(strin.length()- 1- i);
            
            n +=Character.getNumericValue(v) * (int)Math.pow(2,i);
        }
        System.out.format("%-17s%-5s",strin, n);
        System.out.println();
        strin=fin.readLine();
    }
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
