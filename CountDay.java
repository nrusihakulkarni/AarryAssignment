package ControlStatementAndArry;
import java.util.Date;
import java.util.StringTokenizer;

class DatToday {
    String day;
    public void infoTodayday() {
        int count = 0;
        Date date = new Date();
        System.out.println(date);
        StringTokenizer s = new StringTokenizer(date.toString(), " ");
        while (s.hasMoreElements()) {
            s.nextElement();
            count++;
            if (count ==1 || count == 2 ) {
                this.day = day+" "+ s.nextElement().toString();

            }
        }
    }
}

class TodayDay extends DatToday {
    public void infoTodayday() {
        super.infoTodayday();
        System.out.println(super.day);
    }
}

public class CountDay {
    public static void main(String[] args) {
        TodayDay todayday = new TodayDay();
        todayday.infoTodayday();
    }
}
