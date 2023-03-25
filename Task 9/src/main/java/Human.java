import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String midname;
    private int age;
    private Gender gender;

    public Human(String surname, String name, String midname, int age, Gender gender){
        this.surname = surname;
        this.name = name;
        this.midname = midname;
        this.age = age;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }
    public void setMidname(String midname) {
        this.midname = midname;
    }

    public int getAge(){ return age;}
    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(midname, human.midname) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, midname, age, gender);
    }

    @Override
    public String
    toString() {
        return "[ ФИО: "+surname+name+midname+". Возраст: "+age+". Пол: "+gender+"]";
    }
}
