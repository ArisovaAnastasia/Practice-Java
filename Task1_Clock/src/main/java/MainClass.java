
import Clock.BClock;
import Clock.IClock;
import Clock.AlarmM;
import java.io.DataInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MainClass {
    public static void main(String[] argv) throws IOException {
        IClock c1;
        AlarmM alarm = new AlarmM();
        AlarmM alarm2 = new AlarmM();
        c1 = BClock.build(2);

        try
        { 
            alarm.setKeyTime(10, 30);
            alarm2.setKeyTime(11, 30);
            c1.setAlarm(alarm);
            c1.setAlarm(alarm2);
            
            c1.setTime(10, 30, 0);
            System.out.println(c1);
            c1.addTime(0, 30, 0);
            System.out.println(c1); 
            c1.addTime(0, 30, 0);
            System.out.println(c1); 
            c1.addTime(24, 0, 0);
            System.out.println(c1); 
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
