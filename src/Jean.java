public class Jean extends  Clothing{

    public Jean () {
        super();
    }

    public Jean (String size, Double price, String color) {
        super(size, price, color);
    }

    public void instructions () {
        System.out.println("To put on pants, put both legs in and bring up to waist," +
                " ensure that you are wearing with front side forward");
    }

}
