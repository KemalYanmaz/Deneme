
import java.util.ArrayList;
import java.util.Random;

public  class Vatandaslar {
Random random=new Random();
ArrayList<Integer> identities=new ArrayList<>();  
    private int identityNo;
    private Date birthday;
    private String name,surname;
    private int height,weight;
    public Vatandaslar(Date birthday,String name,String surname){
        this.birthday=birthday;
        this.name=name;
        this.surname=surname;
        this.height=150+random.nextInt(50);
        this.height=50+random.nextInt(50);
        this.identityNo=pushIdentity();
    }

    private int pushIdentity(){
        String id=String.valueOf(random.nextInt(100))+String.valueOf(random.nextInt(100))+String.valueOf(random.nextInt(100));
        while(identities.indexOf(Integer.valueOf(id))!=-1)
        {
          id=String.valueOf(random.nextInt(100))+String.valueOf(random.nextInt(100))+String.valueOf(random.nextInt(100));
        }
        identities.add(Integer.valueOf(id));
        return Integer.valueOf(id);
    }
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ArrayList<Integer> getIdentities() {
        return identities;
    }

    public void setIdentities(ArrayList<Integer> identities) {
        this.identities = identities;
    }

    public int getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void runs(){
        System.out.println(this.name+" koşuyor.");
    }
    public void talking(String text){
        System.out.println(this.name+": \""+text+".\"");
    }
    public void voting(boolean vote){
        if(vote)
        System.out.println(this.name+" wants the law to pass the parliament.");
        else
        System.out.println(this.name+" does not want the law to pass through parliament.");
    }
}