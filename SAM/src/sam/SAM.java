
package sam;

import Database.Database;
import business.MemurYonetim;
import business.OgrenciYonetim;
import business.OgretmenYonetim;
import business.Yonetim;
import entities.Ders;
import entities.Duyuru;
import entities.Memur;
import entities.Ogrenci;
import entities.Ogretmen;

public class SAM {

    public static void main(String[] args){
        Database db = new Database();
        Yonetim y = new Yonetim();
        MemurYonetim memur = new MemurYonetim();
        OgrenciYonetim ogrenci = new OgrenciYonetim();
        OgretmenYonetim ogretmen = new OgretmenYonetim();
        Memur m1 = new Memur(401, "Naci Buyuk", "12345698741", "123naci", "Bilgisayar Muhendisligi Bolum Sekreteri");
        Memur m2 = new Memur(401, "Aslı Gun", "12345698741", "123naci", "Bilgisayar Muhendisligi Bolum Sekreteri");
        Ogrenci o1 = new Ogrenci(604,"Serenay Sari","11111144778",205,3,5,(float)2.87,"1234");
        //Ogretmen ogrt1 = new Ogretmen(703, 201, "Ibrahim Tok", "12365478913", "ibo123", "Sosyoloji");
        //Ogrenci o2 = new Ogrenci(601);
        //ogrenci.ekle(o1);
        //ogrenci.kaldir("59111264852");
        //memur.ekle(m1);
        //ogrenci.ekle(o1);
        //ogretmen.ekle(ogrt1);
        //y.kaldir("59751264852");
        //memur.ogrenciBelgesiYazdir(o2);
        //memur.transkriptYazdir(o2);
        //memur.girisYap("12345698741", "1234naci");
        Ders d1 = new Ders(303,"Turk Dili-1","2022-01-01",2,2,1,702);
        
        Ders d2 = new Ders(503,601,302);
        //memur.dersEkle(d1);
        Duyuru du1 = new Duyuru(101,"Ekle - Çıkar","Ekleme Cikarma ilk gün","2022-01-01");
        //memur.duyuruYayinla(du1);
        //memur.StajZorunlulugu(601);
        //memur.DisiplinSucuSorgula(602);
        //y.duyurulariGoruntule();
        //ogrenci.kayitDurumuSogrula(601);
        //ogrenci.dersSec(d2);
        //y.dersleriGoruntule(5);
        Ders d3 = new Ders(306,"Turk Dili-2","2022-01-02",2,2,6);
        Ders not = new Ders(55,30);
        Ogrenci o3 = new Ogrenci(600,300);
        Ogretmen ogrt2 = new Ogretmen(700);
        Ogrenci o4 = new Ogrenci(601);
        //ogrenci.fakultesi(601);
        //ogretmen.dersOlustur(d3, ogrt2);
        //ogretmen.dersiAlanOgrenciler(700, 300);
        //ogretmen.dersNotuGir(not, o3);
        //ogretmen.fakulteIsımler();
        //ogretmen.bolumIsımleri("Teknoloji Fakultesi");
        //memur.kaldir("12365479632");
        //System.out.println(ogrenci.dersleriGoruntule(201).get(0).getIdNo());
        //System.out.println(ogrenci.ogrenciNo("1111111145"));
        //System.out.println(ogrenci.kayitDurumuSogrula(601));
        //System.out.println(ogrenci.belgeTalepleriGoruntule(601).get(0).getDocumentType());
        //System.out.println(ogretmen.dersinOrtalamasi(300).get(0).getMean());
        //System.out.println(ogretmen.ogrenciGetir(601, 300).get(0).getStudentNameSurname());
        //memur.transkriptYazdir(o4);
        //memur.ogrenciBelgesiYazdir(o4);
        memur.DisiplinSucuSorgula(601,900);
    }
    
}
