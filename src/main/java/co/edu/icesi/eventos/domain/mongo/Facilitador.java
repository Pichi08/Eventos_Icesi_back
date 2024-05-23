package co.edu.icesi.eventos.domain.mongo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Facilitador {

    private String identificador;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String tipoRelacion;
    private String email;
    private Ciudad ciudad;

}
