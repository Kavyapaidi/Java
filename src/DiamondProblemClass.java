public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{
    public void m1()
    {
        DiamondProblemInterface2.super.m1();
    }
    public static void main(String[] args)
    {
        DiamondProblemClass default1=new DiamondProblemClass();
        default1.m1();
    }
}
