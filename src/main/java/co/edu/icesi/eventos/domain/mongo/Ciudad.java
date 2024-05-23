package co.edu.icesi.eventos.domain.mongo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ciudad {

    private String nombre;
    private String departamento;
    private String ciudad;

}
