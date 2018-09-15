package mylibraries;

import java.util.concurrent.TimeUnit;

public class HourChange extends Thread{

    private TimerOneHour toh;

    @Override
    public void run() {

        try {

            TimeUnit.DAYS.sleep(12);

        } catch (InterruptedException e) {
        }

        try {

            TimeUnit.HOURS.sleep(13);

        } catch (InterruptedException e) {
        }

        while (0 == 0) {

            toh.setCheckChangeHourWinter(true);

            try {

                TimeUnit.DAYS.sleep(146);

            } catch (InterruptedException e) {
            }

            try {

                TimeUnit.HOURS.sleep(12);

            } catch (InterruptedException e) {
            }
            
            
            toh.setCheckChangeHourWinter(false);
            
            try {

                TimeUnit.DAYS.sleep(227);

            } catch (InterruptedException e) {
            }

            try {

                TimeUnit.HOURS.sleep(13);

            } catch (InterruptedException e) {
            }

        }

    }

}
