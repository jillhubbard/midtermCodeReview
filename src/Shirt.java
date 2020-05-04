public class Shirt extends Clothing {

    public Shirt () {
        super();
    }

    public Shirt (String size, Double price, String color) {
        super(size, price, color);
    }

    public void instructions () {
        System.out.println("To put on shirt, put both arms in and bring down to waist," +
                " ensure that you are wearing with front side forward");
    }
}
