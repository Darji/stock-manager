import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Akash Darji) 
 * @version (0.0.1)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        
       boolean match;
       Product testing = item;
       for(Product checking : stock){
           // getting an error
           if(testing.getID() = checking.getID()) {
               match = true;
           }//end of if
           else {
               match = false;
           }//end of else
       }// end of for
      
       if(match = false) {
           stock.add(item);
       }// end of if 
       else {
           System.out.println("Sorry, the product ID you entered already exists. Please enter a new one.");
       }// end of else

    }// end of public void addProduct
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        
       if(findProduct(id) != null) {
           findProduct(id).increaseQuantity(amount);
       }// end of if
       else {
           System.out.println("That item ID cannot be found.");
       }// end of else 

    }// end of public void delivery
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        
       for(Product checking : stock) {
           if(checking.getID() == id) {
               return checking;
           }// end of if
       }// end of for

        return null;
    }// end of public Product findProduct
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        
       if(findProduct(id) != null) {
           return findProduct(id).getQuantity();
       }// end of if
       else {
        return 0;
    }// end of else
    } //end of public int numberInStock

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        
       for(Product detail : stock) {
           System.out.println(detail.toString());
       }// end of for

    }// end of public void printProductDetail
}// end of public class StockManager
