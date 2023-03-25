public class Student extends Human{
    private String university;
    private String faculty;
    private String special;

    public Student(String surname, String name, String midname, int age, Gender gender, String university, String faculty, String special){
        super(surname, name, midname, age, gender);
        this.university = university;
        this.faculty = faculty;
        this.special = special;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecial() {
        return special;
    }
    public void setSpecial(String special) {
        this.special = special;
    }

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
}
