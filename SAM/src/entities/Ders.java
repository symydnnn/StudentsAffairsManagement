/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Ders extends Birimler{
    
    private String lectureName;
    private String date;
    private int ACTS;
    private int credit;
    private int Semester;
    private int idTeacher;
    
    private int idSection;
    private int idStudent;
    private int idFaculty;
    private int midterm;
    private int finali;
    private float mean;
    private String grade;
    private String Department;
    private String ogretmen;
    private String facultyName;
    private String studentNameSurname;
    
    

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(String ogretmen) {
        this.ogretmen = ogretmen;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    
    
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    

    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getFinali() {
        return finali;
    }

    public void setFinali(int finali) {
        this.finali = finali;
    }

    public float getMean() {
        return mean;
    }

    public void setMean(float mean) {
        this.mean = mean;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getACTS() {
        return ACTS;
    }

    public void setACTS(int ACTS) {
        this.ACTS = ACTS;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getStudentNameSurname() {
        return studentNameSurname;
    }

    public void setStudentNameSurname(String studentNameSurname) {
        this.studentNameSurname = studentNameSurname;
    }
    

    public Ders(int idNo) {
        super(idNo);
    }

    public Ders(int idNo, String lectureName, String date, int ACTS, int credit, int Semester, int idTeacher) {
        super(idNo);
        this.lectureName = lectureName;
        this.date = date;
        this.ACTS = ACTS;
        this.credit = credit;
        this.Semester = Semester;
        this.idTeacher = idTeacher;
    }

    //Ogrenci derslerini goruntule
    public Ders(int idSection, int idNo,String lectureName, int midterm, int finali, float mean, String grade) {
        super(idNo);
        this.idSection = idSection;
        //this.idStudent = idStudent;
        this.lectureName = lectureName;
        this.midterm = midterm;
        this.finali = finali;
        this.mean = mean;
        this.grade = grade;
    }
    
    //Ders Sec
    public Ders(int idSection, int idStudent, int idNo) {
        super(idNo);
        this.idSection = idSection; ///constructor arttır
        this.idStudent = idStudent;
    }

    //Dersleri goruntule
    public Ders(int idNo, String lectureName, String date, int ACTS, int credit, int Semester, String nameSurname, String Department) {
        super(idNo);
        this.lectureName = lectureName;
        this.date = date;
        this.ACTS = ACTS;
        this.credit = credit;
        this.Semester = Semester;
    }
    
    //Ders olustur
    public Ders(int idNo,String lectureName, String date,int ACTS, int credit, int Semester) {
        super(idNo);
        this.lectureName = lectureName;
        this.date = date;
        this.ACTS = ACTS;
        this.credit = credit;
        this.Semester = Semester;
    }
    
    //Sınıf Listesi
    public Ders(int idNo, String lectureName,int idTeacher,int idStudent,String studentNameSurname,int midterm, int finali, float mean, String grade){
        super(idNo);
        this.lectureName = lectureName;
        this.idTeacher = idTeacher;
        this.idStudent = idStudent;
        this.midterm = midterm;
        this.finali = finali;
        this.mean = mean;
        this.grade = grade;
        this.studentNameSurname = studentNameSurname;
        
    }
    
    /// Ders notu gir
    public Ders(int midterm, int finali){
        this.midterm = midterm;
        this.finali = finali;
    }
    
    //Secilebilecek Dersler
    public Ders(int idNo,String lectureName,String date,int ACTS,int credit,int semester,String ogretmen,String facultyName,String department,int idFaculty){
        super(idNo);
        this.lectureName = lectureName;
        this.date = date;
        this.ACTS = ACTS;
        this.credit = credit;
        this.Semester = semester;
        this.ogretmen = ogretmen;
        this.facultyName = facultyName;
        this.Department = department;
        this.idFaculty = idFaculty;
    }
    
    //Fakülte tespiti
    public Ders(int idFaculty, String facultyName, String department){
        this.idFaculty = idFaculty;
        this.facultyName = facultyName;
        this.Department = department;
    }
    
    //Ders ortalaması
    public Ders(int midterm, int finali, float mean) {
        this.midterm = midterm;
        this.finali = finali;
        this.mean = mean;
    }
    
    
    /// Transkript hazırlama
    public Ders(String studentNameSurname,String lectureName, int credit, int midterm, int finali, float mean, String grade, int idNo) {
        super(idNo);
        this.lectureName = lectureName;
        this.credit = credit;
        this.midterm = midterm;
        this.finali = finali;
        this.mean = mean;
        this.grade = grade;
        this.studentNameSurname = studentNameSurname;
    }
}
