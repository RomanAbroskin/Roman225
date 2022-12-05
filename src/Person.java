public class Person {
    private String name;
    private int age;

    private String Lastname;
    private String imail;


    public Person(String name, String Lastname, String imail, int age) {
        this.name = name;
        this.imail = imail;
        this.Lastname = Lastname;
        this.age = age;
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
