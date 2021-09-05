/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternexample;

/**
 *
 * @author Dell
 */
public class Mobile implements Observer{
    @Override
    public void update(int price)
    {
        System.out.println("The price of Mobile has been changed to: " + price);
    }
}
