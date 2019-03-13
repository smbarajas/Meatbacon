package tester;
import java.util.Scanner;

public class Tester extends Ticket{

public static void main(String[] args){
    Scanner db = new Scanner(System.in);
    Ticket firstTicket = new Ticket();
    System.out.println("The first ticket: "+firstTicket.toString());
    int x = 0;
    while(x!=2){
        if(x==2){
            System.out.println("Goodbye.");
        }
        else{
           System.out.println("What type of ticket are you purchasing?");
           System.out.println("1.Walk Up");
           System.out.println("2.Advance");
           System.out.println("3.Student Advance");
           int t = db.nextInt();
           if(t==1){

           }
           if(t==2){

           }
           if(t==3){

           }

        }
     System.out.println("Would you like to purchase another ticket?");
     x= db.nextInt();            
    }        
  }   
}
