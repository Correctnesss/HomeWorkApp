package Training2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        ServerMessage();
    }

    public static void ServerMessage() {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8089)) { //try with resources
            System.out.println("Сервер ожидает подключения... ");
            socket = serverSocket.accept(); // ждем подключения (БЛОКИРУЕМСЯ)
            System.out.println("Клиент подключился! ");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (true) {
                        System.out.println("Введите сообщение:");
                        String message = SCANNER.next();
                        if (message.equals("/end")) {
                            dataOutputStream.writeUTF(message);
                            break;
                        }
                        dataOutputStream.writeUTF("Echo: " + message);

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }).start();
            while (true) {
                String message = dataInputStream.readUTF();

                //poison pill
                if (message.equals("/end")) {
                    dataOutputStream.writeUTF(message);
                    break;
                }
                System.out.println("Клиент прислал " + message);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } //finally {serverSocket.close()}


    }
}

