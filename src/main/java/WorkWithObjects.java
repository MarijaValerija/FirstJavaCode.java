import model.Student;

public class WorkWithObjects {
    public static void main(String[] args) { //vsegda odinakovaja
        Student nikolajs = new Student(); //sozdali ekzempljar objekta student
        nikolajs.setFirstName("Nikolajs");
        nikolajs.setLastName("Gr.");
        nikolajs.setEmail("sexyboy@napljazhe.gr");
        nikolajs.setAge(21); //bez "" potomuchto integer

        Student dasha = new Student();
        dasha.setFirstName("Darja");
        dasha.setLastName("Ag.");
        dasha.setEmail("notfor@you.lv");
        dasha.setAge(18);

        Student lena = new Student("Helena","Ne.", "hel@ena.lv");
        lena.setAge(18);


//        System.out.println(nikolajs.getFirstName() + " " + nikolajs.getLastName());
//        System.out.println(dasha.getFirstName() + " " + dasha.getLastName());

//        System.out.println(nikolajs.getFullName());
//        System.out.println(dasha.getFullName());

        nikolajs.printFullInfo();
        dasha.printFullInfo();
        lena.printFullInfo();
    }
}
