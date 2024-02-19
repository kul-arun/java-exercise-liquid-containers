import java.util.Scanner;

public class UserInterface {

    private final Container first, second;

    public UserInterface() {
        this.first = new Container("First");
        this.second = new Container("Second");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(this.first);
            System.out.println(this.second);
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase();
            boolean shouldQuit = command.equals("quit");
            if (shouldQuit) {
                break;
            }
            int amount = Integer.parseInt(parts[1]);
            executeCommand(command, amount);
            System.out.println();
        }
    }

    public void executeCommand(String command, int amount) {
        switch (command) {
            case "add":
                first.add(amount);
                break;
            case "move":
                first.move(second, amount);
                break;
            case "remove":
                second.remove(amount);
                break;
            default:
                System.out.println("Unknown command! Try again.");
        }
    }
    
}