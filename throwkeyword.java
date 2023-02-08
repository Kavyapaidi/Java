class KavyaException extends RuntimeException{
    //constructor
    public KavyaException(String s)
    {
super(s);//pass the message to RuntimeException constructor
    }

}//user defined exception
public class throwkeyword {
        public static void main(String[] args) {
            //Arithmetic Exception
            int i=20;
            int j=0;
            try {
                j = 18 / i;
                if(j==0)
                    throw new KavyaException("I don't want to print zero");
                     //message that u want to print (inside method)
                    //calling catch block having ArithmeticException
                    //throws the exception, catch will catch the exception
            }
            catch(KavyaException e)
            {
                j=18/1;
                System.out.println("that's the default output " + e);
                //Here e is the message that u want to print
            }
            catch(Exception e)
            {
                System.out.println("Somemthing went wrong!"+e);
            }

            System.out.println(j);
            System.out.println("Bye");
        }
    }

