
//@author: Trisha Basak

public class Student {
    private int age;

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // checking condition
    public boolean isEligibleToVote() {
        return age >= 18; 
    }

    public static void main(String[] args) {
        // example
        Student student = new Student();
        student.setAge(20); 
       
        if (student.isEligibleToVote()) 
        {
            System.out.println("The student is eligible to vote.");
        } 
        else
         {
            System.out.println("The student is not eligible to vote.");
        }
    }
}