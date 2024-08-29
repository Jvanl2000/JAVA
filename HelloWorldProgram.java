import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloWorldProgram {
    public static void main(String[] args) {
        HelloWorld();
    }

    public static void HelloWorld() {
        System.out.println("Hello World!");
    }

    public static String input(String input) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(input);
        return bfn.readLine();
    }
}