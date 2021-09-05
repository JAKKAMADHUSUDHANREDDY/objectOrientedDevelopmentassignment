 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternexample;

/**
 * This application is used to notify the customers about the product price change.
 * @author Dell
 */
public class ObserverPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
            // TODO code application logic here
          
            Company c = new Company();
            // Stock products in the company
            Observer obs1 = new Mobile();
            Observer obs2 = new Laptop();
            Observer obs3 = new Desktop();
            Observer obs4 = new DisplayBoard();

            c.addObserver(obs1);
            c.addObserver(obs2);
            c.addObserver(obs3);
            c.addObserver(obs4);
            // change the price of products 
            c.pricechange(1000);
            // remove desktop from the company
            c.removeObserver(obs3);
            System.out.println("After Price changed:");
            //Again change the price of products
            c.pricechange(5000);

        
    }
    
}
