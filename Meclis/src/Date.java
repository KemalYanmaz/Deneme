public class Date {
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
      int counter=0;
      int[] daysinmonths={0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=this.getMonth();i<=12;i++){
          if(total>=daysinmonths[i]){
              total-=daysinmonths[i];
          counter++;
          }
        }
        return respecttoyear/360;
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
    
    
}