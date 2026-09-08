package Chapter8.Lab06;

public class Lab06 {
    public static void main(String[] args) {
        System.out.println("=== Lab 06 ===");
        Manager boss = new Manager("Victor", 33, 5);
        Engineer engineer = new Engineer("Voi", 20, "AI");
        Person[] listEmploy = {engineer, boss};

        for (Person employee: listEmploy) {
            employee.introduce();
            employee.work();
            if (employee instanceof Trainable) {
                Trainable trainable = (Trainable) employee;
                if (employee instanceof Engineer) {
                    trainable.attendTraining("Cloud Computing");
                } else {
                    trainable.attendTraining("Leadership");
                }
                trainable.feedback();
                System.out.println();
            }
        }
    }
}
