package SecondHw.ConcertHall;

public class Person extends ManyThanks{
    private Name name;
    private String phoneNumber;
    private int age;

    public Person(Name name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age=age;
    }

    public int yearsOfExperience(int x, int y) {
        return x + y;
    }

    public String yearsOfExperience(String x, String y) {
        return x + " " + y;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge(){ return age; }

    public void personInfo()
        {
            System.out.println("Person information:"+ name+ " "+ age);
        }

    @Override
    public String toString() { return name + " " +  age;}

    @Override
    public String manyThanks() {
        return "Many thanks to people took part";
    }
}
