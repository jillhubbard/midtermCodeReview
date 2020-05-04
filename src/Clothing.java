public class Clothing {

    private String size;
    private Double price;
    private String color;

    public Clothing () {
        this.size = "medium";
        this.price = 0.0;
        this.color = "No color";
    }

    public Clothing (String size, Double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    public String toString () {
        return this.getClass() + " " +this.getSize() + " " + this.getPrice() + " " + this.getColor();
    }

}
