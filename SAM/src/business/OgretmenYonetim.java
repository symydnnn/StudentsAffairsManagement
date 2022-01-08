
package business;

import Database.Database;
import entities.Ogretmen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Database.IOgretmen;
import entities.Ders;
import entities.Ogrenci;
import java.awt.List;

public class OgretmenYonetim extends Yonetim implements IOgretmen{
    Database db = new Database();
    private Connection con;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public OgretmenYonetim() {}

    @Override
    public ArrayList<Ogretmen> listele(){
        ArrayList<Ogretmen> ogrtmList = new ArrayList<Ogretmen>();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT t.idTeacher,t.idFaculty,f.FacultyName,t.nameSurname,t.tcNo,t.password,t.Department "
                    + "FROM schoolm.teacher t,schoolm.faculty f WHERE t.idFaculty =f.idFaculty ;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idNo = rs.getInt("idTeacher");
                int idFaculty = rs.getInt("idFaculty");
                String FacultyName = rs.getString("FacultyName");
                String nameSurname = rs.getString("nameSurname");
                String password = rs.getString("password");
                String Department = rs.getString("Department");
                String tcNo = rs.getString("tcNo");
                ogrtmList.add(new Ogretmen(idNo, idFaculty, FacultyName, nameSurname, tcNo,password, Department));
            }
            return ogrtmList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    public ArrayList<Ogretmen> listele(int idNo){
        ArrayList<Ogretmen> ogrtList = new ArrayList<Ogretmen>();
        ArrayList<Ogretmen> ogrt = new ArrayList<Ogretmen>();
        ogrtList = listele();
        if (ogrtList != null ) {
            for (Ogretmen ogr : ogrtList) {
                    if(ogr.getIdNo()==idNo){
                        ogrt.add(new Ogretmen(ogr.getIdNo(), ogr.getIdFaculty(), ogr.getNameSurname(), ogr.getTcNo(), ogr.getPassword(),ogr.getDepartment()));
                    }
            }
        }
        return ogrt;
    }
    
    public int ogretmenNo(String tcNo){
        int idNo = 0;
        ArrayList<Ogretmen> ogrtList = new ArrayList<Ogretmen>();
        ogrtList = listele();
        if (ogrtList != null ) {
            for (Ogretmen ogrt : ogrtList) {
                    if(ogrt.getTcNo() == null ? tcNo == null : ogrt.getTcNo().equals(tcNo)){
                        idNo = ogrt.getIdNo();
                    }
            }
        }
        return idNo;
    }


    @Override
    public void guncelle(Ogretmen ogretmen) {
        if(con==null){
            System.out.println("Guncelleniyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Update schoolm.teacher set idFaculty = ? , nameSurname = ? , tcNo = ?, password = ?, Department = ? where idTeacher = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogretmen.getIdFaculty());
            preparedStatement.setString(2, ogretmen.getNameSurname());
            preparedStatement.setString(3, ogretmen.getTcNo());
            preparedStatement.setString(4, ogretmen.getPassword());
            preparedStatement.setString(5, ogretmen.getDepartment());
            preparedStatement.setInt(6, ogretmen.getIdNo());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void kaldir(int idNo) {
        if(con==null){
            System.out.println("Kaldirmak icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Delete from schoolm.teacher where idTeacher = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, idNo);
            preparedStatement.executeUpdate();
            System.out.println("Ogretmen silindi");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ekle(Ogretmen ogretmen) {
        if(con==null){
            System.out.println("Ekleme icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.teacher (idTeacher,idFaculty,nameSurname,tcNo,password,Department) VALUES(?,?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogretmen.getIdNo());
            preparedStatement.setInt(2, ogretmen.getIdFaculty());
            preparedStatement.setString(3, ogretmen.getNameSurname());
            preparedStatement.setString(4, ogretmen.getTcNo());
            preparedStatement.setString(5, ogretmen.getPassword());
            preparedStatement.setString(6, ogretmen.getDepartment());
            preparedStatement.executeUpdate();
            System.out.println("Ogretmen Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean girisYap(String tcNo, String password) {
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.teacher where tcNo = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,tcNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean girisYap(int idNo, String password) {
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu =  "SELECT * FROM schoolm.teacher where idTeacher = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,idNo);
            preparedStatement.setString(2,password);
            ResultSet rs =  preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    public ArrayList bolumID(String facultyName, String Department){
        ArrayList bolumList = new ArrayList();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
        Statement stmt=con.createStatement();
        String sorgu = "SELECT * FROM schoolm.faculty WHERE FacultyName = '"+facultyName+"' AND Department = '"+Department+"';";
        ResultSet rs = stmt.executeQuery(sorgu);
        while (rs.next()){
                int idNo = rs.getInt("idFaculty");
                Department = rs.getString("Department");
                bolumList.add(idNo);
            }
            return bolumList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    
    
    @Override
    public void dersOlustur(Ders ders,int idTeacher,int idFaculty){
        if(con==null){
            System.out.println("Ekleme icin baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        String sorgu = "Insert Into schoolm.lectures (idLectures,lectureName,Date,ACTS,credit,Semester,idTeacher) VALUES(?,?,?,?,?,?,?);";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ders.getIdNo());
            preparedStatement.setString(2, ders.getLectureName());
            preparedStatement.setString(3, ders.getDate());
            preparedStatement.setInt(4, ders.getACTS());
            preparedStatement.setInt(5, ders.getCredit());
            preparedStatement.setInt(6, ders.getSemester());
            preparedStatement.setInt(7, idTeacher);
            preparedStatement.executeUpdate();
            
            String sorgu2 = "Insert Into schoolm.lecturedepartment (idLectures,idFaculty) VALUES(?,?);";
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, ders.getIdNo());
            preparedStatement.setInt(2, idFaculty);
            preparedStatement.executeUpdate();
            
            System.out.println("Ders Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<Ders> dersiAlanOgrenciler(int idLectures){
        ArrayList<Ders> sinifList = new ArrayList<Ders>();
        if(con==null){
            System.out.println("Baglaniliyor..");
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM schoolm.lectures as l, schoolm.section as se, schoolm.student as st "
                    + "WHERE se.idStudent = st.idStudent AND se.idLectures = l.idLectures and l.idLectures = "+idLectures+";";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                int idStudent = rs.getInt("idStudent");
                int idTeacher = rs.getInt("idTeacher");
                String lectureName = rs.getString("lectureName");
                String studentNameSurname = rs.getString("st.nameSurname");
                int vize = rs.getInt("midterm");
                int finali = rs.getInt("final");
                float mean = rs.getFloat("mean");
                String grade = rs.getString("grade");
                sinifList.add(new Ders(idLectures,lectureName,idTeacher,idStudent,studentNameSurname,vize,finali,mean,grade));
                
            }
            return sinifList;
        }catch (SQLException ex){
            System.out.println(ex);
                return null;
        }
    }
    
    
    public ArrayList<Ders> ogrenciGetir(int idStudent,int idLectures){
        ArrayList<Ders> sinifList = dersiAlanOgrenciler(idLectures);
        ArrayList<Ders> o = new ArrayList<Ders>();
        int i = 0;
        if (sinifList != null ) {
            for (Ders ders : sinifList) {
                if(idStudent == sinifList.get(i).getIdStudent()){
                    o.add(sinifList.get(i));
                }
                i++;
            }
        }
        return o;
    }
    
    @Override
    public void dersNotuGir(Ders ders, Ogrenci ogrenci){
        if(con==null){
            con = db.BaglantiKontrol();
        }
        String sorgu = "Update schoolm.section set midterm = ?, final = ?, mean = ?, grade = ? where idStudent = ? and idLectures = ?";
        
        try {
            int yariyil = ders.getMidterm();
            int finali = ders.getFinali();
            String basari;
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, yariyil);
            preparedStatement.setInt(2, finali);
            float ortalama = (yariyil+finali)/2;
            preparedStatement.setFloat(3, ortalama);
            if (finali == -1){ basari = "FZ";}
            else if(finali < 35) { basari = "FF";}
            else{
                if(ortalama > 90) { basari = "AA";}
                else if(ortalama > 85) { basari = "BA";}
                else if(ortalama > 80) { basari = "BB";}
                else if(ortalama > 75) { basari = "CB";}
                else if(ortalama > 55) { basari = "CC";}
                else if(ortalama > 45) { basari = "DC";}
                else if(ortalama > 35) { basari = "DD";}
                else { basari = "FF";}
            }
            preparedStatement.setString(4, basari);
            preparedStatement.setInt(5, ogrenci.getIdNo());
            preparedStatement.setInt(6, ogrenci.getIdLectures());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Ders> dersinOrtalamasi(int idLectures){
        if(con==null){con = db.BaglantiKontrol();}
        ArrayList<Ders> sinifList = dersiAlanOgrenciler(idLectures);
        ArrayList<Ders> ortalamalar = new ArrayList<Ders>();
        int i = 0;
        int midtermToplam = 0;
        int finalToplam = 0;
        float ortalamaToplam = 0;
        if (sinifList != null ) {
            for (Ders ders : sinifList) {
                midtermToplam += sinifList.get(i).getMidterm();
                finalToplam += sinifList.get(i).getFinali();
                ortalamaToplam += sinifList.get(i).getMean();
                i++;
            }
        }
        int midtermOrtalama = midtermToplam / sinifList.size();
        int finalOrtalama = finalToplam / sinifList.size();
        float ortlamaOrtalama = ortalamaToplam / sinifList.size();
        ortalamalar.add(new Ders(midtermOrtalama,finalOrtalama,ortlamaOrtalama));
        return ortalamalar;
    }
    
    @Override
    public int idAtama(){
        ArrayList idList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idTeacher FROM schoolm.teacher;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idTeacher");
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
    
    ///Ders için atama
    public int idAtama(int idTeacher){
        ArrayList idList = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sorgu = "SELECT idLectures FROM schoolm.lectures;";
            ResultSet rs = stmt.executeQuery(sorgu);
            while (rs.next()){
                int idNo = rs.getInt("idLectures");
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
    
    @Override
    public ArrayList<Ders> fakulte(int idNo){  ///Ogrenci Fakulte bilgisi
        ArrayList<Ders> fakulteList = new ArrayList<Ders>();
        ArrayList a = new ArrayList();
        if(con==null){
            con = db.BaglantiKontrol();
        }
        try{
            Statement stmt=con.createStatement();
            String sql="SELECT t.idTeacher, t.idFaculty, f.FacultyName, f.Department FROM schoolm.teacher as t, schoolm.faculty as f where t.idFaculty = f.idFaculty and t.idTeacher ="+idNo+";";
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

