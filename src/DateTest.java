class Date{
    private int day;
    private  int month;
    private  int year;

    boolean contains(int[] arr , int tar){
        for(int i : arr){
            if(i == tar){
                return true;
            }
        }
        return false;
    }
    boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int[] monthsWith30Days = {4, 6, 9, 11};
        int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};
        if (contains(monthsWith30Days , this.month)){
            if(day > 0 && day<=30 ){
                this.day = day;
            }
            else{
                System.out.println("Enter the valid date");
            }
        }
        else if (contains(monthsWith31Days , this.month)){
            if(day > 0 && day<=31 ){
                this.day = day;
            }
            else{
                System.out.println("Enter the valid date");
            }
        }
        else if(this.month == 2){
            if (isLeapYear(this.year)){
                if(day > 0 && day<=29 ){
                    this.day = day;
                }
            }
            else if(day > 0 && day<=28 ){
                    this.day = day;
            }
            else{
                System.out.println("Enter the valid date");
            }


        }



    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12 ) {
            this.month = month;
        }
        else {
            System.out.println("Enter a vaild month");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1582) {
            this.year = year;
        }
        else {
            System.out.println("Enter a valid Year");
        }
    }

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);

    }
    void displayDate(){
        System.out.println(this.day + "/" + this.month+ "/" + this.year);
    }
}


public class DateTest {
    public static void main(String[] args) {
        Date D1 = new Date(5,17,2025);
        D1.displayDate();
    }
}
