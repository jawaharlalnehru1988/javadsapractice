import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> devatas = new Stack<>();

        devatas.push("Indra dev");
        devatas.push("Surya dev");
        devatas.push("Chandra dev");
        devatas.push("Vayu dev");

        System.out.println(devatas);
        System.out.println(devatas.peek());
        System.out.println(devatas.pop());
        System.out.println(devatas);

    }
}
