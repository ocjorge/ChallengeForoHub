package api.hub.domain.usuario.validaciones;

import api.hub.domain.usuario.RegistroUsuarioDTO;
import api.hub.infra.errors.ValidacionDeIntegridad;
import org.springframework.stereotype.Component;

@Component
public class ValidadorDeUsuarioImpl implements ValidadorDeUsuario {

    @Override
    public void validate(RegistroUsuarioDTO registroUsuarioDTO) {
        if (registroUsuarioDTO.name() == null || registroUsuarioDTO.name().isEmpty()) {
            throw new ValidacionDeIntegridad("El nombre no puede estar vacío.");
        }
        if (registroUsuarioDTO.email() == null || registroUsuarioDTO.email().isEmpty()) {
            throw new ValidacionDeIntegridad("El correo electrónico no puede estar vacío.");
        }
        if (registroUsuarioDTO.username() == null || registroUsuarioDTO.username().isEmpty()) {
            throw new ValidacionDeIntegridad("El nombre de usuario no puede estar vacío.");
        }
        if (registroUsuarioDTO.password() == null || registroUsuarioDTO.password().isEmpty()) {
            throw new ValidacionDeIntegridad("La contraseña no puede estar vacía.");
        }
    }
}
