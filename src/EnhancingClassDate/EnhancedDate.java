package EnhancingClassDate;

public class EnhancedDate {

private int day; // 1-31

private int month; // 1-12

private int year; // any year

private String dateFormat; // dd/mm/yyyy, mm/dd/yyyy, yyyy/mm/dd

private static final int[] daysPerMonth =

{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public EnhancedDate(int day, int month, int year, String dateFormat) {

if (month <= 0 || month > 12) {

throw new IllegalArgumentException("Invalid month (" + month + ")");

}

if (day <= 0 || day > daysInMonth(month, year)) {

throw new IllegalArgumentException("Invalid day (" + day + ")");

}

if (year < 0) {

throw new IllegalArgumentException("Invalid year (" + year + ")");

}

this.day = day;

this.month = month;

this.year = year;

this.dateFormat = dateFormat;

}

public void setDateFormat(String dateFormat) {

this.dateFormat = dateFormat;

}

public String toString() {

if (dateFormat.equals("dd/mm/yyyy")) {

return String.format("%02d/%02d/%04d", day, month, year);

} else if (dateFormat.equals("mm/dd/yyyy")) {

return String.format("%02d/%02d/%04d", month, day, year);

} else if (dateFormat.equals("yyyy/mm/dd")) {

return String.format("%04d/%02d/%02d", year, month, day);

} else {

throw new IllegalArgumentException("Invalid date format (" + dateFormat + ")");

}

}

private boolean isLeapYear(int year) {

return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

}

private int daysInMonth(int month, int year) {

if (month == 2 && isLeapYear(year)) {

return 29;

} else {

return daysPerMonth[month];

}

}

public void nextDay() {

int daysInMonth = daysInMonth(month, year);

if (day == daysInMonth) {

day = 1;

if (month == 12) {

month = 1;

year++;

} else {

month++;

}

} else {

day++;

}

}

}
