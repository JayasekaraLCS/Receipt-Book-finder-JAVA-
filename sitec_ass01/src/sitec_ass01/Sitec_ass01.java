// JAYASEKARA LCS || BSc(Hons)Management and Information Technology- University of kelaniya SriLanka
package sitec_ass01;
import java.util.Scanner;


public class Sitec_ass01 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("to exit, press  \"0\"");
        /* A store has some receipt books receipts. a receipt book has 100 receipts and all receipts book are connected with receipts numbers respectively.
        eg- 1 book(1-100)  2-book(101-200)  3-book(201-300). create an program that will print the relevent book number when input the receipt number. */
        
        int receipt_no;
        do{
            
        System.out.print ("Enter the receipt number: ");
        receipt_no= Sc.nextInt();
        
        int mod;
        mod= receipt_no%100;
        int book_no;
        
        if(mod>0){
           book_no= (receipt_no/100)+1; 
        }
        else{
           book_no=(receipt_no/100);
        }
        
        System.out.println("The book number is: "+book_no);
            
        }
        while(receipt_no!=0);
        System.out.println("Thank you!!");
            
        
        
        
        
        
    }
    
}
