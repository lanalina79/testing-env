package methodtasks;

public class Customer {
    private String name;
    private int id;
    private String address;
    private int age;

    public Customer(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.address = adress;
    }

    public Customer() {
    }

    ;
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int ageInput) {
        if ((ageInput > 0) && (ageInput <= 100)) {
            age = ageInput;
        } else {
            System.out.println("The age is invalid");
        }
    }

    //Getters
    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
