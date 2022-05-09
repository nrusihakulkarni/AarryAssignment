package ControlStatementAndArry;

class Continue {
    void continueDemo() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String str : days) {

            if (str.contains("Thur")) {
                continue;
            }
            System.out.println(str);
        }
    }
}


public class PrintDayString {
    public static void main(String[] args) {
        Continue continuee = new Continue();
        continuee.continueDemo();

    }
}
