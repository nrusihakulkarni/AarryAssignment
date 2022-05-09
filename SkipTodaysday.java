package ControlStatementAndArry;

import java.util.Date;
import java.util.StringTokenizer;

// Get Today's day from system and skip Today's day and print list of days

class Today {
    String day;

    public String StringTOknizerInfo() {
        Date date = new Date();
        System.out.println(date);
        StringTokenizer s = new StringTokenizer(date.toString(), " ");
        this.day = s.nextElement().toString();
       /* System.out.println("*******************************");

        System.out.println(day);
        System.out.println("*************************************");
        */
        return day;
    }
}

class ContinueTodayDate {


    public void continueTodayDate() {
        Today today = new Today();
        String day = today.StringTOknizerInfo();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String str : days) {

            if (str.contains(day)) {
                continue;
            }
            System.out.println(str);
        }
    }
}


public class SkipTodaysday {
    public static void main(String[] args) {
        ContinueTodayDate continueTodayDate = new ContinueTodayDate();
        continueTodayDate.continueTodayDate();

    }
}
