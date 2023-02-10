//To implement lambda expression we need interface
interface AdvCalc
{
    int opeartion(int i,int j);
}
public class FunctionalProgrammingDemo2 {
    public static void main(String[] args) {
        //Lambda Expression ((i,j)->i*j) here
        AdvCalc ac=(i,j)->i*j;
        int ans=doCalculation(2,4,ac);
        System.out.println(ans);
    }
    public static int doCalculation(int n1,int n2,AdvCalc c)
    {
        return c.opeartion(n1,n2);
    }
}
