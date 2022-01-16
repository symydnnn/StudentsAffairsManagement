
package GUI;

import business.MemurYonetim;
import entities.Memur;
import java.awt.Color;

public class FMemurKaydol extends javax.swing.JFrame {
    MemurYonetim memur = new MemurYonetim();
    
    public FMemurKaydol() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idNoField = new javax.swing.JTextField();
        idNoLabel = new javax.swing.JLabel();
        nameSurnameLabel = new javax.swing.JLabel();
        nameSurnameField = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        employmentLabel = new javax.swing.JLabel();
        kayitButton = new javax.swing.JButton();
        mesaj = new javax.swing.JLabel();
        employmentField = new javax.swing.JTextField();
        GeriButton = new javax.swing.JButton();

        jLabel5.setText("TC Kimlik");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("MEMUR KAYIT EKRANI");

        idNoField.setEditable(false);

        idNoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        idNoLabel.setText("ID");

        nameSurnameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        nameSurnameLabel.setText("Isim Soyisim");

        tcNoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        tcNoLabel.setText("TC Kimlik");

        passwordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        passwordLabel.setText("Sifre");

        employmentLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        employmentLabel.setText("İş Gorev");

        kayitButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        kayitButton.setText("Kayıt Olustur");
        kayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitButtonActionPerformed(evt);
            }
        });

        mesaj.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        mesaj.setForeground(new java.awt.Color(0, 204, 153));

        GeriButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        GeriButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        GeriButton.setForeground(new java.awt.Color(51, 51, 51));
        GeriButton.setText("Geri");
        GeriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GeriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameSurnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tcNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(employmentLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(kayitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordField)
                                        .addComponent(nameSurnameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idNoField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tcNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(employmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                            .addComponent(jLabel1))))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSurnameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel)
                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employmentLabel)
                    .addComponent(employmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayitButton)
                .addGap(18, 18, 18)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GeriButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitButtonActionPerformed
        mesaj.setText("");
        try{
            int idNo = memur.idAtama();
            String i=String.valueOf(idNo);
            idNoField.setText(i);
            if(idNo != 0){
                String nameSurname = nameSurnameField.getText();
                String tcNo = tcNoField.getText();
                String password = new String(passwordField.getPassword());
                String employment = employmentField.getText();
            
                Memur m = new Memur(idNo,nameSurname,tcNo,password,employment);
                memur.ekle(m);
                mesaj.setText("Kayıt gerçekleşti.");
            }
            else{
                mesaj.setForeground(Color.ORANGE);
                mesaj.setText("ID Atama sorunu.");
            }
        }catch(Exception ex){
            mesaj.setForeground(Color.RED);
            mesaj.setText("Beklenmeyen bir hata oluştu. Tekrar deneyiniz.");
        }
    }//GEN-LAST:event_kayitButtonActionPerformed

    private void GeriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriButtonActionPerformed
        FGiris fGiris = new FGiris();
        this.setVisible(false);
        fGiris.setVisible(true);
    }//GEN-LAST:event_GeriButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMemurKaydol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeriButton;
    private javax.swing.JTextField employmentField;
    private javax.swing.JLabel employmentLabel;
    private javax.swing.JTextField idNoField;
    private javax.swing.JLabel idNoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kayitButton;
    private javax.swing.JLabel mesaj;
    private javax.swing.JTextField nameSurnameField;
    private javax.swing.JLabel nameSurnameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField tcNoField;
    private javax.swing.JLabel tcNoLabel;
    // End of variables declaration//GEN-END:variables
}
