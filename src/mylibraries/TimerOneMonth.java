
package mylibraries;

public class TimerOneMonth {
    
    private int i = 0;
    
    public TimerOneMonth(int i){
        
        this.i=i;
        
    }
    
    private TimerOneWeek tow = new TimerOneWeek(i);
    
    public void Timer(){
        
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        tow.Timer();
        
        
    }
}
