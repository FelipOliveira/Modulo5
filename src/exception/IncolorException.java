package exception;

public class IncolorException extends Exception{
    private static final long serialVersionUID = 1L;

    public IncolorException(){
        super("Não é permitido ser incolor.");
    }
}
