
package mylibraries;

public class TimerFortyWeeks extends Thread{
  
    private int i = 0;
    
    public TimerFortyWeeks(int i){
        this.i=i;  
    }
    
    private TimerOneMonth tom = new TimerOneMonth(i);
    private TimerOneWeek tow = new TimerOneWeek(i);
    
    @Override
    public void run(){
        
        tom.Timer();
        tom.Timer();
        tom.Timer();
        tom.Timer();
        
        tow.LastDaysTimer();
        
    }
    
}
