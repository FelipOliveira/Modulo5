package exception;

public class ListaVaziaException extends Exception{
    private static final long serialVersionUID = 1L;

    public ListaVaziaException(){
        super("Não é permitida uma lista vazia");
    }
}
