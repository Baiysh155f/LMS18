public class Appartment extends Person{
    private int PublicServuce;

   public Appartment(){

   }
    public Appartment(String name, String address, int publicServuce) {
        super(name, address);
        this.PublicServuce = publicServuce;
    }

    public Appartment(String name, int rent, String address, int publicServuce) {
        super(name, rent, address);
        PublicServuce = publicServuce;
    }

    public int getPublicServuce() {
        System.out.print("Public Servuce :");
       return PublicServuce;
    }

    public void setPublicServuce(int publicServuce) {
        PublicServuce = publicServuce;
    }

    @Override
    public String getAddreses() {
        return getName()+" leaving in "+getAddress();
    }

    @Override
    public String toString() {
        return "Appartment{" +
                "PublicServuce=" + PublicServuce +
                '}';
    }
}
