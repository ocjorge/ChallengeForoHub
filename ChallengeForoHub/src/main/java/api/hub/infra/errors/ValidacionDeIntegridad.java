package api.hub.infra.errors;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String message) {
        super(message);
    }
}
