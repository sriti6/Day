public class Day {
private String day;
private String [] days = {"mon","Tue","Wed","Thu","Fri","Sat","Sun"};
public Day (String day){
    super();
    this.day = day;

}

    public String getDay() {
        return day;
    }


public void setDay (String day){
    this.day = day;
}

public String nextDay(){
    String message = "";
            int dayIndex = getdayIndex(this.day);
            if (dayIndex! = -1){
                message = days [dayIndex];

            }else {
              message = "Invalid day!";
            }

    return message;
}
private int getdayIndex(String day){
    for (int i=0;i<days.length;i++) {
        if (days[i] == this.day) {
            return i;

        }
    }
        return = 1;
    }
public String toString(){
    return "Day [days" + day +"]";
}





}
