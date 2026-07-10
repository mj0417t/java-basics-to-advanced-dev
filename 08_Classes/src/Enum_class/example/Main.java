package Enum_class.example;

public class Main {
    public static void main(String[] args) {
        isWeekend(2);
        isWeekend(54);
        isWeekend(100);


        //better readability and full control on what value we can pass in parameter
        isWeekend(Weekdays.FRIDAY);
        isWeekend(Weekdays.SATURDAY);

    }
    public static boolean isWeekend(int day){
        if (WeekConstants.SATURDAY==day || WeekConstants.SUNDAY==day){
            return true;
        }
        return false;
    }

    public static boolean isWeekend(Weekdays day){
        if (Weekdays.SATURDAY==day || Weekdays.SUNDAY==day){
            return true;
        }
        return false;
    }
}
