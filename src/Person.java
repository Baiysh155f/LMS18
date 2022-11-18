 public class Person implements Leaving {
    private String name;
    private int rent;

    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name, int rent, String address) {
        this.name = name;
        this.rent = rent;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRent() {
        System.out.print(" Rent :");
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public String getAddreses() {
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rent=" + rent +
                ", address='" + address + '\'' +
                '}';
    }
}
