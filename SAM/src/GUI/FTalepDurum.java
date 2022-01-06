
package GUI;

import business.OgrenciYonetim;
import entities.Ders;
import entities.Ogrenci;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FTalepDurum extends javax.swing.JFrame {

    DefaultTableModel model;
    OgrenciYonetim ogrenci = new OgrenciYonetim();
    
    public FTalepDurum(int idNo) {
        initComponents();
        model = (DefaultTableModel) talepTable.getModel();
        talepGoruntule(idNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        talepTable = new javax.swing.JTable();
        ExitButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 250));

        talepTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Belge Adi", "Verilecek Kurum", "Açıklama", "Onay", "Link", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(talepTable);

        ExitButton.setBackground(java.awt.SystemColor.controlHighlight);
        ExitButton.setText("Geri Çık");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    public void talepGoruntule(int idNo) {
        model.setRowCount(0);
        ArrayList<Ogrenci> talepList = new ArrayList<Ogrenci>();
        talepList = ogrenci.belgeTalepleriGoruntule(idNo);
        if (talepList != null ) {
            for (Ogrenci ogrenci : talepList) {
                int durum = ogrenci.getApprove();
                if(durum == 1){
                    Object[] eklenecek = {ogrenci.getDocumentType(),ogrenci.getInstutation(),ogrenci.getContent(),"Onaylandı",ogrenci.getLink(),ogrenci.getDate()};
                    model.addRow(eklenecek);
                }
                else if(durum == 0){
                    Object[] eklenecek = {ogrenci.getDocumentType(),ogrenci.getInstutation(),ogrenci.getContent(),"Reddedildi",ogrenci.getLink(),ogrenci.getDate()};
                    model.addRow(eklenecek);
                }
                else{
                    Object[] eklenecek = {ogrenci.getDocumentType(),ogrenci.getInstutation(),ogrenci.getContent()," ",ogrenci.getLink(),ogrenci.getDate()};
                    model.addRow(eklenecek);
                }
            }
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idNo = 0;
                new FTalepDurum(idNo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable talepTable;
    // End of variables declaration//GEN-END:variables
}
