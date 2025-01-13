package api.hub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UsuarioDTO(
        @NotBlank(message = "Utilice su correo electrónico como nombre de usuario")
        @Email(message = "Correo electrónico inválido.")
        String email,

        @NotBlank(message = "Debe tener entre 10 y 15 caracteres.")
        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{10,15}$", message = "La contraseña debe tener entre 10 y 15 caracteres, incluyendo al menos una letra y un número.")
        String password
) {
}
