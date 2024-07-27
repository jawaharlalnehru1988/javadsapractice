//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public int add(int a, int b){
            return a + b;
        }

        public int add(int a, int b, int c){
            return a + b + c;
        }



        public double add ( double a, double b){
            return a + b;
        }
    public static void main(String[] args) {
        Person person = new Person();
        Main math = new Main();

        person.setName("hare");
        person.setAge(25);

        System.out.println("person name is "+ person.getName());
        System.out.println("person age is "+ person.getAge());

        System.out.println("add 4 and 5 =" + math.add(4, 5));
        System.out.println("add 4 and 5 =" + math.add(4, 5, 6));

        }
    }
