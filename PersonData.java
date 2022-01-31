import java.util.ArrayList;
import java.util.Scanner;

public class PersonData {
    public static void main (String args[]) {
        ArrayList<Person> persones = new ArrayList<Person>();

        while (true) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Choose the function by inputting number: 1 add new person, 2 delete person, 3 print all persons, 4 exit");
            String input = myScanner.nextLine();

            if (input.equals("1")) { // add new person
                System.out.print("Name: ");
                String name = myScanner.nextLine();

                System.out.print("Age: ");
                String ageInput = myScanner.nextLine();

                System.out.print("Street: ");
                String street = myScanner.nextLine();

                System.out.print("Postcode: ");
                String postcodeInput = myScanner.nextLine();

                System.out.print("City: ");
                String city = myScanner.nextLine();

                int age = Integer.valueOf(ageInput);
                int postcode = Integer.valueOf(postcodeInput);
                Address newAddress = new Address(street, postcode, city);

                System.out.println();

                persones.add(new Person(name, age, newAddress));
            }
            else if (input.equals("2")) { // remove person

                System.out.println("Who do you want to delete?");
                String name = myScanner.nextLine();

                for (int i = 0; i < persones.size(); i++) {
                    if (name == persones.get(i).getName()) {
                        persones.remove(i);
                    }		
                }
                System.out.println("");
            }
            else if (input.equals("3")) { // print all persons
                for (Person p : persones) {
	                p.printPerson();
                    System.out.println("");	
	            }   
            }
            else if (input.equals("4")) { // exit
                break;
            } else {
                System.out.println("Give number between 1 and 4");
            }
        }
    }
}