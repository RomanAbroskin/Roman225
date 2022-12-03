public class Person {
    private String name;
    private int age;

    private String Lastname;
    private String imail;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.Lastname = Lastname;
        this.imail = imail;
    }

    public Person(String lastname, String imail) {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getImail() {
        return imail;
    }
}
