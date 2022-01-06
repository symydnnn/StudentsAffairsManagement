
package business;

import Database.Database;
import Database.IOgrenci;
import entities.Ders;
import entities.Ogrenci;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OgrenciYonetim extends Yonetim implements IOgrenci{
    Database db = new Database();
    private Connection con;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public OgrenciYonetim() {}

    @Override
    public ArrayList<Ogrenci> listele() {
        ArrayList<Ogrenci> ogrList = new ArrayList<Ogrenci>();
        ArrayList a = new ArrayList();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.student;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idNo = rs.getInt("idStudent");
                String nameSurname = rs.getString("nameSurname");
                String tcNo = rs.getString("tcNo");
                String password = rs.getString("password");
                int sınıf = rs.getInt("class");
                int semester = rs.getInt("semester");
                int idFaculty = rs.getInt("idFaculty");
                float GANO = rs.getFloat("GANO");
                ogrList.add(new Ogrenci(idNo, nameSurname, tcNo, idFaculty, sınıf, semester, GANO, password));
            }
            return ogrList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Ogrenci> listele(int idNo){
        ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> ogr = new ArrayList<Ogrenci>();
        ogrenciList = listele();
        if (ogrenciList != null ) {
            for (Ogrenci o : ogrenciList) {
                    if(o.getIdNo()==idNo){
                        ogr.add(new Ogrenci(o.getIdNo(), o.getNameSurname(), o.getTcNo(), o.getIdFaculty(), o.getSınıf(),o.getSemester(), o.getGANO(), o.getPassword()));
                    }
            }
        }
        return ogr;
    }
    
    public int ogrenciNo(String tcNo){
        int idNo = 0;
        ArrayList<Ogrenci> ogrList = new ArrayList<Ogrenci>();
        ogrList = listele();
        if (ogrList != null ) {
            for (Ogrenci o : ogrList) {
                    if(o.getTcNo() == null ? tcNo == null : o.getTcNo().equals(tcNo)){
                        idNo = o.getIdNo();
                    }
            }
        }
        return idNo;
    }
    
    @Override
    public void guncelle(Ogrenci ogrenci) {
        if(con==null){
            System.out.println("Guncelleniyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.student set nameSurname = ? , tcNo = ?, idFaculty = ?, class =?, semester = ?, GANO = ?, password = ? where idStudent = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(8, ogrenci.getIdNo());
            preparedStatement.setString(1, ogrenci.getNameSurname());
            preparedStatement.setString(2, ogrenci.getTcNo());
            preparedStatement.setInt(3, ogrenci.getIdFaculty());
            preparedStatement.setInt(4, ogrenci.getSınıf());
            preparedStatement.setInt(5, ogrenci.getSemester());
            preparedStatement.setFloat(6, ogrenci.getGANO());
            preparedStatement.setString(7, ogrenci.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void kaldir(int idNo) {
        if(con==null){
            System.out.println("Kaldirma icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Delete from schoolm.student where idStudent = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, idNo);
            preparedStatement.executeUpdate();
            System.out.println("Ogrenci silindi");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ekle(Ogrenci ogrenci) {
        if(con==null){
            System.out.println("Ekleme icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.student (idStudent,nameSurname,tcNo,idFaculty,class,semester,GANO,password) VALUES(?,?,?,?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogrenci.getIdNo());
            preparedStatement.setString(2, ogrenci.getNameSurname());
            preparedStatement.setString(3, ogrenci.getTcNo());
            preparedStatement.setInt(4, ogrenci.getIdFaculty());
            preparedStatement.setInt(5, ogrenci.getSınıf());
            preparedStatement.setInt(6, ogrenci.getSemester());
            preparedStatement.setFloat(7, ogrenci.getGANO());
            preparedStatement.setString(8, ogrenci.getPassword());
            preparedStatement.executeUpdate();
            System.out.println("Ogrenci Eklendi");
            
            String sorgu2 = "Insert Into schoolm.isactive (idStudent,isactive) VALUES(?,?);";
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, ogrenci.getIdNo());
            preparedStatement.setBoolean(2, true);
            preparedStatement.executeUpdate();
            
            String sorgu3 = "Insert Into schoolm.discipline (idStudent,discipline) VALUES(?,?);";
            preparedStatement = con.prepareStatement(sorgu3);
            preparedStatement.setInt(1, ogrenci.getIdNo());
            preparedStatement.setString(2, "yok");
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public boolean girisYap(String tcNo, String password) {
        if(con==null){
            System.out.println("Giris Yapiliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.student where tcNo = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,tcNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public boolean girisYap(int idNo, String password) {
        if(con==null){
            System.out.println("Giris Yapiliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.student where idStudent = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,idNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    public void kayitDondur(int idStudent){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu = "Update schoolm.isactive set isactive = ? where idStudent = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(2, idStudent);
            preparedStatement.setBoolean(1, false);
            preparedStatement.executeUpdate();
            System.out.println("Hesap donduruldu");
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void kayitAktiflestir(int idStudent){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu = "Update schoolm.isactive set isactive = ? where idStudent = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(2, idStudent);
            preparedStatement.setBoolean(1, true);
            preparedStatement.executeUpdate();
            System.out.println("Hesap aktiflesitirildi");
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int kayitDurumuSogrula(int idStudent){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu = "SELECT * FROM schoolm.isactive WHERE idStudent = "+idStudent;
        try{
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);
            
            while (rs.next()){
                int idNo = rs.getInt("idStudent");
                Boolean isActive = rs.getBoolean("isactive");
                int kayit = 999;
                if(isActive == true)
                    kayit = 1;
                else
                    kayit = 0;
                return kayit;
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return 1000;
    }
    
    @Override
    public void dersSec(Ders ders){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.section (idSection,idStudent,idLectures) VALUES(?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ders.getIdSection());
            preparedStatement.setInt(2, ders.getIdStudent());
            preparedStatement.setInt(3, ders.getIdNo());
            preparedStatement.executeUpdate();
            System.out.println("Ders Kaydi Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public ArrayList<Ders> dersleriGoruntule(int idFaculty){ //ogrenci kayıtlı olduğu dersler
        ArrayList<Ders> dersList = new ArrayList<Ders>();
        
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
        Statement stmt=con.createStatement();
        String sorgu = "SELECT  l.idLectures, l.lectureName, l.Date,l.ACTS, l.credit, l.Semester, t.nameSurname as ogretmen, f.FacultyName,f.Department " +
                "FROM schoolm.lecturedepartment ld, schoolm.lectures as l, schoolm.faculty as f, schoolm.teacher as t " +
                "WHERE ld.idLectures = l.idLectures and f.idFaculty = ld.idFaculty and t.idTeacher = l.idTeacher and f.idFaculty ="+idFaculty+";";
        ResultSet rs = stmt.executeQuery(sorgu);
        while (rs.next()){
                int idNo = rs.getInt("idLectures");
                String lectureName = rs.getString("lectureName");
                String date = rs.getString("Date");
                int ACTS = rs.getInt("ACTS");
                int credit = rs.getInt("credit");
                int semester = rs.getInt("Semester");
                String ogretmen = rs.getString("ogretmen");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                dersList.add(new Ders(idNo,lectureName,date,ACTS,credit,semester,ogretmen,facultyName,department,idFaculty));
            }
        return dersList;
        }catch (SQLException ex){
            System.out.println(ex);
            return null;
        }
        
    }
    
    
    @Override
    public int idAtama(){
        ArrayList idList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idStudent FROM schoolm.student;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idStudent");
                idList.add(idNo);
            }
            int size = (int)idList.size();
            int idNo = (int)idList.get(size-1)+1;
            return idNo;
        }catch (SQLException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    public int idAtama(int idStudent){
        ArrayList idList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idRequest FROM schoolm.request;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idRequest");
                idList.add(idNo);
            }
            int size = (int)idList.size();
            int idNo = (int)idList.get(size-1)+1;
            return idNo;
        }catch (SQLException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    public int fakultesi(int idNo){
        ArrayList faukleList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idFaculty FROM schoolm.student WHERE idStudent = "+idNo+";";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idFaculty = rs.getInt("idFaculty");
                faukleList.add(idFaculty);
            }
            int size = (int)faukleList.size();
            int idFaculty = (int)faukleList.get(size-1);
            return idFaculty;
        }catch (SQLException ex){
            System.out.println(ex);
            return 0;
        }
    }
    
    
    public void belgeTalep(Ogrenci ogrenci){
        if(con==null){
            System.out.println("Talep olusturuluyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.request (idStudent,documentType,instutation,content,approve,link,date,idRequest) VALUES(?,?,?,?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogrenci.getIdNo());
            preparedStatement.setString(2, ogrenci.getDocumentType());
            preparedStatement.setString(3, ogrenci.getInstutation());
            preparedStatement.setString(4, ogrenci.getContent());
            preparedStatement.setInt(5, -1);
            preparedStatement.setString(6, null);
            preparedStatement.setString(7, ogrenci.getDate());
            preparedStatement.setInt(8, ogrenci.getIdRequest());
            preparedStatement.executeUpdate();
            System.out.println("Belge talebi olusturuldu");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Ogrenci> belgeTalepleriGoruntule(int idStudent){
        ArrayList<Ogrenci> belgeList = new ArrayList<Ogrenci>();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.request where idStudent="+idStudent+";";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                idStudent = rs.getInt("idStudent");
                int idRequest = rs.getInt("idRequest");
                String documentType = rs.getString("documentType");
                String instutation = rs.getString("instutation");
                String content = rs.getString("content");
                int approve = rs.getInt("approve");
                String link = rs.getString("link");
                String date = rs.getString("date");
                belgeList.add(new Ogrenci(idRequest,idStudent,documentType,instutation,content,approve,link,date));
            }
            return belgeList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    @Override
    public ArrayList<Ders> fakulte(int idNo){  
        ArrayList<Ders> fakulteList = new ArrayList<Ders>();
        ArrayList a = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT s.idStudent, s.idFaculty, f.FacultyName, f.Department FROM schoolm.student as s, schoolm.faculty as f where s.idFaculty = f.idFaculty and s.idStudent ="+idNo+";";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idFaculty = rs.getInt("idFaculty");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                fakulteList.add(new Ders(idFaculty,facultyName,department));
            }
            return fakulteList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
        
    }
}
