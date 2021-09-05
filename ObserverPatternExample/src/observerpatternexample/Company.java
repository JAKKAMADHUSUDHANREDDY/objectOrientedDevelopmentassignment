/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Company implements Stock{
    
    private List<Observer> listOfobservers;
    private int price;
    public Company()
    {
        listOfobservers = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer observer){
        listOfobservers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        listOfobservers.remove(observer);
    }
    @Override
    public void notifyObserver(){
         for(Observer obs : listOfobservers){
            obs.update(price);
        }
        
    }
    public void pricechange(int price)
    {
        this.price = price;
        notifyObserver();
    }
}
