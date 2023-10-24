package Day32;

public class SwitchMonths {
    public static void main(String[] args) {
        int month = 8;
        String monthsString = "";

        switch (month) {
            case 1 -> monthsString = "January";
            case 2 -> monthsString = "February";
            case 3 -> monthsString = "March";
            case 4 -> monthsString = "April";
            case 5 -> monthsString = "May";
            case 6 -> monthsString = "June";
            case 7 -> monthsString = "July";
            case 8 -> monthsString = "August";
            case 9 -> monthsString = "September";
            case 10 -> monthsString = "October";
            case 11 -> monthsString = "November";
            case 12 -> monthsString = "December";
            default -> System.out.println("Invalid month");
        }
        System.out.println(monthsString);
    }
}
