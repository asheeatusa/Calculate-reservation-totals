/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg9.pkg1.ashenafi.gichamo;

/**
 *
 * @author agichamo
 */
public class CountUtil  {
    
    public static void count(Countable c, int maxCount)
    {
        for(int i=0;i<maxCount;i++)
        {
        
        c.incrementCount();
        c.getCount();
        
          
       System.out.println(c.getCountString());
        
        }
        
      
        
        
    }
    
}
