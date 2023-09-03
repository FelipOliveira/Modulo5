package exception;

public class NumeroNegativoException extends Exception{
    private static final long serialVersionUID = 1L;

    public NumeroNegativoException(){
        super("Número negativo não é permitido.");
    }
}
