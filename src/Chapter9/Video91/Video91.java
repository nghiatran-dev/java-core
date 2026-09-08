package Chapter9.Video91;

public class Video91 {
    public static void main(String[] args) {
        System.out.println("=== Video 91: Inner Class And Nested Class ===");

        Person person = new Person("Victor", 33);
        System.out.println("Person info:");
        System.out.printf("- Name: [%s]\n", person.getName());
        System.out.printf("- Age: [%d]\n", person.getAge());

        // Inner class (non static)
        Person.DetailInfo detail = person.new DetailInfo("058******123", "Khanh Hoa");
        System.out.println("DetailInfo info:");
        System.out.printf("- ID Card: [%s]\n", detail.getIdCard());
        System.out.printf("- Hometown: [%s]\n", detail.getHometown());

        detail.printBasicInfo();

        //===============================

        // Inner class (with static)
        PersonStatic person2 = new PersonStatic("Voi", 2);
        System.out.println("Person 2 info:");
        System.out.printf("- Name: [%s]\n", person2.getName());
        System.out.printf("- Age: [%d]\n", person2.getAge());

        // Inner class (with static)
        PersonStatic.DetailInfo detail2 = new PersonStatic.DetailInfo("079******866", "Khanh Hoa");
        System.out.println("DetailInfo info:");
        System.out.printf("- ID Card: [%s]\n", detail2.getIdCard());
        System.out.printf("- Hometown: [%s]\n", detail2.getHometown());
    }
}
