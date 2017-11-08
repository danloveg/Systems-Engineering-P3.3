package clientmessagehandler;

import java.io.IOException;

/**
 * Handles the executing of the user's commands.
 * 
 * @author Daniel Lovegrove
 */
public class ClientMessageHandler {
    
    private final userinterface.Userinterface UI;
    private final client.Client myClient;
    
    
    /**
     * Creates an instance with an associated user interface and client.
     * @param ui The UI user interface
     * @param client The client
     */
    public ClientMessageHandler(userinterface.Userinterface ui, client.Client client) {
        this.UI = ui;
        this.myClient = client;
    }
    
    
    /**
     * Parses the user's command and executes the appropriate task.
     * @param userCommand The string the user entered
     */
    public void execute(String userCommand) {
        // First, trim any whitespace
        String cmd = userCommand.trim();

        switch (cmd) {
            case "connect":
                connectClientToServer();
                break;
            case "d":
            case "q":
                disconnectClientFromServer(cmd);
                break;
            case "t":
            case "L1on":
            case "L2on":
            case "L3on":
            case "L4on":
            case "L1off":
            case "L2off":
            case "L3off":
            case "L4off":
            case "gpb1":
            case "gpb2":
            case "gpb3":
                sendStringToServer(cmd);
                break;
            case "":
                break;
            default:
                invalidCommand(cmd);
                break;
        }
    }


    /**
     * Try to connect the client to the server if they aren't already connected.
     */
    private void connectClientToServer() {
        if (false == myClient.getConnected()) {
            // If we are not connected, try to connect. Do it in a thread so
            // that we don't make the UI unresponsive.
            Thread establishConnection = new Thread(() -> {
                try {
                    // Try to connect to server
                    myClient.connectToServerIP("192.168.1.214");
                    // Then create the Client Thread and start it
                    Thread clientThread = new Thread(myClient);
                    clientThread.start();
                } catch (IOException ex) {
                    UI.update("Could not create a connection to server.");
                }
            });
            // Start the thread
            establishConnection.start();
        } else {
            // We are already connected
            UI.update("Already connected!");
        }
    }


    /**
     * Try to disconnect the client from the server if they are connected to a
     * server.
     * @param disconnectString The disconnect code that will be sent to the
     * server
     */
    private void disconnectClientFromServer(String disconnectString) {
        if (true == myClient.getConnected()) {
            // If we are connected, try to disconnect. Do it in a thread so
            // that we don't make the UI unresponsive.
            Thread closeConnection = new Thread(() -> {
                try {
                    // Send disconnect message q or d to server
                    sendStringToServer(disconnectString);
                    // Then disconnect the Client
                    myClient.disconnectFromServer();
                } catch (IOException ex) {
                    UI.update("Disconnection error: " + ex.toString());
                }
            });
            // Start the thread
            closeConnection.start();

        } else if (false == disconnectString.equals("q")) {
            UI.update("No connected server.");
        }
        // If we want to quit, close the program as well
        if (disconnectString.equals("q")) {
            System.exit(0);
        }
    }


    /**
     * Use the client to send a String to a connected server.
     * @param message The message to send
     */
    private void sendStringToServer(String message) {
        if (true == myClient.getConnected()) {
            try {
                myClient.sendMessageToServer(message);
            } catch (IOException e) {
                UI.update("Could not send message to server.");
                disconnectClientFromServer("d");
            }
        } else {
            UI.update("No connected server.");
        }
    }


    /**
     * Notify the user that their command is not valid.
     * @param command The command that was invalid
     */
    private void invalidCommand(String command) {
        UI.update("\"" + command + "\" is not recognized.");
    }
}
