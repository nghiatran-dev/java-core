package Chapter8.Lab06;

public class Manager extends Person implements Trainable {
    private int teamSize;
    public Manager(String _name, int _age, int _teamSize) {
        super(_name, _age);
        this.teamSize = _teamSize;
    }

    @Override
    public void work() {
        System.out.printf("Manager %s managing a team of %s people.\n", super.getName(), this.teamSize);
    }

    @Override
    public void attendTraining(String _topic) {
        System.out.printf("Manager  %s is attending management training on [%s].\n", super.getName(), _topic);
    }
}
