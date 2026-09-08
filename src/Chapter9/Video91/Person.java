package Chapter9.Video91;

public class Person {
    private String name;
    private int age;

    public Person(String _name, int _age) {
        this.name = _name;
        this.age = _age;
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
        this.age = age;
    }

    class DetailInfo {
        private String idCard;
        private String hometown;

        public DetailInfo(String _idCard, String _hometown) {
            this.idCard = _idCard;
            this.hometown = _hometown;
        }

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public void printBasicInfo() {
            System.out.println("--- Your Basic Info ---");
            System.out.printf("-Your name: %s\n", name);
            System.out.printf("-Your age: %s\n", age);
            System.out.printf("-Your id: %s\n", this.idCard);
            System.out.printf("-Your hometown: %s\n", this.hometown);
        }
    }
}
