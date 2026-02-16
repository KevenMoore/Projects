import java.util.Scanner;

public class Pet {

    private String name;
    private String type;
    private int age;

    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Noise";
        }
    }

    public String toString() {
        String info = "Pet information:\n";
        info += "Type: " + type + "\n";
        info += "Name: " + name + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age:  " + age + "\n";
        return info;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet p1 = new Pet();
        System.out.println(p1);

        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2);

        System.out.println("Enter animal type:");
        String type = sc.nextLine();

        System.out.println("Enter animal name:");
        String name = sc.nextLine();

        System.out.println("Enter animal age:");
        int age = sc.nextInt();

        Pet p3 = new Pet(name, type, age);
        System.out.println(p3);
    }
}
