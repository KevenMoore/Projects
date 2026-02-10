public class Pet {
    // Private data field
    private String name;

    // Default constructor
    public Pet() {
        setName("Pet Name"); // use set method as suggested
    }

    // Setter (mutator)
    public void setName(String newName) {
        name = newName;
    }

    // Getter (accessor)
    public String getName() {
        return name;
    }

    // toString method
    public String toString() {
        String info = "Pet information:\n";
        info += "Name: " + name;
        return info;
    }

    // Main method
    public static void main(String[] args) {
        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        // Second Pet object using setName method
        Pet pet2 = new Pet(); // start with default
        pet2.setName("Buster");
        System.out.println(pet2.toString());
    }
}
