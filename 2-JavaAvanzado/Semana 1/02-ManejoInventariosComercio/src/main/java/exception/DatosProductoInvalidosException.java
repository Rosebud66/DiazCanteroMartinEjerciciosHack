package exception;

// Clase de excepción personalizada para datos de productos inválidos
public class DatosProductoInvalidosException extends Exception {

    public DatosProductoInvalidosException(String mensaje) {
        super(mensaje);
    }
}
