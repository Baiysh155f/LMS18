import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              Appartment appartment = new Appartment("Jenish", "Bishkek", 200);
              Appartment appartment1 = new Appartment("Azat", "Bishkek", 200);
              Appartment appartment2 = new Appartment("Bektur", "Bishkek", 200);
              Appartment appartment3 = new Appartment("Adilet", "Bishkek", 200);
              Community community = new Community("Aiperi", 2000, "Osh");
              Community community1 = new Community("Nazira", 2000, "Osh");
              Community community2 = new Community("Ainazik", 2000, "Osh");
              Community community3 = new Community("jazgul", 2000, "Osh");
              Hostel hostel = new Hostel("Syimyk", 1500, "Batken");
              Hostel hostel1 = new Hostel("Dastan", 1500, "Batken");
              Hostel hostel2 = new Hostel("Sagyn", 1500, "Batken");
              Hostel hostel3 = new Hostel("Mirbek", 1500, "Batken");

    Leaving[] family = {appartment,appartment1,appartment2,appartment3,community,community1,community2,community3,hostel,hostel1,hostel2,hostel3};
            for (Leaving f : family) {
                System.out.print(f.getAddreses()+" ");
                if(f instanceof Appartment) {
                    System.out.println(((Appartment) f).getPublicServuce());
                }
                if(f instanceof Community) {
                    System.out.println(((Community) f).getRent());
                }
                if(f instanceof Hostel) {
                    System.out.println(((Hostel) f).getRent());
                }
            }

//                if (scanner.nextLine().equals("Bishkek")) {
//                    System.out.println(f.getAddreses());
//                } else if (scanner.nextLine().equals("Batken")) {
//                    System.out.println(f.getAddreses());
//                }else {
//                    System.out.println(f.getAddreses());
//                }
//                var str=scanner.nextLine().toLowerCase();
//                if ("bishkek".equals(str)) {
//                    System.out.println(f.getAddreses());
//                } else if ("osh".equals(str)) {
//                    System.out.println(f.getAddreses());
//                } else if ("batken".equals(str)) {
//                    System.out.println(f.getAddreses());
//                }else {
//                    System.out.println("err");
//                }

    }
}