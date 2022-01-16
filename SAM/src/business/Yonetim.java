
package business;

import Database.Database;
import entities.Birimler;
import entities.Ders;
import entities.Duyuru;
import entities.Ogrenci;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Yonetim extends Birimler{
    Database db = new Database();
    private Connection con;
    
    public void ekle(){}

    public void kaldir(String tcNo) { }

    public void guncelle() {}

    public ArrayList listele() { throw new UnsupportedOperationException();}
        
    public boolean girisYap(String tcNo,String password){
        return false;
    }
    
    public ArrayList<Duyuru> duyurulariGoruntule(){
        ArrayList<Duyuru> duyuruList = new ArrayList<Duyuru>();
        ArrayList a = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.activity;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idActivity = rs.getInt("idActivity");
                String activityName = rs.getString("activityName");
                String content = rs.getString("content");
                String activityDate = rs.getString("activityDate");
                duyuruList.add(new Duyuru(idActivity, activityName, content, activityDate));
            }
            return duyuruList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Ders> ogrencininDersleriGoruntule(int idStudent){
        ArrayList<Ders> ogrenciDersList = new ArrayList<Ders>();
        ArrayList a = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.section as s, schoolm.lectures as l where l.idLectures = s.idLectures and s.idStudent = "+idStudent+";";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idSection = rs.getInt("idSection");
                idStudent = rs.getInt("idStudent");
                int idNo = rs.getInt("idLectures");
                String lectureName = rs.getString("lectureName");
                int midterm = rs.getInt("midterm");
                int finali = rs.getInt("final");
                float mean = rs.getFloat("mean");
                String grade = rs.getString("grade");
                ogrenciDersList.add(new Ders(idSection,idNo,lectureName,midterm,finali, mean,grade));
            }
            return ogrenciDersList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Ders> dersleriGoruntule(int semester){
        ArrayList<Ders> dersList = new ArrayList<Ders>();
        ArrayList a = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT l.idLectures, l.lectureName, l.Date,l.ACTS, l.credit,l.Semester, t.nameSurname, t.Department FROM schoolm.lectures as l, schoolm.teacher as t where t.idTeacher = l.idTeacher and Semester ="+semester;
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idNo = rs.getInt("idLectures");
                String lectureName = rs.getString("lectureName");
                String nameSurname = rs.getString("nameSurname");
                String date = rs.getString("Date");
                int ACTS = rs.getInt("ACTS");
                int credit = rs.getInt("credit");
                semester = rs.getInt("Semester");
                String department = rs.getString("Department");
                System.out.println("Ders id: "+idNo+" Ders adi: "+lectureName+" Ogretmen: "+nameSurname+" Ogretmen departmani: "+ department+ " Date: "+date+" ACTS: "+ACTS+" Kredi: "+credit+ " Dönem: "+semester);
                dersList.add(new Ders(idNo, lectureName, date, ACTS, credit, semester, nameSurname,department));
            }
            return dersList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Ogrenci> belgeIstekleriGoruntule(){
        ArrayList<Ogrenci> belgeList = new ArrayList<Ogrenci>();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.request";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                int idNo = rs.getInt("idStudent");
                int idRequest = rs.getInt("idRequest");
                String documentType = rs.getString("documentType");
                String instutation = rs.getString("instutation");
                String content = rs.getString("content");
                int approve = rs.getInt("approve");
                String link = rs.getString("link");
                String date = rs.getString("date");
                belgeList.add(new Ogrenci(idRequest,idNo,documentType,instutation,content,approve,link,date));
            }
            return belgeList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    
    //Duyuru id
    public int idAtama(){
    ArrayList idList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idActivity FROM schoolm.activity;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idActivity");
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
    
    public int idSectionAta(){
        int idSection = 0;
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT idSection FROM schoolm.section;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idNo = rs.getInt("idSection");
                idSection =idNo;
            }
            idSection++;
            return idSection;
        }catch (SQLException ex){
            System.out.println(ex);
                return 0;
        }
    }
    
    public ArrayList<Ders> fakulte(int idNo){  throw new UnsupportedOperationException(); }
    
    
    public ArrayList<Ders> transkpritHazirla(int idStudent){
        ArrayList<Ders> tkList = new ArrayList<Ders>(); 
        String sorgu = "SELECT * FROM schoolm.section as s, schoolm.lectures as l , schoolm.student as st where l.idLectures = s.idLectures and s.idStudent = st.idStudent and s.idStudent =" +idStudent+";";
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);
            
            while (rs.next()){
                int idNo = rs.getInt("idLectures");
                String lectureName = rs.getString("lectureName");
                String nameSurname = rs.getString("nameSurname");
                int midterm = rs.getInt("midterm");
                int finali = rs.getInt("final");
                float mean = rs.getFloat("mean");
                String grade = rs.getString("grade");
                float GANO = rs.getFloat("GANO");
                int credit = rs.getInt("credit");
                tkList.add(new Ders(nameSurname, lectureName, credit, midterm, finali, mean, grade, idNo));
            }
            return tkList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    
    }
    
    public void ganoHesapla(int idStudent){
        PreparedStatement preparedStatement = null;
        float gano,notu, ortalama, puan = 0;
        String harfliNot = null;
        int i = 0, credit=0, toplamKredi = 0;        
        ArrayList<Ders> notlar = new ArrayList<Ders>(); 
        notlar = transkpritHazirla(idStudent);
        if (notlar != null){
            for(Ders ders : notlar){
                harfliNot = notlar.get(i).getGrade();
                notu = harfliNotDonustur(harfliNot);
                if (notu != -2){
                credit = notlar.get(i).getCredit();
                puan =puan + (notu*credit);
                toplamKredi += credit;
                System.out.println("Harf: "+harfliNot + " notu: "+ notu + " kredi : "+ credit + " puan: "+ puan);
                i++;}
            }
        }
        gano = puan/toplamKredi;
        System.out.println("GANO: "+gano);
        
        if(con==null){
            System.out.println("Belge hazirlaniyor..");
            con = db.BaglantiKontrol();
        }
        String sql2 = "Update schoolm.student set GANO = ? where idStudent = ?";
        try{
            preparedStatement = con.prepareStatement(sql2);
            preparedStatement.setFloat(1, gano);
            preparedStatement.setInt(2, idStudent);
            preparedStatement.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }     
    
    public float harfliNotDonustur(String harf){
        if (harf !=null){
            if(harf.equals("AA")){    return 4;}
            else if(harf.equals("BA")){     return (float) 3.5;}
            else if(harf.equals("BB")){  return 3;}
            else if(harf.equals("CB")){  return (float) 2.5;}
            else if(harf.equals("CC")){  return 2;}
            else if(harf.equals("CD")){  return (float) 1.5;}
            else if(harf.equals("DD")){  return 1;}
            else if(harf.equals("FF")){  return 0;}
            else if(harf.equals("FD")){  return -1;}
            else {  return -2;}}
        else{ 
            return -2;}
    }
   
}
