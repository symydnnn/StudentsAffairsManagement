
package business;

import entities.Ogretmen;
import java.util.ArrayList;

public interface IYonetim <T>{
    void ekle(Ogretmen ogrt);
    void kaldir();
    void guncelle();
    ArrayList<T> listele();
    
    
}
