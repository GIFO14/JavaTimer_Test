package mylibraries;

import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TimerOneHour {
    
    private int minutes = 60, preWarning;
    
    private boolean check = true, checkChangeHourWinter = false/*, checkChangeHourSummer = true*/;
    
    private RedColor rc = new RedColor();
    
    public TimerOneHour(int i) {
        
        this.preWarning = i;
        
    }
    
    public void Code() {
        
        while (minutes > preWarning) {
            
            try {
                
                TimeUnit.MINUTES.sleep(1);
                
            } catch (Exception e) {
                
                System.out.println("Error");
                
            }
            
            minutes--;
            
        }
        
        while (minutes > 0) {
            
            if (check) {
                boolean visible = true;
                
                for (int a = 1; a <= 12; a++) { // Se ejecuta 12 veces y cada ejecución dura 5 segundos -> 5*12 = 60 segundos

                    rc.setVisible(visible);
                    
                    try {
                        
                        TimeUnit.SECONDS.sleep(5);
                        
                    } catch (Exception e) {
                    }
                    
                    visible = !visible;
                }
                
                minutes--;
                
            } else {
                
                rc.setVisible(false);
                
            }
            
        }
        
    }
    
    public void Timer() {
        while (0 == 0) {
            if (!checkChangeHourWinter) {
                
                try {
                    
                    TimeUnit.HOURS.sleep(1);
                    
                } catch (InterruptedException e) { 
                }
                
                Code();
                
            } else {
                
                Code();
                
            }
        }
    }
    
    public void setCheck(boolean check) {
        this.check = check;
    }
    
    public void setCheckChangeHourWinter(boolean checkChangeHourWinter) {
        this.checkChangeHourWinter = checkChangeHourWinter;
    }
    
}
