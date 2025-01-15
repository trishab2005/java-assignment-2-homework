//@author: Trisha Basak

class Mobile {
    private String brand;
    private String model;
    private String operatingSystem;

    // Getter and Setter methods
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + operatingSystem);
    }
}

class Shop {
    private Mobile[] mobiles = new Mobile[3]; // Fixed size array to store mobiles
    private int count = 0; // To keep track of the number of mobiles added

    // Method to add a mobile to the shop
    public void addMobile(Mobile mobile) {
        if (count < mobiles.length) {
            mobiles[count] = mobile;
            count++;
        } else {
            System.out.println("Shop is full, cannot add more mobiles.");
        }
    }

    // Method to sell a mobile based on brand and operating system
    public Mobile sellMobile(String brand, String operatingSystem) {
        for (int i = 0; i < count; i++) {
            if (mobiles[i].getBrand().equalsIgnoreCase(brand) && mobiles[i].getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                Mobile soldMobile = mobiles[i];
                // Shift the remaining mobiles to the left
                for (int j = i; j < count - 1; j++) {
                    mobiles[j] = mobiles[j + 1];
                }
                count--;
                return soldMobile;
            }
        }
        return null;
    }

    // Method to display available mobiles in the shop
    public void displayAvailableMobiles() {
        System.out.println("Available Mobiles:");
        for (int i = 0; i < count; i++) {
            mobiles[i].displayDetails();
            System.out.println();
        }
    }
}

class Customer {
    private String name;

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method for the customer to visit the shop and purchase a mobile
    public void visitShopAndPurchaseMobile(Shop shop, String brand, String operatingSystem) {
        System.out.println(name + " is visiting the shop to purchase a " + brand + " mobile with " + operatingSystem);
        Mobile purchasedMobile = shop.sellMobile(brand, operatingSystem);
        if (purchasedMobile != null) {
            System.out.println(name + " purchased: ");
            purchasedMobile.displayDetails();
        } else {
            System.out.println("No " + brand + " mobile with " + operatingSystem + " found.");
        }
    }
}

class MobileShop {
    public static void main(String[] args) {
        // Create shop and add mobiles
        Shop shop = new Shop();
        Mobile vivo = new Mobile();
        vivo.setBrand("AppleIphone");
        vivo.setModel("iphone16");
        vivo.setOperatingSystem("iOS");

        Mobile samsung = new Mobile();
        samsung.setBrand("Samsung");
        samsung.setModel("Galaxy S21");
        samsung.setOperatingSystem("Android 14");

        Mobile onePlus = new Mobile();
        onePlus.setBrand("VIVO");
        onePlus.setModel("V21");
        onePlus.setOperatingSystem("Android 15");

        shop.addMobile(vivo);
        shop.addMobile(samsung);
        shop.addMobile(onePlus);

        // Display available mobiles in the shop
        shop.displayAvailableMobiles();
        System.out.println("------------------------------------------------------------------------------------------------");
        // Create customer and visit shop to purchase a VIVO mobile with Android 15
        Customer customer = new Customer();
        customer.setName("Sayantani");
        customer.visitShopAndPurchaseMobile(shop, "VIVO", "Android 15");
    }
}
