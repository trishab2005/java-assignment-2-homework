//@author: Trisha Basak
//using LOMBOK

import lombok.*;
// Person class
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private int age;
    private Address address; // Has-A relationship
}

// Address class
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
class Address {
    private String street;
    private String city;
    private String pinCode;

}

// Main class
class PersonHasAddress {
    public static void main(String[] args) {
        Address address = new Address("203 /A", "Serampore-Uttarpara",  "712245");
        Person person = new Person("Sayantani", 21, address);
        System.out.println(person);
    }
}



