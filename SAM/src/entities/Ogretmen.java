
package entities;


public class Ogretmen extends Birimler {
    private int idFaculty;
    private String Department;
    private String FacultyName;
    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String FacultyName) {
        this.FacultyName = FacultyName;
    }
    
    
    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    public Ogretmen(int idNo, int idFaculty, String nameSurname, String tcNo, String password, String Department) {
        super(nameSurname, idNo, tcNo, password);
        this.idFaculty = idFaculty;
        this.Department = Department;
    }

    //Listelerken fakülte adının da görünmesi icin:
    public Ogretmen(int idNo, int idFaculty, String FacultyName, String nameSurname, String tcNo, String password, String Department) {
        super(nameSurname, idNo, tcNo, password);
        this.idFaculty = idFaculty;
        this.Department = Department;
        this.FacultyName = FacultyName;
    }

    public Ogretmen(int idNo) {
        super(idNo);
    }
    
}
