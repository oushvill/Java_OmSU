import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String name, surname, midname;
    private int day, month, year;

    Person() {
        name = "";
        surname = "";
        midname = "";
        day = 0;
        month = 0;
        year = 0;
    }

    public Person(String surname,String name, String midname, int day, int month, int year) throws Exception {
        if (       surname == null || "".equals(surname)
                || name == null || "".equals(name)
                || midname == null || "".equals(midname)) {
            throw new Exception("Пустые ФИО");
        } else if ((day <= 0 || day > 31)
                || (month <= 0 || month > 12)
                || (year < 0)) {
            throw new Exception("Некорректная дата");
        }
        this.surname = surname;
        this.name = name;
        this.midname = midname;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getMidname() {
        return midname;
    }

    public void setSurname(String surname) throws Exception {
        if (surname == null || "".equals(surname))
            throw new Exception("Пустая фамилия");
        this.surname = surname;
    }
    public void setName(String name) throws Exception {
        if (name == null || "".equals(name)) {
            throw new Exception("Пустое имя");
        }
        this.name = name;
    }
    public void setMidname(String midname) throws Exception {
        if (midname == null || "".equals(midname))
            throw new Exception("Пустое отчество");
        this.midname = midname;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) throws Exception {
        if (day <= 0 || day > 31)
            throw new Exception("Некорректный день");
        this.day = day;
    }
    public void setMonth(int month) throws Exception {
        if (month <= 0 || month > 12)
            throw new Exception("Некорректный месяц");
        this.month = month;
    }
    public void setYear(int year) throws Exception {
        if (year < 0) {
            throw new Exception("Некорректный год");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Человек : [ ФИО: "+surname+name+midname+
                                " ("+day+"."+month+"."+year+") ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return day == person.day && month == person.month && year == person.year && name.equals(person.name) && surname.equals(person.surname) && midname.equals(person.midname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname,name, midname, day, month, year);
    }

}