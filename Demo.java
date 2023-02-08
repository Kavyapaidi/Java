import other.tools.Calci;

class Calculator
{
    //class can have variables and methods
    int a;
    public int add(int n1,int n2)
    {
        int ans=n1+n2;
        return ans;
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1=2;
        int num2=4;
        Calculator cal=new Calculator();//jvm will give u new object
        int res=cal.add(num1,num2);
        System.out.println(res);
        Calci obj=new Calci();//import other.tools.Calci;


    }

}
