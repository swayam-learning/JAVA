package Questions.easy;

public class Leap_Year {
    static boolean leap_year(int year){
        if((year%400==0 || year%4==0) && year%100==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(leap_year(2009)?"Leap Year":"Not Leap Year");
    }
}
