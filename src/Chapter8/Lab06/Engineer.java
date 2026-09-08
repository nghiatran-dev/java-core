package Chapter8.Lab06;

public class Engineer extends Person implements Trainable {
    private String specialty;
    public Engineer(String _name, int _age, String _specialty) {
        super(_name, _age);
        this.specialty = _specialty;
    }

    @Override
    public void work() {
        System.out.printf("Engineer %s is working on %s project.\n", super.getName(), this.specialty);
    }

    @Override
    public void attendTraining(String _topic) {
        System.out.printf("Engineer  %s is attending training on [%s].\n", super.getName(), _topic);
    }
}
