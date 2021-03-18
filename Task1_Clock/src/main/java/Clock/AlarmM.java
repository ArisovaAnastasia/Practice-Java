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
public class AlarmM {
    private int key_h = 0, key_m = 0;
    
    public AlarmM(){}
           
   
    private void setKey_H (int h) throws IllegalArgumentException{
        if(h < 0 || h > 23)
            throw new IllegalArgumentException("Value of parameter Key_Hours is incorrect!");
        else {
            this.key_h = h;
        }
    }
    private void setKey_M (int m) throws IllegalArgumentException{
        if(!(m < 0 || m > 59)){
            this.key_m = m;
        }
        else throw new IllegalArgumentException("Value of parameter Key_Minutes is incorrect!");
    }
    public void setKeyTime (int h, int m) throws IllegalArgumentException{
        this.setKey_H(h);
        this.setKey_M(m);
    }
    
    public boolean Update(int h, int m){
        if ((this.key_h == h)&&(this.key_m == m)){
            System.out.println("GET UP !!!     GET UP !!!     GET UP !!!     GET UP !!!");
            return true;
        }  else return false;
    }
}
