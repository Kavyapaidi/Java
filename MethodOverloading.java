
class Calc
    {
        //class can have variables and method
        public int add(int n1,int n2)
        {
            int ans=n1+n2;
            return ans;
        }
        public int add(int n1,int n2,int n3) {
            int ans=n1+n2+n3;
            return ans;
        }
        public double add(int n1,double n2) {
            double ans=n1+n2;
            return ans;
        }

    }
    public class MethodOverloading{
        public static void main(String[] args) {
            Calc cal=new Calc();//jvm will give u new object
            int res1=cal.add(2,3);
            double res2=cal.add(2, 4.6);
            int res3=cal.add(3,4,5);
            System.out.println(res1);
            System.out.println(res2);
            System.out.println(res3);
        }
    }

