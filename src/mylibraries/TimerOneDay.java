
package mylibraries;

import java.util.concurrent.TimeUnit;

public class TimerOneDay {
    
    private int i = 0, j = 25;
    
    public TimerOneDay(int i){
        
        this.i=i;
        
    }
    
    TimerOneHour toh = new TimerOneHour(i);
    
    public void Timer(){
        
        TwoHoursAndPlayground();
        TwoHoursAndPlayground();
        
        toh.Timer();
        toh.Timer();

    }
    
    public void TwoHoursAndPlayground(){

        toh.Timer();
        toh.Timer();
        
        try {

            TimeUnit.MINUTES.sleep(j);

        } catch (Exception e) {

            System.out.println("Error");

        }
        
        j = 20;
        
    }
    
    
    
}
