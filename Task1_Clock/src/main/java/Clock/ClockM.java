/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Acer
 */
public class ClockM implements IClock{
    protected float price;
    protected String brand;
    protected int hours=0;
    protected int minutes=0;
    protected ArrayList<AlarmM> arrayAlarm = new ArrayList<>();
    
    public ClockM(){}

    public boolean isValid(int data) {
        return !(data < 0 || data > 59);
    }
    
    private void setHours(int hours)throws IllegalArgumentException{
        if(hours < 0 || hours > 23)
            throw new IllegalArgumentException("Value of parameter Hours is incorrect!");
        else this.hours = hours;
    }
    private void setMinutes(int minutes) throws IllegalArgumentException{
        if(!(minutes < 0 || minutes > 59))
            this.minutes=minutes;
        else throw new IllegalArgumentException("Value of parameter Minutes is incorrect!");
    }
    protected void setSeconds(int seconds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setPrice (float price){
        this.price=price;
    }
    public void setBrand (String brand){
        this.brand=brand;
    }
    
    @Override
    public float getPrice (){
        return this.price;
    }
    @Override
    public String getBrand (){
        return this.brand;
    }
    @Override
    public String toString(){
        return hours + ":" + minutes;
    }
    
    @Override
    public void setTime(int h, int m, int s) throws IllegalArgumentException{
        this.setHours(h);
        this.setMinutes(m);
        
        Iterator<AlarmM> alarmIterator = arrayAlarm.iterator();//создаем итератор
        while(alarmIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            AlarmM temp = alarmIterator.next();//получаем следующий элемент
            if (temp.Update(this.hours, this.minutes)) {
                alarmIterator.remove();//удаляем кота с нужным именем
            }
        }
    }
    
    @Override
    public void addTime(int h, int m, int s) throws IllegalArgumentException{
        this.addHours(h);
        this.addMinutes(m);
        
        Iterator<AlarmM> alarmIterator = arrayAlarm.iterator();//создаем итератор
        while(alarmIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            AlarmM temp = alarmIterator.next();//получаем следующий элемент
            if (temp.Update(this.hours, this.minutes)) {
                alarmIterator.remove();//удаляем кота с нужным именем
            }
        }
    }
            
    public void addHours(int hh) throws IllegalArgumentException{
        if(hh < 0) {
            throw new IllegalArgumentException("Value of adding parameter Hours is incorrect!");
        }
        
        hours += hh;        

        if(hours >= 24)
            hours = hours % 24;
    }
    public void addMinutes(int mm)throws IllegalArgumentException {
        if(mm < 0 || mm > 59){
            throw new IllegalArgumentException("Value of adding parameter Minutes is incorrect!");
        }   
        minutes += mm; 

        if(minutes < 0 || minutes > 59) {
            hours += minutes / 60;
            minutes = minutes % 60;
            addHours(0);
        }
    }

    @Override
    public void setAlarm(AlarmM alarm) {
        this.arrayAlarm.add(alarm);
    }

    @Override
    public void deleteAlarm(AlarmM alarm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
