public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Observer observer1 = new Observer("Katherine", terminal);
        terminal.updateData();
    }
}