/*
stores the values of an advance ticket, depending on how many days beforethe event it's purchased, 
with the student discount.
*/
   
package tester;

import java.util.Scanner;

public class StudentAdvanceTicket extends AdvanceTicket{

  public StudentAdvanceTicket(){
   Scanner db = new Scanner(System.in);
    System.out.println("How many days before the event are you purchasing your ticket?");
    int days = db.nextInt();
    System.out.println("Are you a student?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    int stud = db.nextInt();
    // days before is 10 or less days
    if(days >= 10 && stud == 1){
      price=15;
      ticket++;
    }
    // days before is more than 10
    if(days <= 10 && stud == 1){
        this.price=20;
        ticket++;
    } 
  }
}
