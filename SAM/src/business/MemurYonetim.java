
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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.List;


public class MemurYonetim extends Yonetim implements IMemur{
    Database db = new Database();
    private Connection con;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    OgrenciYonetim ogrenciYonetim= new OgrenciYonetim();
    
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
    public void transkriptYazdir(Ogrenci ogrenci,int idRequest) {  //SADECE ID
        OgrenciYonetim oy= new OgrenciYonetim();
        ArrayList<Ders> tkList = new ArrayList<Ders>();
        tkList = transkpritHazirla(ogrenci.getIdNo());
        ArrayList<Ogrenci> oList = new ArrayList<Ogrenci>();
        oList = ogrenciYonetim.listele(ogrenci.getIdNo());
        String link = link = "C:\\Users\\seyma\\OneDrive\\Belgeler\\NetBeansProjects\\SAM\\Belgeler\\"+ogrenci.getIdNo()+"-Transkript.pdf";
        Document document = new Document();
        int i=0;
        String basariNotu = null;
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(link));
            
            document.open();
            document.add(new Paragraph("------------------------------------TRANSKRIPT------------------------------------"));
            document.add(new Paragraph("Ogrenci Okul Numarası: "+oList.get(0).getIdNo()));
            document.add(new Paragraph("Ogrenci Adı Soyadı: "+oList.get(0).getNameSurname()));
            document.add(new Paragraph("Ogrenci TC Kimlik: "+oList.get(0).getTcNo()));
            document.add(new Paragraph(" "));
            if (tkList != null){
                for (Ders ders : tkList){
                document.add(new Paragraph("Ders Kodu:"+tkList.get(i).getIdNo()+" Ders Adı: "+tkList.get(i).getLectureName()));
                basariNotu = tkList.get(i).getGrade();
                if(tkList.get(i).getGrade() == null)
                    basariNotu = " ";
                document.add(new Paragraph("Yariyil Notu: "+tkList.get(i).getMidterm()+" Final: "+tkList.get(i).getFinali()+" Ortalama: "+tkList.get(i).getMean()+" Basari Notu: "+basariNotu));
                i++;
                }
            }
            document.add(new Paragraph("GANO: "+oList.get(0).getGANO()));
            document.close();
            writer.close();
            belgeLink(link,idRequest);
        }catch (Exception e){
            e.printStackTrace();
        }  
    }
    
    @Override
    public void ganoHesapla(int idStudent) {
        super.ganoHesapla(idStudent); 
    }

    @Override
    public ArrayList<Ders> transkpritHazirla(int idStudent) {
        return super.transkpritHazirla(idStudent); 
    }
    

    @Override
    public void ogrenciBelgesiYazdir(Ogrenci ogrenci,int idRequest) {
        
        String link = link = "C:\\Users\\seyma\\OneDrive\\Belgeler\\NetBeansProjects\\SAM\\Belgeler\\"+ogrenci.getIdNo()+"-OgrenciBelgesi.pdf";
        
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        Document document = new Document();
        String sql= "SELECT s.idStudent,s.nameSurname,s.tcNo,s.idFaculty,f.FacultyName,f.Department,s.class,s.semester,s.GANO"
                + " FROM schoolm.student as s, schoolm.faculty as f where f.idFaculty = s.idFaculty and s.idStudent = "+ogrenci.getIdNo()+";";
        
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(link));
            document.open();
            document.add(new Paragraph("-------------------------------------OGRENCI BELGESI-------------------------------------"));
            document.add(new Paragraph(" "));
            
            
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int idStudent = rs.getInt("idStudent");
                int idFaculty = rs.getInt("idFaculty");
                String tcNo = rs.getString("tcNo");
                String nameSurname = rs.getString("nameSurname");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                int sinif = rs.getInt("class");
                int semester = rs.getInt("semester");
                float GANO = rs.getFloat("GANO");
                
                document.add(new Paragraph("Ogrenci Okul Numarası: "+idStudent));
                document.add(new Paragraph("Ogrenci Adı Soyadı: "+nameSurname));
                document.add(new Paragraph("Ogrenci TC Kimlik: "+tcNo));
                
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Sınıf: "+sinif));
                document.add(new Paragraph("Donem: "+semester));
                document.add(new Paragraph("GANO: "+GANO));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Fakulte Bilgisi"));
                document.add(new Paragraph("Fakulte: "+facultyName));
                document.add(new Paragraph("Bolum: "+department));
                document.close();
                writer.close();
            }
            belgeLink(link,idRequest);
            
        }catch (Exception e){
            e.printStackTrace();
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
    public void StajZorunlulugu(int idStudent,int idRequest){
        String link = link = "C:\\Users\\seyma\\OneDrive\\Belgeler\\NetBeansProjects\\SAM\\Belgeler\\"+idStudent+"-StajZorunluluk.pdf";
        Document document = new Document();
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql = "Select s.idStudent, f.idFaculty, f.FacultyName, f.Department from schoolm.student as s, schoolm.faculty as f where s.idFaculty = f.idFaculty and s.idStudent ="+idStudent+";";
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(link));
            document.open();
            document.add(new Paragraph("--------------------------------STAJ ZORUNLULUK BELGESI--------------------------------"));
            document.add(new Paragraph(" "));
            
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                idStudent = rs.getInt("idStudent");
                int idFaculty = rs.getInt("idFaculty");
                String facultyName = rs.getString("FacultyName");
                String department = rs.getString("Department");
                
                document.add(new Paragraph("Ogrenci Okul Numarası: "+idStudent));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Fakulte Kodu: "+idFaculty));
                document.add(new Paragraph("Fakulte: "+facultyName));
                document.add(new Paragraph("Bolum: "+department));
                document.add(new Paragraph(" "));
                
                if(idFaculty == 201){
                    document.add(new Paragraph("20 ve 40 is gunu staj zorunlulugu bulunmaktadir."));
                } 
                else if (idFaculty == 200){
                    document.add(new Paragraph("36 ve 36, toplam 72 is gunu staj zorunlulugu bulunmaktadir."));
                }
                else{
                    document.add(new Paragraph("Saj zorunlulugu bulunmamaktadır."));
                }
                document.close();
                writer.close();
                belgeLink(link,idRequest);
            }
        }catch (Exception e){
            e.printStackTrace();
        }    
        
    }
    
    @Override
    public void DisiplinSucuSorgula(int idStudent, int idRequest){
        String link = "C:\\Users\\seyma\\OneDrive\\Belgeler\\NetBeansProjects\\SAM\\Belgeler\\"+idStudent+"-DisiplinBelgesi.pdf";
        Document document = new Document();
        
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql = "Select * from schoolm.discipline where idStudent ="+idStudent+";";
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(link));
            document.open();
            document.add(new Paragraph("--------------------------------DISIPLIN BELGESI--------------------------------"));
            document.add(new Paragraph(" "));
            
            
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                idStudent = rs.getInt("idStudent");
                String discipline = rs.getString("discipline");
                document.add(new Paragraph(idStudent+ " No'lu ogrencinin disiplin sucu: "));
                document.add(new Paragraph(discipline));
            }
        document.close();
        writer.close();
        
        belgeLink(link,idRequest);
        
        }catch (Exception e){
            e.printStackTrace();
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
    
    public void belgeLink(String link,int idRequest){
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
      

