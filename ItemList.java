import java.util.ArrayList;
 //class ItemList
public class ItemList {

    public ArrayList<Item> list = new ArrayList<Item>(); // instance variable of an array list of items 
    public String ItemListName ; // String for the name of the item 
    public Item Item ; // item used 

    public ItemList(String ItemListName){
        this.ItemListName = ItemListName; // cnstructor that accepts and stores name 
    }

    //constructor that accepts ItemList and the lists name 
    public ItemList(ArrayList<Item> ItemList, String ItemListName){
      this.list = ItemList ; // set itemList
      this.ItemListName = ItemListName ; //setList name 
    }

    //toString method for printing
    public String toString(){
        String ListToString = "";// create empty string 
        //loop through the list 
        for(int i = 0 ; i < list.size() ; i++){
         ListToString +=  list.get(i).toString() + "\n"; // add the listName and store in ListToString 
        }
        return ListToString ; // return ListToString 
    }

    // decrease method 
    public void ItemListDecrease(String itemName, int Itemquantity) {
        int index = Search(itemName); //search Item index at name 
        if (index == -1) {// if the returned  index is -1 meaning the item doesnt exist 
            System.out.println(
                    "WARNING DECREASING QUANTITY OF " +  itemName    + "   BY  " + Itemquantity   + " WHICH DOES NOT EXIST"); //print error message warning that item is missing 
        } else {
            // if its a tangible decrement 
            if (list.get(index).getQuantity() > Itemquantity) {
                Item newItem = list.get(index); // get the item
                newItem.setQuantity(newItem.getQuantity() - Itemquantity); // reduce its quantity by the decrement amount 
            } else if( list.get(index).getQuantity() <= Itemquantity) {
                System.out.println("WARNING DECREASING QUANTITY OF " +   itemName + "  BY  " +  Itemquantity +     "  BUT  THERE  ARE ONLY   "  +   list.get(index).getQuantity()  + "  IN LIST"); //print if decreasing amount is greater than amount available
                remove(list.get(index), list); //remove the item as well
            }     
        }
    }
    
    //private functions used only in the itemList class 

   
    private void remove(Item item2,  ArrayList<Item>listOfItem) {
        // search the itemList 
        if(Search(item2.getItemname()) != -1){
           listOfItem.remove(item2); // if the item was seen remove  the item 
        }
    }

    public void ItemListIncrease(String itemName, int Itemquantity) {
        int index = Search(itemName); //create integer that returns the result of search
        // if the object sint found 
        if (index == -1) {
            list.add(new Item(itemName, Itemquantity));// add a brand new item 
        } else {
            Item newItem = list.get(index); //take the item at that index
            newItem.setQuantity(newItem.getQuantity() + Itemquantity);//add this amount to the itemQuantity 
        }
    }
     
      
    //private functions used only in the itemList class 
     //search method gto verify the index of a present element 
    private int Search(String name) {
        // search through the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getItemname().equalsIgnoreCase(name)) {// return the itemname from the arrayList of items at  index i
                return i;
            }
        }
        return -1; // if not  present return -1
    }
   
    // getter to get the itemName when printing 
    public String getItemListName() {
        return  this.ItemListName ; // return item name 
    }
}
