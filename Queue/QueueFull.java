package Queue;

public class QueueFull extends RuntimeException{
    public QueueFull(String message) {
        super(message);
    }
}
