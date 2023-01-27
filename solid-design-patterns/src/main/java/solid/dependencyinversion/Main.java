package solid.dependencyinversion;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        try (PrintWriter writer = new PrintWriter(/*"test_msg.txt"*/ System.out)) { // Print in console or a file
            printer.writeMessage(msg, new JSONFormatter(), writer);
        }

    }

}
