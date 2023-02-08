public class ExceptionHandling {
    public static void main(String[] args) {
        //Arithmetic Exception
        int i=0;
        int j=0;


        try {
            j = 18 / i;
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println(j);//Initially j=0;
        System.out.println("Bye");
        //Even if there is exception, code will get executed
        //using try catch block
        //catch blocks executes only if there is exception
    }
}
