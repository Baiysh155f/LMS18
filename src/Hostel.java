public class Hostel extends Person{
    public Hostel(String name, int rent, String address) {
        super(name, rent, address);
    }

    @Override
    public String getAddreses() {
        return getName()+" Leaving in "+getAddress();
    }
}
