
// Designed and coded items in a library including books, DVDs, and CDs

class Main {
  public static void main(String[] args) {
    //add items to the library
    Item[] Item = {new Item("book", "Time Traveler's Wife", "02242374"), 
                   new Item("cd", "Backstreet Boys", "006812386"),
                   new Item("dvd", "Pokemon", "00688756"), 
                   new Item("book", "The Great Gatsby", "02123374")};
    
    //check out the first item
    Item[0].checkOut();

    // print information about every item
    for (int i = 0; i < Item.length; i++) {
        Item[i].printItemInfo();
    }
  }
}
