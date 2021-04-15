package model;

//-----------------------OBJECT----------------------------
public class Student {
    //-------------------Properties------------------------
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    //-------------------End of Properties----------------

//-------------------Constructor----------------------
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;//chto bi peremennije iz construktora mozhno izpolzovatj vezde
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {}
//-------------------End of Constructor----------------

    //-------STANDART METHODS (GETTERS/SETTERS)-----------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; //this==etot class, bez this peremennaja iz metoda
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {//void pustoj metod kotorij nichego ne vozvrashajet
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //-------END OF STANDART METHODS-----------------

    //-------CUSTOM METHODS--------------------------
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printFullInfo() {
        System.out.println("---------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
    //-------END OF CUSTOM METHODS-------------------
}
