/*
depending on how many days before the event the ticket is purchased, it stores the values of an advance ticket,  
*/

package tester;

import java.util.Scanner;

public class AdvanceTicket extends Ticket {    

  public AdvanceTicket(){
    Scanner db = new Scanner(System.in);
    System.out.println("How many days before the event are you purchasing your ticket?");
    int days = db.nextInt();
    // days before is 10 or less days
    if(days >= 10){
      price=30;
      ticket++;
    }
    // days before is more than 10
    else{
        this.price=40;
        ticket++;
    }
  }
}
