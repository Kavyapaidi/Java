interface calc
{
    int opeartion(int i,int j);
    //only declaration no definition for abstract method
}
public class FunctionalProgrammingDemo {
    public static void main(String[] args) {
        calc c=new calc()
        {
            //providing definition for abstract method
            public int opeartion(int i,int j)
            {
                return i+j;
            }
        };
        int result=doSomething(1,2,c);
        System.out.println(result);
    }
    public static int doSomething(int n1,int n2,calc c)
    {
        return c.opeartion(n1,n2);
    }

}
