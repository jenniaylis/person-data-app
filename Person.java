public class Person {
    private String name;
    private int age;
    private Address address;

    // builders
    public Person (String aName, int aAge) {
        name=aName;
        age=aAge;
    }
    public Person (String aName, int aAge, Address aAddress) {
        name=aName;
        age=aAge;
        address=aAddress;
    }

    // setters and getters
    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int number) {
        age = number;
    }
    public int getAge() {
        return age;
    }
    public void setAddress(Address aAddress) {
        address = aAddress;
    }
    public Address getAddress() {
        return address;
    }
    
    public void printPerson() {
        System.out.println("Name: " + mNimi);
        System.out.println("Age: " + mIka);
        if (address != null) {
            address.printAddress();
        }
    }
}