
package GUI;

import business.OgrenciYonetim;
import business.Yonetim;
import entities.Ders;
import entities.Ogrenci;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FOgrenci extends javax.swing.JFrame {
    Yonetim yonetim = new Yonetim();
    DefaultTableModel model, model2;
    OgrenciYonetim ogrenci = new OgrenciYonetim();
    
    public FOgrenci(int idNo) {
        initComponents();
        profil(idNo);
        
        idStudentField.setText(String.valueOf(idNo));
        idStudentField.setVisible(false);
        
        model2 = (DefaultTableModel) notlarTable.getModel();
        ogrencidersleriGoruntule(idNo);
        
        model = (DefaultTableModel) dersSecimTable.getModel();
        secilebilecekDersler(idNo);
        
    }
    
    public void ogrencidersleriGoruntule(int idNo) {
        model2.setRowCount(0);
        ArrayList<Ders> dersList = new ArrayList<Ders>();
        dersList = yonetim.ogrencininDersleriGoruntule(idNo);
        if (dersList != null ) {
            
            for (Ders ders : dersList) {
                Object[] eklenecek = {ders.getIdSection(),idNo,ders.getLectureName(),ders.getMidterm(),ders.getFinali(),ders.getMean(),ders.getGrade()};
                model2.addRow(eklenecek);
            }
        }
    }
    
    public void secilebilecekDersler(int idNo){
        int idFaculty = ogrenci.fakultesi(idNo);
        model.setRowCount(0);
        ArrayList<Ders> dersList = new ArrayList<Ders>();
        dersList = ogrenci.dersleriGoruntule(idFaculty);
        if (dersList != null ) {
            for (Ders ders : dersList) {
                Object[] eklenecek = {ders.getIdNo(),ders.getLectureName(),ders.getDate(),ders.getACTS(),ders.getCredit(),ders.getOgretmen()};
                model.addRow(eklenecek);
            }
        }
    }
    
    public void profil(int idNo){
        ArrayList<Ders> fakulte = ogrenci.fakulte(idNo);  ///yonetim vardı.
        int idFaculty = ogrenci.fakultesi(idNo); //ogrenci fakultesi 
        ArrayList<Ogrenci> o = ogrenci.listele(idNo);
        idField.setText(String.valueOf(o.get(0).getIdNo()));
        nameSurnameField.setText(o.get(0).getNameSurname());
        tcNoField.setText(o.get(0).getTcNo());
        facultyNameField.setText(fakulte.get(0).getFacultyName());
        departmentField.setText(fakulte.get(0).getDepartment());
        sinifiField.setText(String.valueOf(o.get(0).getSınıf()));
        semesterField.setText(String.valueOf(o.get(0).getSemester()));
        GANOField.setText(String.valueOf(o.get(0).getGANO()));
        passwordField.setText(String.valueOf(o.get(0).getPassword()));
        int isActive = ogrenci.kayitDurumuSogrula(idNo);
        hesapDurumuField.setText(String.valueOf(isActive));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DuyurularButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CikisYapButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dersSecimTable = new javax.swing.JTable();
        dersKoduField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dersAdiField = new javax.swing.JTextField();
        dersKayitButton = new javax.swing.JButton();
        idStudentField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notlarTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        kayitSilButton = new javax.swing.JButton();
        kayitDondurButton = new javax.swing.JButton();
        kayitAktiflestirButoon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        tcNoField = new javax.swing.JTextField();
        facultyNameField = new javax.swing.JTextField();
        nameSurnameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GANOField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        semesterField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sinifiField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        departmentField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        hesapDurumuField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        güncelleButton = new javax.swing.JButton();
        mesaj = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        documentTypeCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        instutationField = new javax.swing.JTextField();
        contentField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        talepBasvuruButton = new javax.swing.JButton();
        talepDurumunuGoruntule = new javax.swing.JButton();
        talepMesaj = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ÖGRENCİ İSLEMLERİ");

        DuyurularButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DuyurularButton.setForeground(new java.awt.Color(0, 102, 153));
        DuyurularButton.setText("DUYURULAR");
        DuyurularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuyurularButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setText("TEKNIK DESTEK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CikisYapButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        CikisYapButton.setForeground(new java.awt.Color(0, 102, 153));
        CikisYapButton.setText("ÇIKIŞ YAP");
        CikisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CikisYapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CikisYapButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DuyurularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DuyurularButton, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(CikisYapButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ana Sayfa", jPanel1);

        jPanel2.setBackground(java.awt.SystemColor.controlHighlight);

        dersSecimTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ders Kodu", "Ders Adi", "Gün", "ACTS", "Kredi", "Ogretmen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dersSecimTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dersSecimTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dersSecimTable);

        dersKoduField.setEditable(false);
        dersKoduField.setBackground(java.awt.SystemColor.controlHighlight);
        dersKoduField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        dersKoduField.setForeground(new java.awt.Color(102, 102, 102));
        dersKoduField.setText("Ders Kodu");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel2.setText("SECILEN DERS");

        dersAdiField.setEditable(false);
        dersAdiField.setBackground(java.awt.SystemColor.controlHighlight);
        dersAdiField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        dersAdiField.setForeground(new java.awt.Color(102, 102, 102));
        dersAdiField.setText("Ders Adi");

        dersKayitButton.setBackground(java.awt.SystemColor.controlHighlight);
        dersKayitButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        dersKayitButton.setForeground(new java.awt.Color(0, 51, 153));
        dersKayitButton.setText("DERSLERE EKLE");
        dersKayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersKayitButtonActionPerformed(evt);
            }
        });

        idStudentField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dersKoduField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dersAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dersKayitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                    .addComponent(idStudentField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dersKoduField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dersAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dersKayitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idStudentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ders Secimleri", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.controlHighlight);

        notlarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Secim ID", "Ders ID", "Ders Adi", "Vize", "Final", "Ortalama", "Başarı Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        notlarTable.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(notlarTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Not Goruntuleme", jPanel3);

        jPanel5.setBackground(java.awt.SystemColor.controlHighlight);

        kayitSilButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        kayitSilButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        kayitSilButton.setForeground(new java.awt.Color(102, 0, 51));
        kayitSilButton.setText("Kayıt Sil");
        kayitSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitSilButtonActionPerformed(evt);
            }
        });

        kayitDondurButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        kayitDondurButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        kayitDondurButton.setForeground(new java.awt.Color(0, 51, 102));
        kayitDondurButton.setText("Kayıt Dondur");
        kayitDondurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitDondurButtonActionPerformed(evt);
            }
        });

        kayitAktiflestirButoon.setBackground(java.awt.SystemColor.activeCaptionBorder);
        kayitAktiflestirButoon.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        kayitAktiflestirButoon.setForeground(new java.awt.Color(51, 204, 0));
        kayitAktiflestirButoon.setText("Kayıt Aktifleştir");
        kayitAktiflestirButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitAktiflestirButoonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setText("Ogrenci Numarası");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setText("Dönem");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("TC Kimlik");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setText("Şifre");

        idField.setEditable(false);
        idField.setBackground(java.awt.SystemColor.scrollbar);

        facultyNameField.setEditable(false);
        facultyNameField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel7.setText("GANO");

        GANOField.setEditable(false);
        GANOField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel8.setText("İsim Soyisim");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel9.setText("Fakülte Adı");

        semesterField.setEditable(false);
        semesterField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel10.setText("Sınıf");

        sinifiField.setEditable(false);
        sinifiField.setBackground(java.awt.SystemColor.scrollbar);

        passwordField.setText("jPasswo");

        departmentField.setEditable(false);
        departmentField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel11.setText("Bolümü");

        hesapDurumuField.setEditable(false);
        hesapDurumuField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel12.setText("Hesap Durumu");

        güncelleButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        güncelleButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        güncelleButton.setForeground(new java.awt.Color(0, 0, 204));
        güncelleButton.setText("Güncelle");
        güncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleButtonActionPerformed(evt);
            }
        });

        mesaj.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        mesaj.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kayitDondurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(semesterField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(GANOField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(sinifiField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(passwordField)
                                    .addComponent(hesapDurumuField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addGap(0, 5, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(kayitAktiflestirButoon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(güncelleButton)
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sinifiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semesterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GANOField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(hesapDurumuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitAktiflestirButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(güncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitDondurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Kayit Islemleri", jPanel5);

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);

        documentTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ogrenci Belgesi", "Transkript", "Disiplin Belgesi", "Staj Zorunluluk Belgesi" }));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel13.setText("Belge Türü");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel15.setText("Verilecek Kurum");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel16.setText("Açıklama");

        talepBasvuruButton.setBackground(java.awt.SystemColor.controlHighlight);
        talepBasvuruButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        talepBasvuruButton.setForeground(new java.awt.Color(0, 102, 153));
        talepBasvuruButton.setText("TALEP BASVUR");
        talepBasvuruButton.setActionCommand("TALEP OLUSTUR");
        talepBasvuruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talepBasvuruButtonActionPerformed(evt);
            }
        });

        talepDurumunuGoruntule.setBackground(java.awt.SystemColor.controlHighlight);
        talepDurumunuGoruntule.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        talepDurumunuGoruntule.setForeground(new java.awt.Color(0, 102, 153));
        talepDurumunuGoruntule.setText("TALEP DURUMUNU GORUNTULE");
        talepDurumunuGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talepDurumunuGoruntuleActionPerformed(evt);
            }
        });

        talepMesaj.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        talepMesaj.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(documentTypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(instutationField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(talepDurumunuGoruntule, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contentField)
                            .addComponent(talepBasvuruButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(talepMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(instutationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talepBasvuruButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(talepDurumunuGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(talepMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Belge Talep", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dersSecimTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dersSecimTableMouseClicked
        int sec = dersSecimTable.getSelectedRow();
        dersKoduField.setText(model.getValueAt(sec,0).toString());
        dersAdiField.setText(model.getValueAt(sec,1).toString());
    }//GEN-LAST:event_dersSecimTableMouseClicked

    private void dersKayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersKayitButtonActionPerformed

        int idLectures = Integer.parseInt((String)dersKoduField.getText());
        int idNo = Integer.parseInt((String)idStudentField.getText());
        int idSection = yonetim.idSectionAta();
        Ders ders = new Ders(idSection,idNo,idLectures);
        ogrenci.dersSec(ders);
        model2 = (DefaultTableModel) notlarTable.getModel();
        secilebilecekDersler(idNo);
        int rows = model2.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model2.removeRow(i); 
            }
        ogrencidersleriGoruntule(idNo);
    }//GEN-LAST:event_dersKayitButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void güncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncelleButtonActionPerformed
        mesaj.setText(" ");
        try{
            int yanit = JOptionPane.showConfirmDialog(this, "Kaydınız güncellenecektir. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
            
            int idStudent = Integer.parseInt((String)idField.getText());
            String nameSurname = nameSurnameField.getText();
            String tcNo = tcNoField.getText();
            int idFaculty = ogrenci.fakultesi(idStudent);
            int sinifi = Integer.parseInt((String)sinifiField.getText());
            int semester = Integer.parseInt((String)semesterField.getText());
            float GANO = Float.parseFloat((String) GANOField.getText());
            String password = new String(passwordField.getPassword());
            int hesap = Integer.parseInt((String)hesapDurumuField.getText());
            if (yanit ==JOptionPane.YES_OPTION){
                Ogrenci o = new Ogrenci(idStudent, nameSurname, tcNo, idFaculty, sinifi, semester, (float)GANO, password);
                ogrenci.guncelle(o);
                mesaj.setForeground(Color.GREEN);
                mesaj.setText("Kayit güncellendi.");
            }
            else{
                mesaj.setText("Kayit güncellenemedi.");
            }
        }catch(Exception ex){
        }      
    }//GEN-LAST:event_güncelleButtonActionPerformed

    private void kayitSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitSilButtonActionPerformed
        mesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Kaydınız silinecektir. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        if (yanit ==JOptionPane.YES_OPTION){
            int idNo = Integer.parseInt((String)idField.getText());
            ogrenci.kaldir(idNo);
            mesaj.setForeground(Color.orange);
            mesaj.setText("OGRENCI KAYDI SİLİNMİSTİR.");
        }
        else{
            mesaj.setForeground(Color.CYAN);
            mesaj.setText("İşlem gerçekleştirilemedi.");
        }
    }//GEN-LAST:event_kayitSilButtonActionPerformed

    private void talepBasvuruButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talepBasvuruButtonActionPerformed
        talepMesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Belge talebiniz olusturulacaktır. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        if (yanit ==JOptionPane.YES_OPTION){
            int idNo = Integer.parseInt((String)idField.getText());
            String documentType = documentTypeCB.getSelectedItem().toString();
            String instutation = instutationField.getText();
            String content = contentField.getText();
            int idRequest = ogrenci.idAtama(idNo);
            int approve = -1;
            String link = null;
            
            Date simdikiZaman = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date = df.format(simdikiZaman).toString();
            ogrenci.belgeTalep(new Ogrenci(idRequest,idNo,documentType,instutation,content,approve,link,date));
            
            talepMesaj.setText("Belge Talebiniz alınmıştır. Talep durumunu goruntuleyerek onay durumunu kontrol edebilirsiniz.");
        }
        else{
            talepMesaj.setForeground(Color.red);
            talepMesaj.setText("İşlem gerçekleştirilemedi.");
        }
        
    }//GEN-LAST:event_talepBasvuruButtonActionPerformed

    private void talepDurumunuGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talepDurumunuGoruntuleActionPerformed
        int idNo = Integer.parseInt((String)idField.getText());
        FTalepDurum fTalepDurum = new FTalepDurum(idNo);
        fTalepDurum.setVisible(true);
    }//GEN-LAST:event_talepDurumunuGoruntuleActionPerformed

    private void kayitDondurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitDondurButtonActionPerformed
        mesaj.setText(" ");
        int idNo = Integer.parseInt((String)idField.getText());
        int kayitDurum = Integer.parseInt(hesapDurumuField.getText());
        if(kayitDurum == 0){
            mesaj.setForeground(Color.ORANGE);
            mesaj.setText("Ögrenci öğrenimne devam etmemektedir.");
        }
        else{
            mesaj.setForeground(Color.RED);
            ogrenci.kayitDondur(idNo);
            mesaj.setText("Ogrenci kaydı dondurulmuştur.");
            idField.setText("0");
        }
    }//GEN-LAST:event_kayitDondurButtonActionPerformed

    private void kayitAktiflestirButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitAktiflestirButoonActionPerformed
        mesaj.setText(" ");
        int idNo = Integer.parseInt((String)idField.getText());
        int kayitDurum = Integer.parseInt(hesapDurumuField.getText());
        if(kayitDurum == 1){
            mesaj.setForeground(Color.GREEN);
            mesaj.setText("Ögrenci öğrenimine devam etmektedir.");
        }
        else{
            ogrenci.kayitAktiflestir(idNo);
            mesaj.setForeground(Color.BLUE);
            mesaj.setText("Ögrenci öğrenime gelecek dönemden itibaren devam edebilecektir.");
            idField.setText("1");
        }
    }//GEN-LAST:event_kayitAktiflestirButoonActionPerformed

    private void DuyurularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuyurularButtonActionPerformed
        FDuyurular fDuyurular = new FDuyurular();
        fDuyurular.setVisible(true);
        
    }//GEN-LAST:event_DuyurularButtonActionPerformed

    private void CikisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisYapButtonActionPerformed
        FGiris fGiris = new FGiris();
        this.setVisible(false);
        fGiris.setVisible(true);
    }//GEN-LAST:event_CikisYapButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idNo=0;
                new FOgrenci(idNo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CikisYapButton;
    private javax.swing.JButton DuyurularButton;
    private javax.swing.JTextField GANOField;
    private javax.swing.JTextField contentField;
    private javax.swing.JTextField departmentField;
    private javax.swing.JTextField dersAdiField;
    private javax.swing.JButton dersKayitButton;
    private javax.swing.JTextField dersKoduField;
    private javax.swing.JTable dersSecimTable;
    private javax.swing.JComboBox<String> documentTypeCB;
    private javax.swing.JTextField facultyNameField;
    private javax.swing.JButton güncelleButton;
    private javax.swing.JTextField hesapDurumuField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idStudentField;
    private javax.swing.JTextField instutationField;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayitAktiflestirButoon;
    private javax.swing.JButton kayitDondurButton;
    private javax.swing.JButton kayitSilButton;
    private javax.swing.JLabel mesaj;
    private javax.swing.JTextField nameSurnameField;
    private javax.swing.JTable notlarTable;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField semesterField;
    private javax.swing.JTextField sinifiField;
    private javax.swing.JButton talepBasvuruButton;
    private javax.swing.JButton talepDurumunuGoruntule;
    private javax.swing.JLabel talepMesaj;
    private javax.swing.JTextField tcNoField;
    // End of variables declaration//GEN-END:variables
}
