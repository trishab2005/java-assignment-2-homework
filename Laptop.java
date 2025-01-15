//@author: Trisha Basak


   class Laptop {
    private String brand;
    private int price;
    private String processorType;
	
    //Getter & Setter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs." + price);
        System.out.println("Processor Type: " + processorType);
    }
}

class User {
    private String username;
    private String address;


    //Getter & Setter
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
    }

    //iterating to find laptop with intel core ultra processor
    public void purchaseLaptop(Laptop[] laptops) {
        for (Laptop laptop : laptops) {
            if (laptop.getProcessorType().contains("Intel Core Ultra")) {
                System.out.println("User purchased:");
                laptop.displayDetails();
                return;
            }
        }
        System.out.println("No Intel Core Ultra laptop found.");
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances
        Laptop hp = new Laptop();
        hp.setBrand("HP");
        hp.setPrice(90000);
        hp.setProcessorType("Ryzen 5");

        Laptop lenovo = new Laptop();
        lenovo.setBrand("LENOVO");
        lenovo.setPrice(70000);
        lenovo.setProcessorType("AMD Ryzen");

        Laptop dell = new Laptop();
        dell.setBrand("DELL");
        dell.setPrice(80000);
        dell.setProcessorType("Intel Core Ultra i9 ");

        // Add laptops to an array
        Laptop[] laptops = {hp, lenovo, dell};

        // Create user
        User user = new User();
        user.setUsername("Sayantani Saha");
        user.setAddress("Serampore-Uttarpara, West Bengal, India");

        // Display user information
        System.out.println("\nUser Information:");
        user.displayDetails();

        // Display available laptops
        System.out.println("\nAvailable Laptops:");
        for (Laptop laptop : laptops) {
            laptop.displayDetails();
            System.out.println();
        }

        // User purchases an Intel Core Ultra laptop
        System.out.println("\nLaptop Purchase Decision:");
        user.purchaseLaptop(laptops);
    }
}