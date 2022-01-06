
package Database;

import entities.Ders;
import entities.Ogrenci;
import entities.Ogretmen;
import java.awt.List;
import java.util.ArrayList;

public interface IOgretmen <T>{
    void ekle(Ogretmen ogretmen);
    void kaldir(int idNo);
    void guncelle(Ogretmen ogretmen);
    ArrayList<T> listele();
    void dersOlustur(Ders ders,int idTeacher,int idFaculty);
    ArrayList<Ders> dersiAlanOgrenciler(int idLectures);
    void dersNotuGir(Ders ders, Ogrenci ogrenci);
    ArrayList bolumID(String facultyName, String Department);
}
