package Training2.lesson6;

public class Scanner {
    private static final java.util.Scanner SCANNER = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        ServerMessage();
    }
    public static void ServerMessage(){
        while (true){
            System.out.println("Введите сообщение:");
            String message = SCANNER.next();
            if (message.equals("/end")){
                break;
            }
        }
    }
}
