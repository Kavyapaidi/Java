
class H{
    private int age;
    private String name;
    public H(){//Default Constructor
        age=21;
        name="Kavya";}
    public H(String name){
        //ParameterizedConstructor
        age=12;
        this.name=name;
    }
    public H(int a,String name){
        //ParameterizedConstructor
            age=a;
            this.name=name;
        }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        H O1=new H();
        H O3=new H("Rohith");
        H O2=new H(20,"Lavs");

        System.out.println(O1.getAge()+","+O1.getName());
        System.out.println(O2.getAge()+","+O2.getName());
        System.out.println(O3.getAge()+","+O3.getName());
    }

}

