package api.hub.domain.usuario.validaciones;

import api.hub.domain.usuario.RegistroUsuarioDTO;

public interface ValidadorDeUsuario {
    void validate(RegistroUsuarioDTO registroUsuarioDTO);
}
