
    class Humans
    {
        private int age;
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public class thisKeyword {
        public static void main(String[] args) {
            Humans O1=new Humans();
            O1.setAge(21);
            O1.setName("Kavya");
            System.out.println(O1.getAge());
            System.out.println(O1.getName());

        }

    }


