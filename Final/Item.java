// A class to represent the an item in the library

public class Item {
  private String ItemType, ItemName, ItemNumber; 
  private boolean isCheckedOut = false;

  public Item (String ItemType, String ItemName, String ItemNumber){
    this.ItemType = ItemType;
    this.ItemName = ItemName;
    this.ItemNumber = ItemNumber;
  }

  public void printItemInfo(){
    //print out information about the item
    System.out.println(ItemName + ":");
    System.out.println("Item Type - " + ItemType);
    System.out.println("Item Number - " + ItemNumber);
    System.out.println("Checked out - " + isCheckedOut);
    System.out.println();
  }

  public void checkOut(){
    //set the item as being checked out
    this.isCheckedOut = true;
  }

 public void checkIn(){
   //set the item as being checked back in
    this.isCheckedOut = false;
  }

}
