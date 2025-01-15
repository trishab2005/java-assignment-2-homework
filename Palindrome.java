
//@Author:Trisha Basak


import javax.swing.JOptionPane;

class Person {
    private String name;

    // Getter and Setter methods
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method to check if the name is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase
        String finalName = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                finalName += Character.toLowerCase(c);
            }
        }

        int length = finalName.length();
        for (int i = 0; i < length / 2; i++) {
            if (finalName.charAt(i) != finalName.charAt(length - 1 - i)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }

    // Method to display whether the name is a palindrome using JOptionPane
    public void displayPalindromeCheck() {
        String message = "Name: " + name + "\nIs palindrome: ";
        if (isPalindrome()) {
            message += "Yes";
        } else {
            message += "No";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        Person person = new Person();
        person.setName(name);

        person.displayPalindromeCheck();
    }
}

