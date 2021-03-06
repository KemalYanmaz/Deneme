
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ProgressBar;
import javax.swing.Timer;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kemal
 */
public class Parliament extends javax.swing.JFrame {
    ArrayList<Vatandaslar> vatandaslar=new ArrayList<>();
    ArrayList<Milletvekilleri> milletvekilleri=new ArrayList<>();
    Random random=new Random();
    Panels pnl=new Panels();
    int yes=0;
    int no=0;
    /**
     * Creates new form Parliament
     */
    String yazi="";
    public Parliament() {
 
        initComponents();
        jProgressBar1.setBackground(Color.white);
        Timer dateGetter=new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDate.setText(Date.getCurrentDate().toString());
                jTime.setText(Date.getTime());

            }
        });
        
        dateGetter.start();
        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int i=1;
    Parties AKP,MHP,CHP;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDate = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMaximumSize(new java.awt.Dimension(400, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(2147483647, 2147483647));

        main_panel.setBackground(new java.awt.Color(255, 204, 51));
        main_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parlemento");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(0, 255, 153));
        jButton1.setText("Oylamayı Başlat");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Meclisi Aç");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Partileri Seç");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hayır");

        jLabel3.setText("Evet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jProgressBar1.setBackground(new java.awt.Color(0, 102, 51));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel4.setText("CHP");

        jLabel5.setText("AKP");

        jLabel6.setText("MHP");

        jPanel2.setLayout(null);

        jDate.setText("jLabel7");

        jTime.setText("jLabel8");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(jDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTime)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        yes1=0;
        no1=0;
        yes=0;
        no=0;
        for(Vatandaslar vatandas:vatandaslar){
            if(vatandas.vote()){
                yes1++;
            }else{
                no1++;
            }
        }
        jProgressBar3.setMaximum(600);
        jButton3.setVisible(false);
        yazi="";
        sicilNo=0;
        Timer timer=new Timer(100,null);
        timer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jProgressBar3.setValue(yes1);
                jProgressBar3.setString(yes1+"  "+no1);
                jProgressBar3.setStringPainted(true);
                if(sicilNo<600){
                    oy=random.nextBoolean();
                    yazi+=milletvekilleri.get(sicilNo).voting(oy)+"\n";
                    sicilNo++;
                    jTextPane1.setText(yazi);

                    if(oy){
                        yes++;
                                               

                    }else{
                        no++;                

                    }
                    if(yes>no){
                        jPanel1.setBackground(Color.green);
                    }else{
                        jPanel1.setBackground(Color.red);
                        
                    }
                    jProgressBar2.setBackground(Color.green);
                    jProgressBar2.setMaximum(yes+no);
                    jProgressBar2.setValue(yes);
                    String string="Evet%"+jProgressBar2.getPercentComplete()*100+"\\%"+(100-(jProgressBar2.getPercentComplete()*100)+"Hayır");
                    jProgressBar2.setString(string);
                    jProgressBar2.setStringPainted(true);
                
                }else{
                    jPanel2.add(pnl.getPanel());
                    jButton1.setEnabled(true);
                    if(yes>no){
                        jProgressBar2.setBackground(Color.green);
                        
                        
                    }else{
                         jProgressBar2.setBackground(Color.red);
                    }
                    timer.stop();
                }
            }
            });
        timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed
    int oran1=0,oran2=0,oran3=0;
    int sicilNo=1;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);
        Timer timer1=new Timer(10,null);
        Timer timer2=new Timer(10,null);
        jProgressBar1.setMaximum(600);
       
                    jProgressBar1.setString("Milletvekilleri Seçiliyor.");
        timer1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(sicilNo<601){
                Names name=new Names();
                milletvekilleri.add(new Milletvekilleri(new Date(1+random.nextInt(30),1+random.nextInt(12),1940+random.nextInt(40)), name.isim, name.soyisim, 1));
                yazi+=sicilNo+"-)"+name.isim+" "+name.soyisim+"------"+milletvekilleri.get(milletvekilleri.size()-1).getIdentityNo()+"\n";
                
                }else{
                    sicilNo=0;
                    jProgressBar1.setString("Milletvekilleri Seçildi.");
                    jProgressBar1.setBackground(Color.green);
                    timer1.stop();
                    try {
                        //yazi="";
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Parliament.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    timer2.start();
                }
                jTextPane1.setText(yazi);
                sicilNo++;
                jProgressBar1.setValue(sicilNo);

            }
        });
        timer1.start();
         timer2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jProgressBar1.setBackground(Color.white);
                
                if(!timer1.isRunning()){
                    jProgressBar1.setString("Vatandaşlar Seçiliyor.");
                    if(sicilNo<601){
                        Names name=new Names();
                        vatandaslar.add(new Vatandaslar(new Date(1+random.nextInt(30),1+random.nextInt(12),1940+random.nextInt(40)),name.isim,name.soyisim));
                        yazi+=sicilNo+"-)"+name.isim+" "+name.soyisim+"\n";
                        
                    }else{
                        jProgressBar1.setBackground(Color.green);
                        jProgressBar1.setString("Vatandaşlar Seçildi.");
                        
                        jButton3.setEnabled(true); 
                        

                        timer2.stop();
                    }
                    sicilNo++;
                    jTextPane1.setText(yazi);
                    jProgressBar1.setValue(sicilNo);
                    
                    
                }
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed
        Boolean oy;
        int yes1=0;
        int no1=0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AKP=new Parties("AKP");
        CHP=new Parties("CHP");
        MHP=new Parties("MHP");
        ArrayList<Parties> partiler=new ArrayList<>();
        partiler.add(AKP); partiler.add(CHP); partiler.add(MHP);
        Timer timer=new Timer(100,null);
        sicilNo=0;
        jButton3.setEnabled(false);
        yazi="";
        oran1=(int)(random.nextDouble()*600);
        oran2=(int)(random.nextDouble()*(600-oran1));
        oran3=600-oran1-oran2;
        
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Parties parti=new Parties("a");
                
                
                if(i<=oran1){
                    Milletvekilleri mv=milletvekilleri.get(sicilNo);
                    yazi+=AKP.uyeEkle(mv)+"\n";
                    jTextPane1.setText(yazi);
                }
                if(i>oran1 && i<=(oran1+oran2)){
                    Milletvekilleri mv=milletvekilleri.get(sicilNo);
                    yazi+=CHP.uyeEkle(mv)+"\n";
                    jTextPane1.setText(yazi);
                }
                if(i>(oran1+oran2) && i<=(oran1+oran2+oran3)){
                    Milletvekilleri mv=milletvekilleri.get(sicilNo);
                    yazi+=MHP.uyeEkle(mv)+"\n";
                    jTextPane1.setText(yazi);
                }
                if(i==600){
                    jButton1.setEnabled(true);
                    jPanel2.add(pnl.getPanel());
                    timer.stop();
                }
                    
                i++;
                sicilNo++;
                jLabel4.setText("CHP: "+CHP.countMember());
                jLabel5.setText("AKP: "+AKP.countMember());
                jLabel6.setText("MHP: "+MHP.countMember());

            }
        });
        timer.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parliament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parliament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parliament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parliament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parliament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jTime;
    private javax.swing.JPanel main_panel;
    // End of variables declaration//GEN-END:variables
}
