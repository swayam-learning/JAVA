package Java_basics.codes.OOPs.aggregation;

public class implementing_aggregation {
    public static void main(String[] args) {
        Testing_aggregation t1 = new Testing_aggregation("swayam",200000,23);
        aggregation agger = new aggregation(20,t1);
        agger.display_info();
    }
}
class aggregation{
    int working_hours;
    Testing_aggregation agg;
    aggregation(int working_hours,Testing_aggregation agg){
        this.working_hours = working_hours;
        this.agg = agg;
    }
    void display_info(){
        System.out.println("the name of employee is "+agg.employee_name+" he/she earns salary "+agg.salary+" his/her " +
                "employee id is "+ agg.employee_id+" he/she works for "+working_hours +" hrs");
    }
}
