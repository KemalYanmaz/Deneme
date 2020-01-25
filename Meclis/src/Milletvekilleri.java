public class Milletvekilleri extends Vatandaslar{

    public Milletvekilleri(Date birthday, String name, String surname) {
        super(birthday, name, surname);
    }
    public void voting(boolean vote){
        if(vote){
            System.out.println(super.getName()+" "+super.getSurname()+" voting possitive.");
        }else{
            System.out.println(super.getName()+" "+super.getSurname()+" voting negative.");
        }
    }

    
}