import java.util.ArrayList;
import java.util.Random;
public class Names{
    static ArrayList<String> soyad=new ArrayList<>();
    static ArrayList<String> ad=new ArrayList<>();
    static ArrayList<String> tamad=new ArrayList<>();
    Random random=new Random();
    String isim="";
    String soyisim="";

    public Names(){
        init();
        String disim="Kemal";
        String dsoyisim="Yanmaz";
        String dtamisim="Kemal Yanmaz";
        
        while(tamad.contains(dtamisim)){
        disim=ad.get(random.nextInt(ad.size()));
        dsoyisim=soyad.get(random.nextInt(soyad.size()));
        dtamisim=disim+" "+dsoyisim;
        }
        tamad.add(dtamisim);
        this.isim=disim;
        this.soyisim=dsoyisim;
        

    }

    public static ArrayList<String> getAd() {
        return ad;
    }

    public String getIsim() {
        return isim;
    }
    private void init(){
        ad.add("Kemal");        ad.add("Mustafa");        ad.add("Mehmet");        ad.add("Cemal");
        ad.add("Reşit");        ad.add("Tuğrul");        ad.add("Muharrem");        ad.add("Volkan");
        ad.add("Recep");        ad.add("Turan");        ad.add("Ali");        ad.add("Hüseyin");
        ad.add("Hasan");        ad.add("Osman");        ad.add("Kadir");        ad.add("Seyfettin");
        ad.add("Murat");        ad.add("Cüneyt");        ad.add("İsmail");        ad.add("Demir");
        ad.add("Suat");        ad.add("Kamer");        ad.add("Tanju");        ad.add("Ekrem");
        ad.add("Ahmet");        ad.add("Metin");        ad.add("Şahin");        ad.add("Musa");
        ad.add("Cengiz");        ad.add("Metehan");        ad.add("Şakir");        ad.add("Satı");
        ad.add("Hüsnü");        ad.add("Şevket");        ad.add("Mesut");        ad.add("Gülşen");
        ad.add("Elif");        ad.add("Hatice");        ad.add("Fatma");        ad.add("Salih");
        ad.add("Salim");        ad.add("Barış");        ad.add("Yunus");        ad.add("Uğur");
        ad.add("Gül");        ad.add("Gülbahar");        ad.add("Zeynep");        ad.add("Nehir");
        ad.add("Rüzgar");        ad.add("Oğuzhan");     ad.add("Safi");         ad.add("Sabri");        
        soyad.add("Yanmaz");        soyad.add("Yılmaz");        soyad.add("Erdoğan");        soyad.add("Kılıçdaroğlu");
        soyad.add("Bahçeli");        soyad.add("Eldemir");        soyad.add("Demirel");        soyad.add("Kuru");
        soyad.add("Sarı");        soyad.add("Ağaoğlu");        soyad.add("Karbahçe");        soyad.add("Güldeste");
        soyad.add("Suvermez");        soyad.add("Ağlamaz");        soyad.add("Korkmaz");        soyad.add("Serdengeçti");
        soyad.add("Boğuldu");        soyad.add("Dönmez");        soyad.add("Bakmaz");        soyad.add("Söylemez");
        soyad.add("Gözlükçü");        soyad.add("Turan");        soyad.add("Akşener");        soyad.add("Balaca");
        soyad.add("Genersiz");        soyad.add("Ciğersiz");        soyad.add("Halat");        soyad.add("Salat");
        
        
        
        
        
    }

    
}