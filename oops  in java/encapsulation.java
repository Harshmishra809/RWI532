


public class encapsulation {
    private String name;
    private int age;


    public encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        if (age > 0 && age < 150) { 
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        
        encapsulation person = new encapsulation("Alice", 30);


        System.out.println("Original Information:");
        person.displayInfo();

    
        person.setName("Bob");
        person.setAge(25);


        System.out.println("\nUpdated Information:");
        person.displayInfo();
    }
}
