import other.*;// all the files not folders
public class Demo1 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.marks);//if you can't make marks as public in class A then you cant access it outside from the package
//Demo is outside the other package
        B b=new B();
        System.out.println(b.marks);//you don't need to make marks as public in class B,
        //as class B is in the same package where Demo1 present
        a.show();
        b.show();

    }

}


