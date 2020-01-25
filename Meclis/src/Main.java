import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Vatandaslar> meclis=new ArrayList<>();
    static Random random=new Random();
    static ArrayList<String> names=new ArrayList<>();
    static ArrayList<String> surnames=new ArrayList<>();
    public static void main(String[]args){
        names.add("Kemal");
        names.add("Mustafa");
        names.add("Mehmet");
        names.add("Mert");
        names.add("Cihan");
        names.add("Ümit");
        names.add("Selda");
        names.add("Kazım");
        names.add("İsmail");
        names.add("Enver");
        names.add("Cüneyt");
        surnames.add("Yanmaz");
        surnames.add("Beyoğlu");
        surnames.add("Fatih");
        surnames.add("Nişantaşı");
        surnames.add("Taksim");
        surnames.add("Gazi");
        surnames.add("Kol");
        surnames.add("Eldemir");
        surnames.add("Gülbahçe");
        surnames.add("Sertahta");
        surnames.add("Kahya");
        
        for(int i=0;i<=20;i++){
            meclis.add(new Milletvekilleri(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Milletvekilleri(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Milletvekilleri(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Milletvekilleri(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Vatandaslar(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Vatandaslar(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Vatandaslar(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
            meclis.add(new Vatandaslar(new Date(1+random.nextInt(30), 1+random.nextInt(11),1950+random.nextInt(40)),names.get(random.nextInt(names.size())),surnames.get(random.nextInt(surnames.size()))));
        
        }
        meclis.get(random.nextInt(meclis.size())).voting(random.nextBoolean());
        meclis.get(random.nextInt(meclis.size())).voting(random.nextBoolean());
        meclis.get(random.nextInt(meclis.size())).voting(random.nextBoolean());
        meclis.get(random.nextInt(meclis.size())).voting(random.nextBoolean());
        meclis.get(random.nextInt(meclis.size())).talking("Merhaba arkadaşlar unutmayın ki bugün yepyeni bir gündür");
        meclis.get(random.nextInt(meclis.size())).talking("Birgün beni ararsınız ama bulamazsınız o zaman fazla aramayın");
        Vatandaslar a=meclis.get(random.nextInt(meclis.size()));
        a.talking("Bakın benim adım "+a.getName()+" "+a.getSurname()+". Ben "+String.valueOf(a.getBirthday().datedifference(new Date(02,10,2020)))+" yaşımdayım.");
    }    
}
