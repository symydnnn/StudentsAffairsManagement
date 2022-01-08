
package GUI;

import business.MemurYonetim;
import business.OgrenciYonetim;
import business.OgretmenYonetim;
import business.Yonetim;
import entities.Duyuru;
import entities.Memur;
import entities.Ogrenci;
import entities.Ogretmen;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FMemur extends javax.swing.JFrame {
    Yonetim yonetim = new Yonetim();
    DefaultTableModel model;
    MemurYonetim memur = new MemurYonetim();
    OgrenciYonetim ogrenci = new OgrenciYonetim();
    OgretmenYonetim ogretmen = new OgretmenYonetim();
    
    public FMemur(int idNo) {
        initComponents();
        idOfficerField.setText(String.valueOf(idNo));
        idOfficerField.setVisible(false);
        profil(idNo);
        idActivityField.setText(String.valueOf(yonetim.idAtama()));
        duyurular();
        belgeTalepler();
    }
    
    public void profil(int idNo){
        Memur m = new Memur(idNo);
        ArrayList<Memur> mem = memur.listele(idNo);
        idField.setText(String.valueOf(mem.get(0).getIdNo()));
        nameSurnameField.setText(mem.get(0).getNameSurname());
        tcNoField.setText(mem.get(0).getTcNo());
        passwordField.setText(String.valueOf(mem.get(0).getPassword()));
        employmentField.setText(String.valueOf(mem.get(0).getEmployment()));
    }
    
    public void duyurular(){
        ArrayList<Duyuru> duyuruList = yonetim.duyurulariGoruntule();
        int i=0;
        model = (DefaultTableModel) duyurularTable.getModel();
        
        if(duyuruList != null){
            for (Duyuru d : duyuruList){
                int idNo = duyuruList.get(i).getIdActivity();
                String activityName = duyuruList.get(i).getActivityName();
                String content = duyuruList.get(i).getContent();
                String activityDate = duyuruList.get(i).getActivityDate();
                Object [] data = {idNo, activityName,content,activityDate};
                model.addRow(data);
                i++;
            }
        }
    }
    
    public void belgeTalepler(){
        ArrayList<Ogrenci> belgeList = yonetim.belgeIstekleriGoruntule();
        int i=0;
        model = (DefaultTableModel) belgeTalepTable.getModel();
        
        if(belgeList != null){
            for (Ogrenci o : belgeList){
                int idRequest = belgeList.get(i).getIdRequest();
                int idStudent = belgeList.get(i).getIdNo();
                String documentType = belgeList.get(i).getDocumentType();
                String instutation = belgeList.get(i).getInstutation();
                String content = belgeList.get(i).getContent();
                int approve = belgeList.get(i).getApprove();
                String durum;
                if (approve==-1)
                    durum = " ";
                else if(approve == 0)
                    durum = "Red";
                else
                    durum = "Onaylı";
                String link = belgeList.get(i).getLink();
                String date = belgeList.get(i).getDate();
                Object [] data = {idRequest, idStudent,documentType,instutation,content,durum,link,date};
                model.addRow(data);
                i++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        duyurularButton = new javax.swing.JButton();
        teknikDestekButton = new javax.swing.JButton();
        idOfficerField = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        kayitSilButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        tcNoField = new javax.swing.JTextField();
        nameSurnameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        güncelleButton = new javax.swing.JButton();
        mesaj = new javax.swing.JLabel();
        employmentField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        studentsListButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        teacherListButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        teachersTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        officersTable = new javax.swing.JTable();
        officerListButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        idActivityField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        activityNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        activityDateCalendar = new com.toedter.calendar.JCalendar();
        jLabel10 = new javax.swing.JLabel();
        duyuruYayinlaButton = new javax.swing.JButton();
        mesajDuyuruYayin = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        duyurularTable = new javax.swing.JTable();
        duyuruGuncelleButton = new javax.swing.JButton();
        duyuruSilButton = new javax.swing.JButton();
        mesajDuyuru = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        belgeTalepTable = new javax.swing.JTable();
        approveButton = new javax.swing.JButton();
        retButton = new javax.swing.JButton();
        onayMesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(59, 98, 131));
        jTabbedPane1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MEMUR İSLEMLERİ");

        duyurularButton.setBackground(java.awt.SystemColor.inactiveCaption);
        duyurularButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        duyurularButton.setForeground(new java.awt.Color(153, 0, 51));
        duyurularButton.setText("DUYURULAR");

        teknikDestekButton.setBackground(java.awt.SystemColor.inactiveCaption);
        teknikDestekButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        teknikDestekButton.setForeground(new java.awt.Color(153, 0, 51));
        teknikDestekButton.setText("TEKNIK DESTEK");
        teknikDestekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teknikDestekButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idOfficerField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(duyurularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(teknikDestekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idOfficerField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teknikDestekButton, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(duyurularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ana Sayfa", jPanel1);

        jPanel6.setBackground(java.awt.SystemColor.activeCaption);

        kayitSilButton.setBackground(java.awt.SystemColor.controlHighlight);
        kayitSilButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        kayitSilButton.setForeground(new java.awt.Color(0, 102, 102));
        kayitSilButton.setText("Kayıt Sil");
        kayitSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitSilButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setText("Memur ID");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("TC Kimlik");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setText("Şifre");

        idField.setEditable(false);
        idField.setBackground(java.awt.SystemColor.scrollbar);

        tcNoField.setBackground(java.awt.SystemColor.controlHighlight);

        nameSurnameField.setBackground(java.awt.SystemColor.controlHighlight);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel8.setText("İsim Soyisim");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel9.setText("Görev");

        passwordField.setBackground(java.awt.SystemColor.controlHighlight);
        passwordField.setText("jPasswo");

        güncelleButton.setBackground(java.awt.SystemColor.controlHighlight);
        güncelleButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        güncelleButton.setForeground(new java.awt.Color(203, 110, 31));
        güncelleButton.setText("Güncelle");
        güncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleButtonActionPerformed(evt);
            }
        });

        mesaj.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        mesaj.setForeground(new java.awt.Color(153, 0, 0));

        employmentField.setBackground(java.awt.SystemColor.controlHighlight);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(employmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(güncelleButton))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(güncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mesaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        jTabbedPane1.addTab("Kayıt Islemleri", jPanel6);

        jTabbedPane2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        studentsTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ogrenci ID", "Isim Soyiisim", "TC Kimlik", "Sınıf", "Dönem", "Fakulte ID", "GANO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
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
        jScrollPane3.setViewportView(studentsTable);

        studentsListButton.setBackground(java.awt.SystemColor.controlHighlight);
        studentsListButton.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        studentsListButton.setForeground(new java.awt.Color(51, 51, 51));
        studentsListButton.setText("OGRENCİLERİ LİSTELE");
        studentsListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentsListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentsListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Ogrenciler", jPanel3);

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        teacherListButton.setBackground(java.awt.SystemColor.controlHighlight);
        teacherListButton.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        teacherListButton.setForeground(new java.awt.Color(51, 51, 51));
        teacherListButton.setText("OGRETMENLERİ LİSTELE");
        teacherListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListButtonActionPerformed(evt);
            }
        });

        teachersTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ogretmen ID", "Isim Soyisim", "TC Kimlik", "Bolum", "Fakulte", "Fakulte ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(teachersTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherListButton)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Ogretmenler", jPanel5);

        jPanel4.setBackground(java.awt.SystemColor.activeCaption);

        officersTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        officersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Memur ID", "TC Kimlik", "Isım Soyisim", "Görev"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(officersTable);

        officerListButton.setBackground(java.awt.SystemColor.controlHighlight);
        officerListButton.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        officerListButton.setForeground(new java.awt.Color(51, 51, 51));
        officerListButton.setText("MEMURLARI LİSTELE");
        officerListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officerListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(officerListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(officerListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Memurlar", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listele", jPanel2);

        jPanel7.setBackground(java.awt.SystemColor.activeCaption);

        jTabbedPane3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        jPanel8.setBackground(java.awt.SystemColor.controlHighlight);

        idActivityField.setBackground(java.awt.SystemColor.scrollbar);
        idActivityField.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Duyuru ID");

        contentArea.setColumns(20);
        contentArea.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        contentArea.setRows(5);
        jScrollPane1.setViewportView(contentArea);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setText("Duyuru Adı");

        activityNameField.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setText("Açıklama");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel10.setText("Başlangıç Tarih");

        duyuruYayinlaButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        duyuruYayinlaButton.setText("YAYINLA");
        duyuruYayinlaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyuruYayinlaButtonActionPerformed(evt);
            }
        });

        mesajDuyuruYayin.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        mesajDuyuruYayin.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(idActivityField)
                            .addComponent(activityNameField)
                            .addComponent(mesajDuyuruYayin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(duyuruYayinlaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(activityDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(activityDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idActivityField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activityNameField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duyuruYayinlaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesajDuyuruYayin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane3.addTab("Duyuru Yayınla", jPanel8);

        jPanel9.setBackground(java.awt.SystemColor.controlHighlight);

        duyurularTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        duyurularTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Duyuru ID", "Duyuru Adı", "Açıklama", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(duyurularTable);

        duyuruGuncelleButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        duyuruGuncelleButton.setText("GUNCELLE");
        duyuruGuncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyuruGuncelleButtonActionPerformed(evt);
            }
        });

        duyuruSilButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        duyuruSilButton.setText("SİL");
        duyuruSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyuruSilButtonActionPerformed(evt);
            }
        });

        mesajDuyuru.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        mesajDuyuru.setForeground(new java.awt.Color(0, 102, 153));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Seçili olan duyuruda yapılan işlemler gerçekleştirilir");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(duyuruGuncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(duyuruSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(mesajDuyuru, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajDuyuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duyuruGuncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duyuruSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jTabbedPane3.addTab("Duyuru Ayarlar", jPanel9);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Duyuru İslemleri", jPanel7);

        jPanel10.setBackground(java.awt.SystemColor.activeCaption);

        belgeTalepTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        belgeTalepTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Başvuru No", "Ogrenci No", "Dokuman", "Kurum", "Açıklama", "Onay Durumu", "Link", "Başvuru Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(belgeTalepTable);

        approveButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        approveButton.setText("BELGE OLUŞTUR");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        retButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        retButton.setText("TALEP RED");
        retButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retButtonActionPerformed(evt);
            }
        });

        onayMesaj.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onayMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(retButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveButton)
                    .addComponent(retButton))
                .addGap(18, 18, 18)
                .addComponent(onayMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Onay İslemleri", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teknikDestekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teknikDestekButtonActionPerformed

       
    }//GEN-LAST:event_teknikDestekButtonActionPerformed

    private void kayitSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitSilButtonActionPerformed
        mesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Kaydınız silinecektir. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        if (yanit ==JOptionPane.YES_OPTION){
            int idNo = Integer.parseInt((String)idOfficerField.getText());
            memur.kaldir(idNo);
            mesaj.setForeground(Color.red);
            mesaj.setText("Memur kaydı silinmiştir.");
        }
        else{
            mesaj.setForeground(Color.CYAN);
            mesaj.setText("İşlem gerçekleştirilemedi.");
        }
    }//GEN-LAST:event_kayitSilButtonActionPerformed

    private void güncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncelleButtonActionPerformed
        mesaj.setText(" ");
        try{
            int yanit = JOptionPane.showConfirmDialog(this, "Kaydınız güncellenecektir. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);

            int idOfficer = Integer.parseInt((String)idOfficerField.getText());
            String nameSurname = nameSurnameField.getText();
            String tcNo = tcNoField.getText();
            String password = new String(passwordField.getPassword());
            String employment = employmentField.getText();
            if (yanit ==JOptionPane.YES_OPTION){
                Memur m = new Memur(idOfficer, nameSurname, tcNo, password,employment);
                memur.guncelle(m);
                mesaj.setForeground(Color.GREEN);
                mesaj.setText("Kayit güncellendi.");
            }
            else{
                mesaj.setText("Kayit güncellenemedi.");
            }
        }catch(Exception ex){ System.out.print(ex);}
    }//GEN-LAST:event_güncelleButtonActionPerformed

    private void studentsListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsListButtonActionPerformed
        ArrayList<Ogrenci> ogrenciList = ogrenci.listele();
        int i=0;
        model = (DefaultTableModel) studentsTable.getModel();
        
        if(ogrenciList != null){
            for (Ogrenci o : ogrenciList){
                int idNo = ogrenciList.get(i).getIdNo();
                String nameSurname = ogrenciList.get(i).getNameSurname();
                String tcNo = ogrenciList.get(i).getTcNo();
                int sinifi = ogrenciList.get(i).getSınıf();
                int semester = ogrenciList.get(i).getSemester();
                int idFaculty = ogrenciList.get(i).getIdFaculty();
                float GANO = ogrenciList.get(i).getGANO();
                Object [] data = {idNo, nameSurname,tcNo,sinifi,semester,idFaculty,GANO};
                model.addRow(data);
                i++;
            }
        }
        
    }//GEN-LAST:event_studentsListButtonActionPerformed

    private void teacherListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListButtonActionPerformed
        ArrayList<Ogretmen> ogretmenList = ogretmen.listele();
        int i=0;
        model = (DefaultTableModel) teachersTable.getModel();
        
        if(ogretmenList != null){
            for (Ogretmen ogrt : ogretmenList){
                int idNo = ogretmenList.get(i).getIdNo();
                String nameSurname = ogretmenList.get(i).getNameSurname();
                String tcNo = ogretmenList.get(i).getTcNo();
                String department = ogretmenList.get(i).getDepartment();
                String facultyName = ogretmenList.get(i).getFacultyName();
                int idFaculty = ogretmenList.get(i).getIdFaculty();
                
                Object [] data = {idNo, nameSurname,tcNo,department,facultyName,idFaculty};
                model.addRow(data);
                i++;
            }
        }
    }//GEN-LAST:event_teacherListButtonActionPerformed

    private void officerListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officerListButtonActionPerformed
        ArrayList<Memur> memurList = memur.listele();
        int i=0;
        model = (DefaultTableModel) officersTable.getModel();
        
        if(memurList != null){
            for (Memur mem : memurList){
                int idNo = memurList.get(i).getIdNo();
                String nameSurname = memurList.get(i).getNameSurname();
                String tcNo = memurList.get(i).getTcNo();
                String employment = memurList.get(i).getEmployment();
                Object [] data = {idNo, nameSurname,tcNo,employment};
                model.addRow(data);
                i++;
            }
        }
        
    }//GEN-LAST:event_officerListButtonActionPerformed

    private void duyuruYayinlaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyuruYayinlaButtonActionPerformed
        mesajDuyuruYayin.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Duyuru yayınlanacaktır. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        
        int idActivity = Integer.parseInt(idActivityField.getText());
        String activityName = activityNameField.getText();
        String content = contentArea.getText();
        Date d = activityDateCalendar.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(d).toString();
        
        if (yanit ==JOptionPane.YES_OPTION){
            memur.duyuruYayinla(new Duyuru(idActivity,activityName,content,date));
            mesajDuyuruYayin.setText("Duyuru yayınlandı.");
            int row = duyurularTable.getSelectedRow();
            int rows = model.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model.removeRow(i); 
            }
            duyurular();
        }else{
            mesajDuyuruYayin.setForeground(Color.orange);
            mesajDuyuruYayin.setText("Duyuru yayınlanamadı."); 
        }
        
    }//GEN-LAST:event_duyuruYayinlaButtonActionPerformed

    private void duyuruGuncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyuruGuncelleButtonActionPerformed
        mesajDuyuru.setText(" ");
        int row = duyurularTable.getSelectedRow();
        int idNo = Integer.parseInt(duyurularTable.getModel().getValueAt(row, 0).toString());
        String activityName = duyurularTable.getModel().getValueAt(row, 1).toString();
        String content = duyurularTable.getModel().getValueAt(row, 2).toString();
        String date = duyurularTable.getModel().getValueAt(row, 3).toString();
        JOptionPane.showMessageDialog(rootPane,"Duyuru Guncellenmiştir.");
        memur.duyuruGuncelle(new Duyuru(idNo,activityName,content,date));
        
    }//GEN-LAST:event_duyuruGuncelleButtonActionPerformed

    private void duyuruSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyuruSilButtonActionPerformed
        mesajDuyuru.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Duyuruyu silmek istiyor musunu?","Onay",JOptionPane.YES_NO_OPTION);
        int row = duyurularTable.getSelectedRow();
        int idNo = Integer.parseInt(duyurularTable.getModel().getValueAt(row, 0).toString());
        
        if (yanit ==JOptionPane.YES_OPTION){
            memur.duyuruSil(idNo);
            mesajDuyuru.setForeground(Color.red);
            mesajDuyuru.setText("Duyuru silindi.");
            int rows = model.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model.removeRow(i); 
            }
            duyurular();
        }
        
    }//GEN-LAST:event_duyuruSilButtonActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        onayMesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Belge talebini onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        int row = belgeTalepTable.getSelectedRow();
        int idRequest = Integer.parseInt(belgeTalepTable.getModel().getValueAt(row, 0).toString());
        int idStudent = Integer.parseInt(belgeTalepTable.getModel().getValueAt(row, 1).toString());
        String belgeTip = belgeTalepTable.getModel().getValueAt(row, 2).toString();
        String link =   belgeTalepTable.getModel().getValueAt(row, 6).toString();  ///belge oluşturup linklerini ata
        if (yanit ==JOptionPane.YES_OPTION){
            memur.belgeOnay(idRequest);
            if(belgeTip == "Transkript"){
                memur.transkriptYazdir(new Ogrenci(idStudent));
                
            }
            else if(belgeTip == "Disiplin Belgesi"){
                memur.StajZorunlulugu(idStudent);
            }
            else if(belgeTip == "Ogrenci Belgesi"){
                memur.ogrenciBelgesiYazdir(new Ogrenci(idStudent));
            }
            else if(belgeTip == "Staj Zorunluluk Belgesi"){
                memur.StajZorunlulugu(idStudent);
            }
            
            
            
            
            
            onayMesaj.setForeground(Color.green);
            onayMesaj.setText("Belge onaylandı. Belge oluşturuldu.");
            int rows = model.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model.removeRow(i); 
            }
            belgeTalepler();
        }
    }//GEN-LAST:event_approveButtonActionPerformed

    private void retButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retButtonActionPerformed
        onayMesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Belge talebini reddedeceksiniz. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        int row = belgeTalepTable.getSelectedRow();
        int idRequest = Integer.parseInt(belgeTalepTable.getModel().getValueAt(row, 0).toString());
        
        if (yanit ==JOptionPane.YES_OPTION){
            memur.belgeRed(idRequest);
            onayMesaj.setForeground(Color.red);
            onayMesaj.setText("Belge talebi reddedildi.");
            int rows = model.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model.removeRow(i); 
            }
            belgeTalepler();
        }
    }//GEN-LAST:event_retButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idNo=0;
                new FMemur(402).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar activityDateCalendar;
    private javax.swing.JTextField activityNameField;
    private javax.swing.JButton approveButton;
    private javax.swing.JTable belgeTalepTable;
    private javax.swing.JTextArea contentArea;
    private javax.swing.JButton duyuruGuncelleButton;
    private javax.swing.JButton duyuruSilButton;
    private javax.swing.JButton duyuruYayinlaButton;
    private javax.swing.JButton duyurularButton;
    private javax.swing.JTable duyurularTable;
    private javax.swing.JTextField employmentField;
    private javax.swing.JButton güncelleButton;
    private javax.swing.JTextField idActivityField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idOfficerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton kayitSilButton;
    private javax.swing.JLabel mesaj;
    private javax.swing.JLabel mesajDuyuru;
    private javax.swing.JLabel mesajDuyuruYayin;
    private javax.swing.JTextField nameSurnameField;
    private javax.swing.JButton officerListButton;
    private javax.swing.JTable officersTable;
    private javax.swing.JLabel onayMesaj;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton retButton;
    private javax.swing.JButton studentsListButton;
    private javax.swing.JTable studentsTable;
    private javax.swing.JTextField tcNoField;
    private javax.swing.JButton teacherListButton;
    private javax.swing.JTable teachersTable;
    private javax.swing.JButton teknikDestekButton;
    // End of variables declaration//GEN-END:variables
}
