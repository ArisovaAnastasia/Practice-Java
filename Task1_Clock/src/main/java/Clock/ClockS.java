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
public class ClockS extends ClockM {
    int seconds=0;
    public ClockS(){
        
    }

    @Override
    public void addTime(int h, int m, int s){
        this.addHours(h);
        this.addMinutes(m);
        this.addSeconds(s);
    }
    
    public void setSeconds(int seconds) throws IllegalArgumentException{
        if(!(seconds < 0 || seconds > 59))
            this.seconds=seconds;
        else throw new IllegalArgumentException("Value of parameter Seconds is incorrect!");
    }
    
    @Override
    public String toString(){
        return super.toString() + "("+seconds+")";
    }
    
    public void addSeconds(int ss)throws IllegalArgumentException {
        if(ss < 0 || ss > 59){
            throw new IllegalArgumentException("Value of adding parameter Seconds is incorrect!"); 
        }
            seconds += ss;     

        if(seconds < 0 || seconds > 59) {
            minutes += seconds / 60;
            seconds = seconds % 60;
            addMinutes(0);
        } 
    }
}
