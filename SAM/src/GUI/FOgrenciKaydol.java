
package GUI;

import business.OgrenciYonetim;
import business.OgretmenYonetim;
import entities.Ogrenci;
import java.awt.Color;

public class FOgrenciKaydol extends javax.swing.JFrame {
    OgrenciYonetim ogrenci = new OgrenciYonetim();
    OgretmenYonetim ogretmen = new OgretmenYonetim();
    
    public FOgrenciKaydol() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idNoField = new javax.swing.JTextField();
        nameSurnameField = new javax.swing.JTextField();
        tcNoField = new javax.swing.JTextField();
        classCB = new javax.swing.JComboBox<>();
        idNoLabel = new javax.swing.JLabel();
        nameSurnameLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        facultyLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        semesterCB = new javax.swing.JComboBox<>();
        semesterLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        kayitButton = new javax.swing.JButton();
        mesaj = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        departmentCB = new javax.swing.JComboBox<>();
        facultyCB = new javax.swing.JComboBox<>();
        GeriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("OGRENCİ KAYIT EKRANI");

        idNoField.setEditable(false);

        classCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        idNoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        idNoLabel.setText("ID");

        nameSurnameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        nameSurnameLabel.setText("Isim Soyisim");

        tcNoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        tcNoLabel.setText("TC Kimlik");

        departmentLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        departmentLabel.setText("Bolum");

        facultyLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        facultyLabel.setText("Fakülte");

        classLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        classLabel.setText("Sınıf");

        semesterCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));

        semesterLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        semesterLabel.setText("Dönem");

        passwordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        passwordLabel.setText("Sifre");

        kayitButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        kayitButton.setText("Kayıt Olustur");
        kayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitButtonActionPerformed(evt);
            }
        });

        departmentCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilgisayar Muhendisligi", "Elektrik Muhendisligi", "Cevre Muhendisligi", "Cografya Ogretmenligi", "Ebelik", "Hemsirelik", "Fizyoloji", "Tıp" }));

        facultyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknoloji Fakultesi", "Muhendislik Fakultesi", "Ataturk Egitim Fakultesi", "Saglik Bilimleri Fakultesi", "Tıp Fakultesi" }));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameSurnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(departmentLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(facultyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(semesterLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tcNoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameSurnameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idNoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(semesterCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(departmentCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultyCB, 0, 189, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSurnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyLabel)
                    .addComponent(facultyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GeriButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitButtonActionPerformed
        mesaj.setText("");
        try{
            String faculty = facultyCB.getSelectedItem().toString();
            String department = departmentCB.getSelectedItem().toString();
            int idFaculty = Integer.parseInt(ogretmen.bolumID(faculty,department).get(0).toString());
            int idNo = ogrenci.idAtama();
            String i=String.valueOf(idNo);
            idNoField.setText(i);
            if(idNo != 0){
                String nameSurname = nameSurnameField.getText();
                String tcNo = tcNoField.getText();
                int sinifi = Integer.parseInt(classCB.getSelectedItem().toString());
                int semester = Integer.parseInt(semesterCB.getSelectedItem().toString());
                float GANO = 0;
                String password = new String(passwordField.getPassword());
                Ogrenci ogr = new Ogrenci(idNo,nameSurname,tcNo,idFaculty,sinifi,semester,(float)GANO,password);
                ogrenci.ekle(ogr);
                mesaj.setText("Kayıt gerçekleşti.");
            }else{
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
            java.util.logging.Logger.getLogger(FOgrenciKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOgrenciKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOgrenciKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOgrenciKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOgrenciKaydol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeriButton;
    private javax.swing.JComboBox<String> classCB;
    private javax.swing.JLabel classLabel;
    private javax.swing.JComboBox<String> departmentCB;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JComboBox<String> facultyCB;
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JTextField idNoField;
    private javax.swing.JLabel idNoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kayitButton;
    private javax.swing.JLabel mesaj;
    private javax.swing.JTextField nameSurnameField;
    private javax.swing.JLabel nameSurnameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> semesterCB;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JTextField tcNoField;
    private javax.swing.JLabel tcNoLabel;
    // End of variables declaration//GEN-END:variables
}
