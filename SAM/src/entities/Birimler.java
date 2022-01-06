
package entities;

public abstract class Birimler {
    private String nameSurname;
    private int idNo;
    private String tcNo;
    private String password;

    public Birimler() {
        
    }
    
    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
    
    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Birimler(String nameSurname, int idNo, String tcNo, String password) {
        this.nameSurname = nameSurname;
        this.idNo = idNo;
        this.tcNo = tcNo;
        this.password = password;
    }

    public Birimler(int idNo) {
        this.idNo = idNo;
    }
    
    
}
