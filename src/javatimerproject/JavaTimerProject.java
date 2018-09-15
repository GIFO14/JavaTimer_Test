package javatimerproject;

import java.util.Scanner;
import mylibraries.HourChange;
import mylibraries.TimerFortyWeeks;

public class JavaTimerProject {

    private static TimerFortyWeeks tfw;
    private static HourChange hc = new HourChange();
    private static Scanner sc = new Scanner(System.in);
    
    private static int preWarning = 0;
    
    public static void main(String[] args) {
        
        System.out.print("Introdueix el temps de preavís: ");
        preWarning = sc.nextInt();
        
        tfw = new TimerFortyWeeks(preWarning);
        tfw.start();
        hc.start();
        
    }
    
}
