package CalculateNextDay;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int[] DayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            DayOfMonth[2] = 29;
        }
        if (day == DayOfMonth[month]) {
            day = 1;
            if(month == 12) {
                month = 1;
                year++;
            }
            else {
                month++;
            }
        } else if (day < DayOfMonth[month]) {
            day++;
        }
        return day + "/" + month + "/" + year;

    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}

