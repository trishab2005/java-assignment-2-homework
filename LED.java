
//@author:Trisha Basak

public class LED {
    private int id;
    private String brand;
    private double price;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        
        LED sonyOLED = new LED();
        sonyOLED.setId(1);
        sonyOLED.setBrand("Sony");
        sonyOLED.setPrice(1200.00); 

        LED samsungOLED = new LED();
        samsungOLED.setId(2);
        samsungOLED.setBrand("Samsung");
        samsungOLED.setPrice(1100.00); 

       
        if (sonyOLED.getPrice() > samsungOLED.getPrice()) 
        {
            sonyOLED.setBrand("Premium Model - " + sonyOLED.getBrand());
        } 
        else if (samsungOLED.getPrice() > sonyOLED.getPrice()) 
        {
            samsungOLED.setBrand("Premium Model - " + samsungOLED.getBrand());
        }

        // Print details of both TVs
        System.out.println("LED TV Details:");
        System.out.println("ID: " + sonyOLED.getId() + ", Brand: " + sonyOLED.getBrand() + ", Price: $" + sonyOLED.getPrice());
        System.out.println("ID: " + samsungOLED.getId() + ", Brand: " + samsungOLED.getBrand() + ", Price: $" + samsungOLED.getPrice());
    }
}