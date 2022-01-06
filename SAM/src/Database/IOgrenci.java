
package Database;

import entities.Ders;
import entities.Ogrenci;
import java.util.ArrayList;

public interface IOgrenci <T>{
    void ekle(Ogrenci ogrenci);
    void kaldir(int idNo);
    void guncelle(Ogrenci ogrenci);
    ArrayList<T> listele();
    void kayitDondur(int idStudent);
    void kayitAktiflestir(int idStudent);
    int kayitDurumuSogrula(int idStudent);
    void dersSec(Ders ders);
}
