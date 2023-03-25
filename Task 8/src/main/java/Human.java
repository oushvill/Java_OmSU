public class Human {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String
    toString() {
        return "Человек : [ ФИО: "+surname+name+") ]";
    }
}