//Sorting based on the age of students
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student>
{
    int age;
    String name;
    //constructor
    public Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    //Method
    public String toString()
    {
        return "Student [age="+age+",name= "+name+"]";
            }
            public int compareTo(Student s)
            {
                //sorting based on the age of the student
               if(this.age>s.age)
                   return 1;
               return -1;
            }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        /*st.add(new Student(21,"Kavya"));
        st.add(new Student(19,"Lavs"));
        st.add(new Student(23,"Kusuma"));
        st.add(new Student(50,"Navin"));*/
        Collections.sort(st);
        for(Student s:st)
            System.out.println(s);

    }

}
