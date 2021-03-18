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
public interface IClock {
    float getPrice();
    String getBrand();
    
    void addTime(int h, int m, int s);
    void setTime(int h, int m, int s);
       
    void setAlarm(AlarmM alarm);
    void deleteAlarm(AlarmM alarm);    
}
