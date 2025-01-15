
//@author: Trisha Basak


    class EmployeeSalary {
        private double basicSalary;
    
        // Getter and Setter methods
        public double getBasicSalary() {
            return basicSalary;
        }
        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }
    
        // Method to calculate tax
        public double calculateTax() {
            return basicSalary * 0.10;
        }
    
        // Method to calculate bonus
        public double calculateBonus() {
            return basicSalary * 0.02;
        }
    
        // Method to calculate travelling allowance
        public double calculateTravellingAllowance() {
            return basicSalary * 0.015;
        }
    
        // Method to calculate annual salary
        public double calculateAnnualSalary() {
            double monthlySalary = basicSalary - calculateTax() + calculateBonus() + calculateTravellingAllowance();
            return monthlySalary * 12;
        }
    
        // Method to display employee salary details
        public void displaySalaryDetails() {
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Monthly Tax: " + calculateTax());
            System.out.println("Monthly Bonus: " + calculateBonus());
            System.out.println("Monthly Travelling Allowance: " + calculateTravellingAllowance());
            System.out.println("Annual Salary: " + calculateAnnualSalary());
        }
    
        public static void main(String[] args) {
            EmployeeSalary empS = new EmployeeSalary();
            empS.setBasicSalary(40000); // Setting the basic salary using the setter method
            empS.displaySalaryDetails();
        }
    }
    