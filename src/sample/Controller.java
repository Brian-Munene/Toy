package sample;

import javafx.scene.control.Button;

public class Controller {
    public Button startClient;
    public Button startServer;
public void handleStartClient(){
    System.out.println("Client has started");
}
public void handleStartServer(){
    System.out.println("Server has started.");
}
}
