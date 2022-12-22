package alistirma_Week;

import java.time.LocalDateTime;

public class BonusWeek2 {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today = "+today);

        int hour = today.getHour();
        System.out.println(hour);
        int minute = today.getMinute();

        int second = today.getSecond();
        System.out.println(hour+":"+minute+":"+second);


    }
}
