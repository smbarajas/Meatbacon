/* 
This class will hold the default values and price, store values for the ticket number and price, depending on the ticket type. 
Will also return the value of the price.
*/

public class Ticket {
    public int ticket;
    public double price;

  public Ticket(){
    super();
    this.ticket=1;
    this.price=15.0;        
  }

  public Ticket(int ticket, double price){
    this.ticket=ticket;
    this.price=price;   
  }


  public double getPrice(){
    return price;
  }

  @Override
  public String toString(){
    return "Ticket #" + ticket + " Ticket price: $"+ price; 
  }
}
