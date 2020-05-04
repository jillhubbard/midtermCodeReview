public class Hat extends Clothing{
    protected static Boolean clash =true;

    public Hat () {
        super();
    }

    public Hat (String size, Double price, String color) {
        super(size, price, color);
    }

    public static boolean clashesWith (Clothing obj) {
        if (obj.getColor().length() >= 1) {
            return false;
        }
        return true;
    }
}
