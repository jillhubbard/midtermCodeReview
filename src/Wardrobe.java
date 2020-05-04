import java.util.ArrayList;

public class Wardrobe {

    private Double sum= 0.0;
    private Double average = 0.0;

    ArrayList<Clothing> wardrobe = new ArrayList<Clothing>();

    public void newItem (String type, String size, Double price, String color){
        if (type.toLowerCase().trim() == "jean") {
            wardrobe.add(new Jean(size, price, color));
        } else if (type.toLowerCase().trim() == "shirt") {
            wardrobe.add(new Shirt(size, price, color));
        } else if (type.toLowerCase().trim() == "hat") {
            wardrobe.add(new Hat(size, price, color));
        } else {
            System.out.println("Sorry unable to add your entry");
        }

    }

    //  protected void clas
    public void list () {
        for (Clothing obj : wardrobe) {
            System.out.println(obj.toString());
        }
    }

    public void tally () {
        for (Clothing obj : wardrobe) {
            sum += obj.getPrice();
        }
        System.out.println("total price of wardrobe: " + String.format("$%.2f",sum));
        average = sum/wardrobe.size();
        System.out.println("total average price of wardrobe: " + String.format("$%.2f",average));
        sum= 0.0;
        average = 0.0;
    }

}
