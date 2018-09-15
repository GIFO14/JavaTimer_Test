
package mylibraries;

import java.util.concurrent.TimeUnit;

public class TimerOneWeek {
    
    private int i = 0, minutes = 0;
    
    public TimerOneWeek(int i){
        this.i=i; 
    }
    
    private TimerOneDay tod = new TimerOneDay(i);
    private TimerOneHour toh = new TimerOneHour(i);
    
    public void EndToStart(){
        
        tod.Timer();
        
        try{
            
            TimeUnit.HOURS.sleep(17);
            
        }catch (Exception e){
            System.out.println("Error");
        }
        
        try{
            
            TimeUnit.MINUTES.sleep(15);
            
        }catch (Exception e){
            System.out.println("Error");
        }
        
    }

    public void Timer(){
        
        EndToStart();
        EndToStart();
        EndToStart();
        EndToStart();
        EndToStart();
        
        toh.setCheck(false);
        EndToStart();
        EndToStart();
        
        toh.setCheck(true);

        
    }
    
    public void LastDaysTimer(){
        
        EndToStart();
        EndToStart();
        EndToStart();
        EndToStart();
        EndToStart();
        
        toh.setCheck(false);
        EndToStart();
        
        toh.setCheck(true);
        
        toh.Timer();
        toh.Timer();
        toh.Timer();
        toh.Timer();
        
        
        while (minutes > 48){
            
            try {

                TimeUnit.MINUTES.sleep(1);

            } catch (Exception e) {

                System.out.println("Error");

            }
            
            minutes++;
            
        }
        
        
    }
    
}
