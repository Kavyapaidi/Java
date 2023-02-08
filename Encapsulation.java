class Human
{
    private int age;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human O1=new Human();
        O1.setAge(21);
        O1.setName("Kavya");
        System.out.println(O1.getAge());
        System.out.println(O1.getName());

    }

}
