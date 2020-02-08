public class Milletvekilleri extends Vatandaslar{
    private int sicilNo;
    public Milletvekilleri(Date birthday, String name, String surname,int sicilNo) {
        super(birthday, name, surname);
        this.sicilNo=sicilNo;
    }
    public String voting(boolean vote){
        if(vote){
            return super.getName()+" "+super.getSurname()+" evet oyu veriyor.";
        }else{
            return super.getName()+" "+super.getSurname()+" hayır oyu veriyor.";
        }
    }
    public int getSicilNo(){
        return this.sicilNo;
    }

    public String toString(){
        return super.getName()+" "+super.getSurname();
        
    } 
    
}