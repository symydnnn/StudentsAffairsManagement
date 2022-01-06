
package GUI;

import business.OgretmenYonetim;
import business.Yonetim;
import entities.Ders;
import entities.Ogrenci;
import entities.Ogretmen;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FOgretmen extends javax.swing.JFrame {
    Yonetim yonetim = new Yonetim();
    DefaultTableModel model;
    OgretmenYonetim ogretmen = new OgretmenYonetim();
    
    public FOgretmen(int idNo) {
        initComponents();
        idTeacherField.setText(String.valueOf(idNo));
        idTeacherField.setVisible(false);
        profil(idNo);
        idLectureField.setText(String.valueOf(ogretmen.idAtama(idNo)));
    }
    
    public void profil(int idNo){
        Ogretmen ogrt = new Ogretmen(idNo);
        ArrayList<Ders> fakulte = ogretmen.fakulte(idNo);
        ArrayList<Ogretmen> ot = ogretmen.listele(idNo);
        idField.setText(String.valueOf(ot.get(0).getIdNo()));
        nameSurnameField.setText(ot.get(0).getNameSurname());
        tcNoField.setText(ot.get(0).getTcNo());
        facultyNameField.setText(fakulte.get(0).getFacultyName());
        departmentField.setText(fakulte.get(0).getDepartment());
        passwordField.setText(String.valueOf(ot.get(0).getPassword()));
        facultyIdField.setText(String.valueOf(ot.get(0).getIdFaculty()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        danismanlikButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idTeacherField = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idLectureField = new javax.swing.JTextField();
        lectureNameField = new javax.swing.JTextField();
        ACTSSpinner = new javax.swing.JSpinner();
        creditSpinner = new javax.swing.JSpinner();
        semesterSpinner = new javax.swing.JSpinner();
        dateCalendar = new com.toedter.calendar.JCalendar();
        facultyCB = new javax.swing.JComboBox<>();
        departmentCB = new javax.swing.JComboBox<>();
        Fakulte = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dersKayitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsListTable = new javax.swing.JTable();
        idLecturesField = new javax.swing.JTextField();
        listOfStudentsButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        vizeMeanField = new javax.swing.JTextField();
        finalMeanField = new javax.swing.JTextField();
        meanMeanField = new javax.swing.JTextField();
        studentsField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        idLectureeField = new javax.swing.JTextField();
        idStudenttField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentLectureTable = new javax.swing.JTable();
        ogrenciGetirButton = new javax.swing.JButton();
        notKayitButton = new javax.swing.JButton();
        mesajNotIslemleri = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        kayitSilButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        tcNoField = new javax.swing.JTextField();
        facultyNameField = new javax.swing.JTextField();
        nameSurnameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        departmentField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        güncelleButton = new javax.swing.JButton();
        mesaj = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        facultyIdField = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(153, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        jPanel1.setBackground(java.awt.SystemColor.controlShadow);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ÖGRETMEN İSLEMLERİ");

        danismanlikButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        danismanlikButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        danismanlikButton.setForeground(new java.awt.Color(203, 110, 31));
        danismanlikButton.setText("DANISMAN MAIL");

        jButton2.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(203, 110, 31));
        jButton2.setText("DUYURULAR");

        jButton3.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(203, 110, 31));
        jButton3.setText("TEKNIK DESTEK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(danismanlikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(idTeacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idTeacherField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(danismanlikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ana Sayfa", jPanel1);

        jPanel2.setBackground(java.awt.SystemColor.controlShadow);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setText("Ders Kodu");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel7.setText("Ders Adi");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel12.setText("Baslangıç Tarihi");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel13.setText("ACTS");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel14.setText("Kredi");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel15.setText("Dönem");

        idLectureField.setEditable(false);
        idLectureField.setBackground(java.awt.SystemColor.scrollbar);

        ACTSSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        creditSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        semesterSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        facultyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknoloji Fakultesi", "Muhendislik Fakultesi", "Ataturk Egitim Fakultesi", "Saglik Bilimleri Fakultesi", "Tıp Fakultesi" }));

        departmentCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilgisayar Muhendisligi", "Elektrik Muhendisligi", "Cevre Muhendisligi", "Cografya Ogretmenligi", "Ebelik", "Hemsirelik", "Fizyoloji", "Tıp" }));

        Fakulte.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        Fakulte.setText("Fakulte");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel17.setText("Bolum");

        dersKayitButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        dersKayitButton.setForeground(new java.awt.Color(0, 102, 102));
        dersKayitButton.setText("Ders Kaydı Olustur");
        dersKayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersKayitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idLectureField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel15))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fakulte, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(departmentCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultyCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)
                            .addComponent(semesterSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditSpinner))
                        .addComponent(ACTSSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dersKayitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(idLectureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACTSSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(lectureNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(semesterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facultyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fakulte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(28, 28, 28)
                        .addComponent(dersKayitButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ders Ekle", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.controlShadow);

        studentsListTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        studentsListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Adi", "Ogrenci No", "Isim Soyisim", "Vize", "Final", "Ortalama", "Başarı Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
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
        jScrollPane2.setViewportView(studentsListTable);

        idLecturesField.setBackground(java.awt.SystemColor.controlHighlight);
        idLecturesField.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        idLecturesField.setForeground(new java.awt.Color(0, 102, 204));

        listOfStudentsButton.setBackground(java.awt.SystemColor.controlHighlight);
        listOfStudentsButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        listOfStudentsButton.setForeground(new java.awt.Color(0, 51, 102));
        listOfStudentsButton.setText("Ogrencileri Listele");
        listOfStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfStudentsButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel16.setText("Vize Ortalama");

        vizeMeanField.setEditable(false);
        vizeMeanField.setBackground(java.awt.SystemColor.controlHighlight);
        vizeMeanField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        finalMeanField.setEditable(false);
        finalMeanField.setBackground(java.awt.SystemColor.controlHighlight);
        finalMeanField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        meanMeanField.setEditable(false);
        meanMeanField.setBackground(java.awt.SystemColor.controlHighlight);
        meanMeanField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        studentsField.setEditable(false);
        studentsField.setBackground(java.awt.SystemColor.controlHighlight);
        studentsField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        studentsField.setForeground(new java.awt.Color(0, 153, 0));

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel18.setText("DERS KODU");

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel19.setText("Final Ortalama");

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel20.setText("Genel Ortalama");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel21.setText("Ogrenci Sayisi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idLecturesField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listOfStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vizeMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finalMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meanMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentsField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLecturesField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listOfStudentsButton)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vizeMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meanMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sınıf Listesi", jPanel3);

        jPanel4.setBackground(java.awt.SystemColor.controlShadow);

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel22.setText("Ders Kodu");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel23.setText("Ogrenci No");

        idLectureeField.setBackground(java.awt.SystemColor.controlHighlight);
        idLectureeField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        idStudenttField.setBackground(java.awt.SystemColor.controlHighlight);
        idStudenttField.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N

        studentLectureTable.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        studentLectureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Adi", "Isim Soyisim", "Vize", "Final", "Ortalama", "Başarı Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(studentLectureTable);

        ogrenciGetirButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        ogrenciGetirButton.setForeground(new java.awt.Color(0, 51, 102));
        ogrenciGetirButton.setText("Ogrenci Getir");
        ogrenciGetirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciGetirButtonActionPerformed(evt);
            }
        });

        notKayitButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        notKayitButton.setForeground(new java.awt.Color(0, 51, 102));
        notKayitButton.setText("Notu Kaydet");
        notKayitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notKayitButtonActionPerformed(evt);
            }
        });

        mesajNotIslemleri.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mesajNotIslemleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idStudenttField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(idLectureeField))
                        .addGap(69, 69, 69)
                        .addComponent(ogrenciGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(notKayitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(idLectureeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idStudenttField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ogrenciGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(notKayitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mesajNotIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Not Islemleri", jPanel4);

        jPanel6.setBackground(java.awt.SystemColor.controlShadow);

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
        jLabel3.setText("Ogretmen ID");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("TC Kimlik");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setText("Şifre");

        idField.setEditable(false);
        idField.setBackground(java.awt.SystemColor.scrollbar);

        facultyNameField.setEditable(false);
        facultyNameField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel8.setText("İsim Soyisim");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel9.setText("Fakülte Adı");

        passwordField.setText("jPasswo");

        departmentField.setEditable(false);
        departmentField.setBackground(java.awt.SystemColor.scrollbar);

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel11.setText("Bolümü");

        güncelleButton.setBackground(java.awt.SystemColor.controlHighlight);
        güncelleButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        güncelleButton.setForeground(new java.awt.Color(203, 110, 31));
        güncelleButton.setText("Güncelle");
        güncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleButtonActionPerformed(evt);
            }
        });

        mesaj.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        mesaj.setForeground(new java.awt.Color(153, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel10.setText("Fakülte ID");

        facultyIdField.setEditable(false);
        facultyIdField.setBackground(java.awt.SystemColor.scrollbar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(güncelleButton))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(facultyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(facultyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(güncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Kayit Islemleri", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void kayitSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitSilButtonActionPerformed
        mesaj.setText(" ");
        int yanit = JOptionPane.showConfirmDialog(this, "Kaydınız silinecektir. Onaylıyor musunuz?","Onay",JOptionPane.YES_NO_OPTION);
        if (yanit ==JOptionPane.YES_OPTION){
            int idNo = Integer.parseInt((String)idTeacherField.getText());
            ogretmen.kaldir(idNo);
            mesaj.setForeground(Color.orange);
            mesaj.setText("Ogretmen kaydı silinmiştir.");
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

            int idTeacher = Integer.parseInt((String)idTeacherField.getText());
            String nameSurname = nameSurnameField.getText();
            String tcNo = tcNoField.getText();
            String password = new String(passwordField.getPassword());
            String department = departmentField.getText();
            int idFaculty = Integer.parseInt((String)facultyIdField.getText());
            if (yanit ==JOptionPane.YES_OPTION){
                Ogretmen o = new Ogretmen(idTeacher, idFaculty, nameSurname, tcNo, password,department);
                ogretmen.guncelle(o);
                mesaj.setForeground(Color.GREEN);
                mesaj.setText("Kayit güncellendi.");
            }
            else{
                mesaj.setText("Kayit güncellenemedi.");
            }
        }catch(Exception ex){ System.out.print(ex);}

    }//GEN-LAST:event_güncelleButtonActionPerformed

    private void dersKayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersKayitButtonActionPerformed
        idLectureField.setVisible(true);
        int idLectures = Integer.parseInt(idLectureField.getText());
        String lectureName = lectureNameField.getText();
        int ACTS = Integer.parseInt(ACTSSpinner.getValue().toString());
        int semester = Integer.parseInt(semesterSpinner.getValue().toString());
        int credit =    Integer.parseInt(creditSpinner.getValue().toString());
        String faculty = facultyCB.getSelectedItem().toString();
        String department = departmentCB.getSelectedItem().toString();
        int idFaculty = Integer.parseInt(ogretmen.bolumID(faculty,department).get(0).toString());
        Date d = dateCalendar.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(d).toString();
        int idTeacher = Integer.parseInt(idTeacherField.getText());
        Ders ders = new Ders(idLectures,lectureName,date,ACTS,credit,semester);
        ogretmen.dersOlustur(ders, idTeacher,idFaculty);
        
    }//GEN-LAST:event_dersKayitButtonActionPerformed

    private void listOfStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfStudentsButtonActionPerformed
        int idLectures = Integer.parseInt(idLecturesField.getText());
        ArrayList<Ders> sinifList = ogretmen.dersiAlanOgrenciler(idLectures);
        int i=0;
        model = (DefaultTableModel) studentsListTable.getModel();
        
        if(sinifList != null){
            for (Ders ders : sinifList){
                String lectureName = sinifList.get(i).getLectureName();
                int idStudent = sinifList.get(i).getIdStudent();
                String nameSurname = sinifList.get(i).getStudentNameSurname();
                int vize = sinifList.get(i).getMidterm();
                int finali = sinifList.get(i).getFinali();
                float mean = sinifList.get(i).getMean();
                String grade = sinifList.get(i).getGrade();
                Object [] data = {lectureName, idStudent,nameSurname,vize,finali,mean,grade};
                model.addRow(data);
                i++;
            }
        }
        ArrayList<Ders> ortalamalar = ogretmen.dersinOrtalamasi(idLectures);
        studentsField.setText(String.valueOf(i));
        vizeMeanField.setText(String.valueOf(ortalamalar.get(0).getMidterm()));
        finalMeanField.setText(String.valueOf(ortalamalar.get(0).getFinali()));
        meanMeanField.setText(String.valueOf(ortalamalar.get(0).getMean()));
    }//GEN-LAST:event_listOfStudentsButtonActionPerformed

    private void ogrenciGetirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciGetirButtonActionPerformed
        mesajNotIslemleri.setText(" ");
        int idLectures = Integer.parseInt(idLectureeField.getText());
        int idStudent = Integer.parseInt(idStudenttField.getText());
        ArrayList<Ders> ogrenciDersi = ogretmen.ogrenciGetir(idStudent, idLectures);
        
        model = (DefaultTableModel) studentLectureTable.getModel();
        
        if(ogrenciDersi != null){
            for(Ders ders : ogrenciDersi){
                String lectureName = ogrenciDersi.get(0).getLectureName();
                String nameSurname = ogrenciDersi.get(0).getStudentNameSurname();
                int vize = ogrenciDersi.get(0).getMidterm();
                int finali = ogrenciDersi.get(0).getFinali();
                float mean = ogrenciDersi.get(0).getMean();
                String grade = ogrenciDersi.get(0).getGrade();
                Object [] data = {lectureName, nameSurname,vize,finali,mean,grade};
                model.addRow(data);
            }
        }
        else{
            mesajNotIslemleri.setForeground(Color.red);
            mesajNotIslemleri.setText("Ogrenci bulunamadı.");
        }
        
    }//GEN-LAST:event_ogrenciGetirButtonActionPerformed

    private void notKayitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notKayitButtonActionPerformed
        mesajNotIslemleri.setText("");
        int idLectures = Integer.parseInt(idLectureeField.getText());
        int idStudent = Integer.parseInt(idStudenttField.getText());
        Ogrenci o = new Ogrenci(idStudent,idLectures);
        try{
            int selectedrow = studentLectureTable.getSelectedRow();
            int vize = Integer.parseInt(model.getValueAt(selectedrow, 2).toString());
            int finali =  Integer.parseInt(model.getValueAt(selectedrow, 3).toString());
            Ders not = new Ders(vize,finali);
            ogretmen.dersNotuGir(not, o);
            mesajNotIslemleri.setForeground(Color.GREEN);
            mesajNotIslemleri.setText("Ogrencinin notu kaydedilmiştir.");
            int rows = model.getRowCount(); 
            for(int i = rows - 1; i >=0; i--){
                model.removeRow(i); 
            }
            ogrenciGetirButtonActionPerformed(evt);
        }
        catch(Exception ex){
            mesajNotIslemleri.setForeground(Color.RED);
            mesajNotIslemleri.setText("Beklenmeyen bir hata oluştu.");
        }
    }//GEN-LAST:event_notKayitButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idNo = 0;
                new FOgretmen(idNo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ACTSSpinner;
    private javax.swing.JLabel Fakulte;
    private javax.swing.JSpinner creditSpinner;
    private javax.swing.JButton danismanlikButton;
    private com.toedter.calendar.JCalendar dateCalendar;
    private javax.swing.JComboBox<String> departmentCB;
    private javax.swing.JTextField departmentField;
    private javax.swing.JButton dersKayitButton;
    private javax.swing.JComboBox<String> facultyCB;
    private javax.swing.JTextField facultyIdField;
    private javax.swing.JTextField facultyNameField;
    private javax.swing.JTextField finalMeanField;
    private javax.swing.JButton güncelleButton;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idLectureField;
    private javax.swing.JTextField idLectureeField;
    private javax.swing.JTextField idLecturesField;
    private javax.swing.JTextField idStudenttField;
    private javax.swing.JLabel idTeacherField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayitSilButton;
    private javax.swing.JTextField lectureNameField;
    private javax.swing.JButton listOfStudentsButton;
    private javax.swing.JTextField meanMeanField;
    private javax.swing.JLabel mesaj;
    private javax.swing.JLabel mesajNotIslemleri;
    private javax.swing.JTextField nameSurnameField;
    private javax.swing.JButton notKayitButton;
    private javax.swing.JButton ogrenciGetirButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JSpinner semesterSpinner;
    private javax.swing.JTable studentLectureTable;
    private javax.swing.JTextField studentsField;
    private javax.swing.JTable studentsListTable;
    private javax.swing.JTextField tcNoField;
    private javax.swing.JTextField vizeMeanField;
    // End of variables declaration//GEN-END:variables
}
