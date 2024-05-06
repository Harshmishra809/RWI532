 // Stack follow lifo cocept
 
 import java.util.Stack;

public class learnstack {

    public static void main(String[] args) {

        Stack<String> person = new Stack<>();

        person.push("harsh");  // push method
        person.push("sunil");
        person.push("naman");
        person.push("anil");
        System.err.println(person);
        

        System.out.println(person.peek()); // peek method

        person.pop();   // pop method
System.out.println(person.peek());
        
    }


    
}
