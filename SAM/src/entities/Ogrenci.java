
package entities;

public class Ogrenci extends Birimler{
    private int idFaculty;
    
    private int sınıf;
    private int semester;
    private float GANO;
    
    private int idLectures;
    
    private String documentType;
    private String instutation;
    private String content;
    private int approve;
    private String link;
    private String date;
    private int idRequest;
    private String discipline;
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getInstutation() {
        return instutation;
    }

    public void setInstutation(String instutation) {
        this.instutation = instutation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getApprove() {
        return approve;
    }

    public void setApprove(int approve) {
        this.approve = approve;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
   
    public int getIdLectures() {
        return idLectures;
    }

    public void setIdLectures(int idLectures) {
        this.idLectures = idLectures;
    }
    

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getGANO() {
        return GANO;
    }

    public void setGANO(float GANO) {
        this.GANO = GANO;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    
    
    public Ogrenci(int idNo, String nameSurname, String tcNo, int idFaculty, int sınıf, int semester, float GANO, String password) {
        super(nameSurname, idNo, tcNo, password);
        this.idFaculty = idFaculty;
        this.sınıf = sınıf;
        this.semester = semester;
        this.GANO = GANO;
    }

    public Ogrenci(int idNo){
        super(idNo);
    }
    
    public Ogrenci(int idNo, int idLectures){
        super(idNo);
        this.idLectures = idLectures;
    }
    
    ////Belge Talep
    public Ogrenci(int idRequest, int idNo,String documentType, String instutation, String content, int approve,String link,String date) {
        super(idNo);
        this.idRequest = idRequest;
        this.documentType = documentType;
        this.instutation = instutation;
        this.content = content;
        this.approve = approve;
        this.link = link;
        this.date = date;
    }
    
    //Disiplin Sucu Giris
    public Ogrenci(int idNo,String discipline) {
        super(idNo);
        this.discipline = discipline;
    }
    
    
}
