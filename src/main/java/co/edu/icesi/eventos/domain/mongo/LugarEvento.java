package co.edu.icesi.eventos.domain.mongo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LugarEvento {

    private String nombre;
    private String direccion;
    private Ciudad ciudad;

}
