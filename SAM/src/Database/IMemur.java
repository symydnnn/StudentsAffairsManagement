
package Database;

import entities.Ders;
import entities.Duyuru;
import entities.Memur;
import entities.Ogrenci;
import java.util.ArrayList;

public interface IMemur <T>{
    void ekle(Memur memur);
    void kaldir(int idNo);
    void guncelle(Memur memur);
    ArrayList<T> listele();
    void duyuruYayinla(Duyuru duyuru);
    void duyuruSil(int idActivity);
    void duyuruGuncelle(Duyuru duyuru); 
    void ogrenciBelgesiYazdir(Ogrenci ogrenci,int idRequest);
    void transkriptYazdir(Ogrenci ogrenci,int idRequest);
    void dersEkle(Ders ders);
    void StajZorunlulugu(int idStudent,int idRequest);
    void DisiplinSucuSorgula(int idStudent,int idRequest);
}
