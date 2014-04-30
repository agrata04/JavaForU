/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @author asd
 */
public class Safari extends Santro{
   
    private String benefit;
    
    Safari()
    {
        benefit = "Commercial";
        
    }
    
    public void ShowBenefit()
    {
        System.out.println("It has benefit that it's"+benefit);
              
    }
}
