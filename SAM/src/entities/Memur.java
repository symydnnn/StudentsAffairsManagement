/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Memur extends Birimler {
    private String employment;
    

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public Memur(int idNo, String nameSurname, String tcNo, String password, String employment) {
        super(nameSurname, idNo, tcNo, password);
        this.employment = employment;
    }

    public Memur(int idNo) {
        super(idNo);
    }

    
    
    
    
}
