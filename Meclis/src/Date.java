
import java.time.Instant;


public class Date {
    static int currentYear=Integer.valueOf(Instant.now().toString().substring(0,4));
    static int currentMonth=Integer.valueOf(Instant.now().toString().substring(5,7));
    static int currentDay=Integer.valueOf(Instant.now().toString().substring(8,10));
    
    private int day;
    private int month;
    private int year;
        public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int datedifference(Date newdate){
      int respecttoyear=(newdate.getYear()-this.getYear())*360;
      int respecttomonth=(newdate.getMonth()-this.getMonth())*30;
      int respecttoday=(newdate.getDay()-this.getDay());
      int total=respecttoyear+respecttomonth+respecttoday;
      int z=total;
      int monthCounter=0;
 
      int[] daysinmonths={0,31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=this.getMonth();i<=12;i++){
          if(total>=daysinmonths[i]){
              total-=daysinmonths[i];
              
            monthCounter++;
            if(i==12&& total>31)
                i=0;
          }
 
        }
       
        return z/360;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return day+","+month+","+year;
    }
    public static Date getCurrentDate(){
        return new Date(currentDay, currentMonth, currentYear);
    }
    public static String getTime(){
        return Instant.now().toString().substring(11,19);
    }
          
}