/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author Acer
 */
public class BClock {
    public static  IClock build (int id){
        if(id == 2)
        {
            return new ClockM();
        }
        if(id == 3)
        {
            return new ClockS();
        }
        return null;
    }
}
