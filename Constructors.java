public class Constructors {
    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myCar = new Constructors(1969, "Ford Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }

}