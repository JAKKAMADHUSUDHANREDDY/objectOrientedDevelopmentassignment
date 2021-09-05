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
public interface Stock {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}
