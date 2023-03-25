public class Human {
    String surname;
    String name;
    String midname;
    int age;

    public Human(String surname, String name,String midname,int age){
        this.surname=surname;
        this.name=name;
        this.midname=midname;
        this.age=age;
    }

    public Human(Human hum) {
    }

    public String getName() {
        return this.name;}
    public String getSurname() {
        return this.surname;}
    public String getMidname() {
        return this.midname;}
    public int getAge() {
        return this.age;}

    public void setName(String name) {
        this.name=name;}
    public void setSurnameName(String surname) {
        this.surname=surname;}
    public void setMidname(String midname) {
        this.midname=midname;}
    public void setAge(int age) {
        this.age=age;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human that = (Human) o;

        if (getAge() != that.getAge()) return false;
        if (!getName().equals(that.getName())) return false;
        if (!getSurname().equals(that.getSurname())) return false;
        return getMidname().equals(that.getMidname());
    }

    @Override
    public String toString() {
        return String.format("[%s %s %s %dг.]", surname,name, midname, age);

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 33 * result + getSurname().hashCode();
        result = 33 * result + getMidname().hashCode();
        result = 33 * result + getAge();
        return result;
    }
}
