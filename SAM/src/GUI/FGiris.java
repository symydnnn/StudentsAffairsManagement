
package GUI;

import business.MemurYonetim;
import business.OgrenciYonetim;
import business.OgretmenYonetim;
import java.awt.Color;

public class FGiris extends javax.swing.JFrame {
    OgrenciYonetim ogrenci = new OgrenciYonetim();
    OgretmenYonetim ogretmen = new OgretmenYonetim();
    MemurYonetim memur = new MemurYonetim();
    
    public FGiris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirisPanel = new javax.swing.JTabbedPane();
        OgrenciPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TCKimlikOgrenciField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        KaydolOgrenciButton = new javax.swing.JButton();
        GirisYapOgrenciButton = new javax.swing.JButton();
        OgrenciPasswordField = new javax.swing.JPasswordField();
        mesajOgrenci = new javax.swing.JLabel();
        OgretmenPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TCKimlikOgretmenField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        KaydolOgretmenButton = new javax.swing.JButton();
        GirisYapOgretmenButton = new javax.swing.JButton();
        OgretmenPasswordField = new javax.swing.JPasswordField();
        mesajOgretmen = new javax.swing.JLabel();
        MemurPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TCKimlikMemurField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        KaydolMemurButton = new javax.swing.JButton();
        GirisYapMemurButton = new javax.swing.JButton();
        MemurPasswordField = new javax.swing.JPasswordField();
        mesajMemur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GirisPanel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        OgrenciPanel.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Ogrenci Giris Ekrani");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel10.setText("TC Kimlik/ ID");

        TCKimlikOgrenciField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        TCKimlikOgrenciField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCKimlikOgrenciFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel11.setText("Parola");

        KaydolOgrenciButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        KaydolOgrenciButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        KaydolOgrenciButton.setText("Kaydol");
        KaydolOgrenciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydolOgrenciButtonActionPerformed(evt);
            }
        });

        GirisYapOgrenciButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        GirisYapOgrenciButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        GirisYapOgrenciButton.setText("Giris Yap");
        GirisYapOgrenciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisYapOgrenciButtonActionPerformed(evt);
            }
        });

        OgrenciPasswordField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OgrenciPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OgrenciPasswordFieldActionPerformed(evt);
            }
        });

        mesajOgrenci.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout OgrenciPanelLayout = new javax.swing.GroupLayout(OgrenciPanel);
        OgrenciPanel.setLayout(OgrenciPanelLayout);
        OgrenciPanelLayout.setHorizontalGroup(
            OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciPanelLayout.createSequentialGroup()
                .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OgrenciPanelLayout.createSequentialGroup()
                        .addComponent(KaydolOgrenciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GirisYapOgrenciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OgrenciPanelLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(mesajOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrenciPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(OgrenciPanelLayout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(jLabel1))
                                .addGroup(OgrenciPanelLayout.createSequentialGroup()
                                    .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addGap(20, 20, 20)
                                    .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgrenciPanelLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(OgrenciPasswordField))
                                        .addComponent(TCKimlikOgrenciField, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addGap(29, 29, 29))
        );
        OgrenciPanelLayout.setVerticalGroup(
            OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrenciPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(OgrenciPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TCKimlikOgrenciField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(mesajOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(OgrenciPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GirisYapOgrenciButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(KaydolOgrenciButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        GirisPanel.addTab("Ogrenci", OgrenciPanel);

        OgretmenPanel.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setText("Ogretmen Giris Ekrani");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel12.setText("TC Kimlik/ ID");

        TCKimlikOgretmenField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        TCKimlikOgretmenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCKimlikOgretmenFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel13.setText("Parola");

        KaydolOgretmenButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        KaydolOgretmenButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        KaydolOgretmenButton.setText("Kaydol");
        KaydolOgretmenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydolOgretmenButtonActionPerformed(evt);
            }
        });

        GirisYapOgretmenButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        GirisYapOgretmenButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        GirisYapOgretmenButton.setText("Giris Yap");
        GirisYapOgretmenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisYapOgretmenButtonActionPerformed(evt);
            }
        });

        OgretmenPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OgretmenPasswordFieldActionPerformed(evt);
            }
        });

        mesajOgretmen.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout OgretmenPanelLayout = new javax.swing.GroupLayout(OgretmenPanel);
        OgretmenPanel.setLayout(OgretmenPanelLayout);
        OgretmenPanelLayout.setHorizontalGroup(
            OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgretmenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(OgretmenPanelLayout.createSequentialGroup()
                        .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OgretmenPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(OgretmenPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)))
                        .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TCKimlikOgretmenField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgretmenPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(OgretmenPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(OgretmenPanelLayout.createSequentialGroup()
                        .addComponent(KaydolOgretmenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GirisYapOgretmenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        OgretmenPanelLayout.setVerticalGroup(
            OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OgretmenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCKimlikOgretmenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OgretmenPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(mesajOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(OgretmenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GirisYapOgretmenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KaydolOgretmenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        GirisPanel.addTab("Ogretmen", OgretmenPanel);

        MemurPanel.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Memur Giris Ekrani");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setText("TC Kimlik/ ID");

        TCKimlikMemurField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        TCKimlikMemurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCKimlikMemurFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel9.setText("Parola");

        KaydolMemurButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        KaydolMemurButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        KaydolMemurButton.setText("Kaydol");
        KaydolMemurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydolMemurButtonActionPerformed(evt);
            }
        });

        GirisYapMemurButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        GirisYapMemurButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        GirisYapMemurButton.setText("Giris Yap");
        GirisYapMemurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisYapMemurButtonActionPerformed(evt);
            }
        });

        MemurPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemurPasswordFieldActionPerformed(evt);
            }
        });

        mesajMemur.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout MemurPanelLayout = new javax.swing.GroupLayout(MemurPanel);
        MemurPanel.setLayout(MemurPanelLayout);
        MemurPanelLayout.setHorizontalGroup(
            MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemurPanelLayout.createSequentialGroup()
                .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(MemurPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(KaydolMemurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GirisYapMemurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MemurPanelLayout.createSequentialGroup()
                        .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MemurPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addGroup(MemurPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TCKimlikMemurField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesajMemur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MemurPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        MemurPanelLayout.setVerticalGroup(
            MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemurPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCKimlikMemurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(MemurPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesajMemur, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MemurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GirisYapMemurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KaydolMemurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        GirisPanel.addTab("Memur", MemurPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCKimlikOgrenciFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCKimlikOgrenciFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCKimlikOgrenciFieldActionPerformed

    private void TCKimlikOgretmenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCKimlikOgretmenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCKimlikOgretmenFieldActionPerformed

    private void GirisYapOgretmenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisYapOgretmenButtonActionPerformed
        mesajOgretmen.setText("");
        int idNo = 0;
        String tcKimlik = TCKimlikOgretmenField.getText();
        String parola = new String(OgretmenPasswordField.getPassword());
        int u = tcKimlik.length();
        
        if(u<=10){
            idNo = Integer.parseInt(tcKimlik);
            boolean idgirisbasarili = ogretmen.girisYap(idNo, parola);
            if(idgirisbasarili){
            FOgretmen fOgretmen = new FOgretmen(idNo);
            setVisible(false);
            fOgretmen.setVisible(true);
            }
            else {
            mesajOgretmen.setForeground(Color.RED);
            mesajOgretmen.setText("Giriş Başarısız.");
            }
        }
        boolean tcgirisbasarili = ogretmen.girisYap(tcKimlik,parola);
        
        if (tcgirisbasarili ){
            idNo = ogretmen.ogretmenNo(tcKimlik);
            FOgretmen fOgretmen = new FOgretmen(idNo);
            setVisible(false);
            fOgretmen.setVisible(true);
        }
        else {
            mesajOgretmen.setForeground(Color.RED);
            mesajOgretmen.setText("Giriş Başarısız.");
        }
    }//GEN-LAST:event_GirisYapOgretmenButtonActionPerformed

    private void OgrenciPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OgrenciPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OgrenciPasswordFieldActionPerformed

    private void GirisYapOgrenciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisYapOgrenciButtonActionPerformed
        mesajOgrenci.setText("");
        int idNo = 0;
        String tcKimlik = TCKimlikOgrenciField.getText();
        String parola = new String(OgrenciPasswordField.getPassword());
        int u = tcKimlik.length();
        
        if(u<=10){
            idNo = Integer.parseInt(tcKimlik);
            boolean idgirisbasarili = ogrenci.girisYap(idNo, parola);
            if(idgirisbasarili){
            FOgrenci fOgrenci = new FOgrenci(idNo);
            setVisible(false);
            fOgrenci.setVisible(true);
            }
            else {
            mesajOgrenci.setForeground(Color.RED);
            mesajOgrenci.setText("Giriş Başarısız.");
            }
        }
        boolean tcgirisbasarili = ogrenci.girisYap(tcKimlik,parola);
        
        if (tcgirisbasarili ){
            idNo = ogrenci.ogrenciNo(tcKimlik);
            FOgrenci fOgrenci = new FOgrenci(idNo);
            setVisible(false);
            fOgrenci.setVisible(true);
        }
        else {
            mesajOgrenci.setForeground(Color.RED);
            mesajOgrenci.setText("Giriş Başarısız.");
        }
    }//GEN-LAST:event_GirisYapOgrenciButtonActionPerformed

    private void OgretmenPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OgretmenPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OgretmenPasswordFieldActionPerformed

    private void KaydolOgretmenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydolOgretmenButtonActionPerformed
         FOgretmenKaydol ogretmenKaydol = new FOgretmenKaydol();
            setVisible(false);
            ogretmenKaydol.setVisible(true);
    }//GEN-LAST:event_KaydolOgretmenButtonActionPerformed

    private void KaydolOgrenciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydolOgrenciButtonActionPerformed
        FOgrenciKaydol ogrenciKaydol = new FOgrenciKaydol();
            setVisible(false);
            
            ogrenciKaydol.setVisible(true);
    }//GEN-LAST:event_KaydolOgrenciButtonActionPerformed

    private void MemurPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemurPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemurPasswordFieldActionPerformed

    private void GirisYapMemurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisYapMemurButtonActionPerformed
        mesajMemur.setText("");
        int idNo = 0;
        String tcKimlik = TCKimlikMemurField.getText();
        String parola = new String(MemurPasswordField.getPassword());
        int u = tcKimlik.length();
        
        if(u<=10){
            idNo = Integer.parseInt(tcKimlik);
            boolean idgirisbasarili = memur.girisYap(idNo, parola);
            if(idgirisbasarili){
            FMemur fMemur = new FMemur(idNo);
            setVisible(false);
            fMemur.setVisible(true);
            }
            else {
            mesajMemur.setForeground(Color.RED);
            mesajMemur.setText("Giriş Başarısız.");
            }
        }
        boolean tcgirisbasarili = memur.girisYap(tcKimlik,parola);
        
        if (tcgirisbasarili ){
            idNo = memur.memurNo(tcKimlik);
            FMemur fMemur = new FMemur(idNo);
            setVisible(false);
            fMemur.setVisible(true);
        }
        else {
            mesajMemur.setForeground(Color.RED);
            mesajMemur.setText("Giriş Başarısız.");
        }
    }//GEN-LAST:event_GirisYapMemurButtonActionPerformed

    private void KaydolMemurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydolMemurButtonActionPerformed
        FMemurKaydol memurKaydol = new FMemurKaydol();
        setVisible(false);

        memurKaydol.setVisible(true);
    }//GEN-LAST:event_KaydolMemurButtonActionPerformed

    private void TCKimlikMemurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCKimlikMemurFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCKimlikMemurFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane GirisPanel;
    private javax.swing.JButton GirisYapMemurButton;
    private javax.swing.JButton GirisYapOgrenciButton;
    private javax.swing.JButton GirisYapOgretmenButton;
    private javax.swing.JButton KaydolMemurButton;
    private javax.swing.JButton KaydolOgrenciButton;
    private javax.swing.JButton KaydolOgretmenButton;
    private javax.swing.JPanel MemurPanel;
    private javax.swing.JPasswordField MemurPasswordField;
    private javax.swing.JPanel OgrenciPanel;
    private javax.swing.JPasswordField OgrenciPasswordField;
    private javax.swing.JPanel OgretmenPanel;
    private javax.swing.JPasswordField OgretmenPasswordField;
    private javax.swing.JTextField TCKimlikMemurField;
    private javax.swing.JTextField TCKimlikOgrenciField;
    private javax.swing.JTextField TCKimlikOgretmenField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mesajMemur;
    private javax.swing.JLabel mesajOgrenci;
    private javax.swing.JLabel mesajOgretmen;
    // End of variables declaration//GEN-END:variables
}
