
class Humanss
{
    private int age;
    private String name;
    public Humanss(){
        age=21;
        name="Kavya";
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Humanss O1=new Humanss();
        System.out.println(O1.getAge());
        System.out.println(O1.getName());


    }

}



