
import java.util.ArrayList;
import java.util.Random;
public class Parties {
    Random random=new Random();
    ArrayList<Milletvekilleri> milletvekilleri=new ArrayList<>();
    ArrayList<Milletvekilleri> meclisuyeleri=new ArrayList<>();
    String PartiAdi;
    int uyeSayisi;
    public Parties(String PartiAdı){
        this.PartiAdi=PartiAdı;
    }

    public ArrayList<Milletvekilleri> getPartyMembers(){
        return this.milletvekilleri;
    }
    public String uyeEkle(Milletvekilleri mv){
        milletvekilleri.add(mv);
        return mv+" "+ this.PartiAdi +" 'ye üye oldu.";
    }
    String yazi="";
    public String getAllMembers(){
        for(Milletvekilleri mv:milletvekilleri){
            yazi+=mv+"\n";
        }
        return yazi;
    }
    public String getName(){
        return PartiAdi;
    }
    public int countMember(){
        return milletvekilleri.size();
    }
}