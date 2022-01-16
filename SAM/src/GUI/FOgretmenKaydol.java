
package GUI;

import business.OgretmenYonetim;
import entities.Ogretmen;
import java.awt.Color;

public class FOgretmenKaydol extends javax.swing.JFrame {
    OgretmenYonetim ogretmen = new OgretmenYonetim();

    public FOgretmenKaydol() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idNoField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        FacultyLabel = new javax.swing.JLabel();
        nameSurnameLabel = new javax.swing.JLabel();
        nameSurnameField = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        facultyCB = new javax.swing.JComboBox<>();
        departmentCB = new javax.swing.JComboBox<>();
        DepartmentLabel = new javax.swing.JLabel();
        kayitButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        mesaj = new javax.swing.JLabel();
        GeriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("OGRETMEN KAYIT EKRANI");

        idNoField.setEditable(false);

        idLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        idLabel.setText("ID");

        FacultyLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        FacultyLabel.setText("Fakulte");

        nameSurnameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        nameSurnameLabel.setText("Isim Soyisim");

        tcNoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        tcNoLabel.setText("TC Kimlik");

        passwordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        passwordLabel.setText("Sifre");

        facultyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknoloji Fakultesi", "Muhendislik Fakultesi", "Ataturk Egitim Fakultesi", "Saglik Bilimleri Fakultesi", "Tıp Fakultesi", " " }));
        facultyCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyCBActionPerformed(evt);
            }
        });

        departmentCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilgisayar Muhendisligi", "Elektrik Muhendisligi", "Cevre Muhendisligi", "Cografya Ogretmenligi", "Ebelik", "Hemsirelik", "Fizyoloji", "Tıp" }));

        DepartmentLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        DepartmentLabel.setText("Bolum");

        kayitButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameSurnameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DepartmentLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FacultyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(idNoField)
                            .addComponent(nameSurnameField)
                            .addComponent(tcNoField)
                            .addComponent(facultyCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(departmentCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 144, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GeriButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FacultyLabel)
                    .addComponent(facultyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurnameLabel)
                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel)
                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayitButton)
                .addGap(18, 18, 18)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GeriButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitButtonActionPerformed
        mesaj.setText("");
        try{
        String faculty = facultyCB.getSelectedItem().toString();
        String department = departmentCB.getSelectedItem().toString();
        int idFaculty = Integer.parseInt(ogretmen.bolumID(faculty,department).get(0).toString());
        int idNo = ogretmen.idAtama();
        String i=String.valueOf(idNo);
        idNoField.setText(i);
        if(idNo != 0){
        String nameSurname = nameSurnameField.getText();
        String tcNo = tcNoField.getText();
        String password = new String(passwordField.getPassword());
        Ogretmen o = new Ogretmen(idNo,idFaculty,nameSurname,tcNo,password,department);
        ogretmen.ekle(o);
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

    private void facultyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyCBActionPerformed
        
    }//GEN-LAST:event_facultyCBActionPerformed

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
            java.util.logging.Logger.getLogger(FOgretmenKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOgretmenKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOgretmenKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOgretmenKaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new FOgretmenKaydol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JLabel FacultyLabel;
    private javax.swing.JButton GeriButton;
    private javax.swing.JComboBox<String> departmentCB;
    private javax.swing.JComboBox<String> facultyCB;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idNoField;
    private javax.swing.JLabel jLabel1;
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
