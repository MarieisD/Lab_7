package bsu.rfe.java.group9.lab7.Eismont;

public interface MessageListener {
    void messageReceived(Peer senderName, String message);
}