package libraries.dataStructures.exceptions;

public class ElementNotFound extends Exception {
    public ElementNotFound(String message) {
        super(message);
    }    
    public ElementNotFound() {
        super();
    }
}