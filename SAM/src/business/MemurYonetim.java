
package business;

import Database.Database;
import Database.IMemur;
import entities.Ders;
import entities.Duyuru;
import entities.Memur;
import entities.Ogrenci;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemurYonetim extends Yonetim implements IMemur{
    Database db = new Database();
    private Connection con;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public MemurYonetim() {}
    
    @Override
    public ArrayList<Memur> listele(){
        ArrayList<Memur> memurList = new ArrayList<Memur>();
        ArrayList a = new ArrayList();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.officer;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idNo = rs.getInt("idOfficer");
                String tcNo = rs.getString("tcNo");
                String nameSurname = rs.getString("nameSurname");
                String password = rs.getString("password");
                String employment = rs.getString("employment");
                memurList.add(new Memur(idNo, nameSurname, tcNo, password, employment));
            }
            return memurList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Memur> listele(int idNo){
        ArrayList<Memur> memurList = new ArrayList<Memur>();
        ArrayList<Memur> me = new ArrayList<Memur>();
        memurList = listele();
        if (memurList != null ) {
            for (Memur m : memurList) {
                    if(m.getIdNo()==idNo){
                        me.add(new Memur(m.getIdNo(), m.getNameSurname(), m.getTcNo(), m.getPassword(), m.getEmployment()));
                    }
            }
        }
        return me;
    }
    
    public int memurNo(String tcNo){
        int idNo = 0;
        ArrayList<Memur> memurList = new ArrayList<Memur>();
        memurList = listele();
        if (memurList != null ) {
            for (Memur m : memurList) {
                    if(m.getTcNo() == null ? tcNo == null : m.getTcNo().equals(tcNo)){
                        idNo = m.getIdNo();
                    }
            }
        }
        return idNo;
    }

    @Override
    public void guncelle(Memur memur) {
        if(con==null){
            System.out.println("Guncelleniyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.officer set nameSurname = ? , tcNo = ?,password = ?, employment = ? where idOfficer = ?";
      
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(5, memur.getIdNo());
            preparedStatement.setString(1, memur.getNameSurname());
            preparedStatement.setString(2, memur.getTcNo());
            preparedStatement.setString(3, memur.getPassword());
            preparedStatement.setString(4, memur.getEmployment());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void kaldir(int idNo) {
        if(con==null){
            System.out.println("Kaldirmak icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Delete from schoolm.officer where idOfficer = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, idNo);
            preparedStatement.executeUpdate();
            System.out.println("Memur silindi");
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ekle(Memur memur) {
        if(con==null){
            System.out.println("Ekleme icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.officer (idOfficer,nameSurname,tcNo,password,employment) VALUES(?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, memur.getIdNo());
            preparedStatement.setString(2, memur.getNameSurname());
            preparedStatement.setString(3, memur.getTcNo());
            preparedStatement.setString(4, memur.getPassword());
            preparedStatement.setString(5, memur.getEmployment());
            preparedStatement.executeUpdate();
            System.out.println("Memur Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public boolean girisYap(String tcNo, String password) {
        if(con==null){
            System.out.println("Giris yapiliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.officer where tcNo = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,tcNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean girisYap(int idNo, String password) {
        if(con==null){
            System.out.println("Giris yapiliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.officer where idOfficer = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,idNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void duyuruYayinla(Duyuru duyuru) {
        if(con==null){
            System.out.println("Duyuru icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.activity (idActivity,activityName,content,activityDate) VALUES(?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, duyuru.getIdActivity());
            preparedStatement.setString(2, duyuru.getActivityName());
            preparedStatement.setString(3, duyuru.getContent());
            preparedStatement.setString(4, duyuru.getActivityDate());
            preparedStatement.executeUpdate();
            System.out.println("Duyuru Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void duyuruSil(int idActivity) {
        if(con==null){
            System.out.println("Kaldirmak icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Delete from schoolm.activity where idActivity = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, idActivity);
            preparedStatement.executeUpdate();
            System.out.println("Duyuru silindi");
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void duyuruGuncelle(Duyuru duyuru) {
        if(con==null){
            System.out.println("Guncelleniyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.activity set activityName = ? , content = ?, activityDate = ? where idActivity = ?";
      
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(4, duyuru.getIdActivity());
            preparedStatement.setString(1, duyuru.getActivityName());
            preparedStatement.setString(2, duyuru.getContent());
            preparedStatement.setString(3, duyuru.getActivityDate());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public void transkriptYazdir(Ogrenci ogrenci) {
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql= "SELECT * FROM schoolm.section as s, schoolm.lectures as l where l.idLectures = s.idLectures and s.idStudent = "+ogrenci.getIdNo()+";";
        
        try {
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int idSection = rs.getInt("idSection");
                int idStudent = rs.getInt("idStudent");
                int idLectures = rs.getInt("idLectures");
                String lectureName = rs.getString("lectureName");
                int midterm = rs.getInt("midterm");
                int finali = rs.getInt("final");
                float mean = rs.getFloat("mean");
                String grade = rs.getString("grade");
                System.out.println("Ogrenci id: "+idStudent+" Lecture:"+idLectures+" Lecture Name: "+lectureName+" midterm: "+midterm+" final: "+finali+" mean: "+mean+" grade: "+grade);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    

    @Override
    public void ogrenciBelgesiYazdir(Ogrenci ogrenci) {
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql= "SELECT s.idStudent,s.nameSurname,s.tcNo,s.idFaculty,f.FacultyName,f.Department,s.class,s.semester,s.GANO"
                + " FROM schoolm.student as s, schoolm.faculty as f where f.idFaculty = s.idFaculty and s.idStudent = "+ogrenci.getIdNo()+";";
        
        try {
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int idStudent = rs.getInt("idStudent");
                int idFaculty = rs.getInt("idFaculty");
                int tcNo = rs.getInt("tcNo");
                String nameSurname = rs.getString("nameSurname");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                int sinif = rs.getInt("class");
                int semester = rs.getInt("semester");
                float GANO = rs.getFloat("GANO");
                System.out.println("Ogrenci no: "+idStudent+"\nOgrenci: "+nameSurname+"\nTC Kimlik: "+tcNo
                +"\nFakülte bilgisi\nFakülte id: "+idFaculty+" Fakülte İsmi: "+facultyName+" Departman: "+department
                +"\nSınıfı: "+sinif+"\nDönem: "+semester+"\nGANO:"+GANO);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void dersEkle(Ders ders) {
    if(con==null){
            System.out.println("Ekleme icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.lectures (idLectures,lectureName,Date,ACTS,credit,Semester,idTeacher) VALUES(?,?,?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ders.getIdNo());
            preparedStatement.setString(2,ders.getLectureName());
            preparedStatement.setString(3, ders.getDate());
            preparedStatement.setInt(4, ders.getACTS());
            preparedStatement.setInt(5, ders.getCredit());
            preparedStatement.setInt(6, ders.getSemester());
            preparedStatement.setInt(7, ders.getIdTeacher());
            preparedStatement.executeUpdate();
            System.out.println("Ders Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    @Override
    public void StajZorunlulugu(int idStudent){
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql = "Select s.idStudent, f.idFaculty, f.FacultyName, f.Department from schoolm.student as s, schoolm.faculty as f where s.idFaculty = f.idFaculty and s.idStudent ="+idStudent+";";
        try {
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                idStudent = rs.getInt("idStudent");
                int idFaculty = rs.getInt("idFaculty");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                System.out.println("Ogrenci no: "+idStudent
                        +"\nFakülte bilgisi\nFakülte id: "+idFaculty+" Fakülte İsmi: "+facultyName+" Departman: "+department);
                
                if(idFaculty == 201){
                    System.out.println("20 ve 40 iş günü staj zorunlu degildir.");
                } 
                else if (idFaculty == 200){
                    System.out.println("36 ve 36, toplam 72 iş günü staj zorunlu degildir.");
                }
                else{
                    System.out.println("Staj zorunlulugu bulunmamaktadir");
                }
                
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MemurYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }
    
    @Override
    public void DisiplinSucuSorgula(int idStudent){
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql = "Select * from schoolm.discipline where idStudent ="+idStudent+";";
        try {
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                idStudent = rs.getInt("idStudent");
                String discipline = rs.getString("discipline");
                
                System.out.println(idStudent + " No'lu ogrencinin disiplin sucu: "+discipline);
                
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
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
            String sorgu = "SELECT idOfficer FROM schoolm.officer;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idOfficer");
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
    
    
    public void belgeOnay(int idRequest){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.request set approve = ? where idRequest = ?";
      
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(2, idRequest);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Beklenmeyen bir hata olustu.");
        }
    }
    
    public void belgeRed(int idRequest){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.request set approve = ? where idRequest = ?";
      
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, 0);
            preparedStatement.setInt(2, idRequest);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Beklenmeyen bir hata olustu.");
        }
    }
    
    public void linkEkle(int idRequest, String link){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu =  "Update schoolm.request set link = ? where idRequest = ?";
      
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, link);
            preparedStatement.setInt(2, idRequest);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Beklenmeyen bir hata olustu.");
        }
    }
    
    
    

}
      

