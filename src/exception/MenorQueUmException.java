package exception;

public class MenorQueUmException extends Exception{
    private static final long serialVersionUID = 1L;

    public MenorQueUmException(){
        super("Não é permitido número menor que 1.");
    }
}
