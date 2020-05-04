import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        addItems(wardrobe);
        wardrobe.list();
        wardrobe.tally();

        Hat.clashesWith(wardrobe.wardrobe.get(2));
        System.out.println(Hat.clash);
    }

    private static void addItems(Wardrobe wardrobe) {
        wardrobe.newItem("jean","small", 40.0,"gold");
        wardrobe.newItem("jean","medium", 120.0,"black");
        wardrobe.newItem("shirt","large", 60.0,"blue");
        wardrobe.newItem("hat","small", 10000.0,"gold");
    }

}
