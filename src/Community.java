public class Community extends Person {

    public Community(){}
    public Community(String name, int rent, String address) {
        super(name, rent, address);
    }

    @Override
    public String getAddreses() {
        return getName()+" Leaving in "+getAddress();
    }
}
