import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {
    private String cadastralNumber, address;
    private Person headofHouse;
    private List<Flat> apartments;

    House() {
        cadastralNumber = "";
        address = "";
        headofHouse = new Person();
        apartments = new ArrayList<>();
    }

    public House(String cadastralNumber, String address, Person headofHouse, List<Flat> apartments) {
        this.cadastralNumber = cadastralNumber;
        this.address = address;
        this.headofHouse = headofHouse;
        this.apartments = apartments;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }
    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Person getHeadofHouse() {
        return headofHouse;
    }
    public void setHeadofHouse(Person headofHouse) {
        this.headofHouse = headofHouse;
    }

    public List<Flat> getApartments() {
        return apartments;
    }
    public void setApartments(List<Flat> apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return cadastralNumber.equals(house.cadastralNumber) && address.equals(house.address) && headofHouse.equals(house.headofHouse) && apartments.equals(house.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastralNumber, address, headofHouse, apartments);
    }

    @Override
    public String toString() {
        return "Дом [" +
                "Кадастровый номер: " + cadastralNumber + "."+
                "Адрес дома: " + address + "." +
                "Гл. дома: " + headofHouse +"."+
                "Квартира: " + apartments +"]";
    }
}