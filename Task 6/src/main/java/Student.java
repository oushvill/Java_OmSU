import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Human
{
    private String faculty;

    public Student(String surname, String name, String midname, int age, String faculty)
    {
        super(surname,name,midname, age);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAllNamesize()
    {
        return getSurname().length() + getName().length() + getMidname().length();
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %dг., Факультет '%s'", surname,name, midname, age,faculty);

    }
}