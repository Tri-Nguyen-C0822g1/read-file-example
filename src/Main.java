import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter link: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}