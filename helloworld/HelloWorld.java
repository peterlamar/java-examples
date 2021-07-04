
public class HelloWorld {
    public static void main(String[] args) {
       // Prints "Hello, World" in the terminal window.
       System.out.println("Hello, World");
       for (int x=0; x<args.length; x++){
           System.out.print(args[x]);
       }
    }
 }