// item class 
public class Item {
    //Instance variables 
    public String Itemname;  // String itemName 
    public int Itemquantity; // int  item quantity 
    //public ShoppingList list;
    
    //create constuctor  that sets item name and quantity 
    public Item(String Itemname, int Itemquantity) {
        this.Itemname = Itemname; //store itemName
        this.Itemquantity = Itemquantity; // store ItemQuantity
    }

    public String toString() {
        return String.format(" %d , %s", Itemquantity, Itemname);// return formatted string of the item name and quantity

    }
    public String getItemname() {
        return  this.Itemname ; //get the items name 
    }
    public void setItemname( String itemname) {
         this.Itemname = itemname ;  //setItem name 
    }
    public void setQuantity ( int itemquantity) {
        this.Itemquantity = itemquantity ; // set itemQuantity 
    }
    public int getQuantity() {
       return this.Itemquantity ; // get itemQuantity 
    }

}

