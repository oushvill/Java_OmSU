public class Person extends Human{
    private String name;
    private String surname;
    public Person(String name, String surname){
        super(name, surname);
    }


    @Override
    public String toString() {
            return "Человек : [ ФИО: "+surname+name+") ]";
    }
}