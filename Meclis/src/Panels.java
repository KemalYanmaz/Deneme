import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Panels {
    Random random=new Random();
    JPanel panel=new JPanel();
    JPanel baslikpnl=new JPanel();
    JPanel icerikpnl1=new JPanel();
    JPanel icerikpnl2=new JPanel();
    
    JLabel label1=new JLabel();
    JLabel label2=new JLabel();
    JLabel label3=new JLabel();
    public JPanel getPanel(){
        String baslik="Kanun Teklifi";
        String kanun_icerigi=kanun();
        String yazi="";

        try{
            for(int i=0;i<60;i++){
                yazi+=kanun_icerigi.charAt(i);
            }
        }catch(IndexOutOfBoundsException e){
        }
        label2.setText(yazi);
        yazi="";
        try{
            for(int i=60;i<130;i++){
            yazi+=kanun_icerigi.charAt(i);
            }

        }catch(IndexOutOfBoundsException e){
        }
        label3.setText(yazi);
        baslikpnl.setBackground(Color.red);
        icerikpnl1.setBackground(Color.red);
        icerikpnl2.setBackground(Color.red);
        
        panel.setSize(610,110);
        panel.setLocation(0,0);
        panel.setBackground(Color.red);
        panel.setLayout(null);
        label1.setText(baslik);
        baslikpnl.add(label1);
        baslikpnl.setSize(610,30);
               
        icerikpnl1.setSize(610,30);
        icerikpnl1.setLocation(0,30);
        icerikpnl1.add(label2);
        
        icerikpnl2.setSize(610,30);
        icerikpnl2.setLocation(0,60);
        icerikpnl2.add(label3);
        
        
        panel.add(baslikpnl);
        panel.add(icerikpnl1);
        panel.add(icerikpnl2);
 
        
        



        return panel;
    }
    String baslik;
    String icerik;
    public String kanun(){
        
        switch(random.nextInt(4)){
            case 0:
                baslik="Kanun Teklifi";
                icerik="Hayvan Hakları Kanunu";
                break;
            case 1:
                baslik="Kanun Teklifi";
                icerik="Şehir Yapılanması Kanunu";
                break;
            case 2:
                baslik="Kanun Teklifi";
                icerik="Deprem Yönetmeliğine Kanun eklenmesi";
                break;
            case 3:
                baslik="Kanun Teklifi";
                icerik="Devlet hazinesi kanunu";
                break;
        }
        
        
        
        return icerik;
    }
    
    
}