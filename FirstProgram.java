import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;


class FirstProgram {
    public static void main(String[] args) throws IOException {
        clearScreen();
        Float int_number = null;
        while (int_number == null) {
            try {
                String str_number = input(Optional.of("Enter a valid number: "));
                int_number = toFloat(str_number);
                clearScreen();
                System.out.println(int_number);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number or number was to long");
                input(Optional.empty());
                clearScreen();
                int_number = null;
                clearScreen();
            } catch (Exception e) {
                System.out.println("An error has occured");
                input(Optional.empty());
                int_number = null;
                clearScreen();
            }
        }
    }

    public static int toInt(String string) {
        return Integer.parseInt(string);
    }

    public static float toFloat(String string) {
        return Float.parseFloat(string);
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static void clearScreen() throws IOException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static String input(Optional<String> input) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input.ifPresent(System.out::print);
        return br.readLine();
    }
}