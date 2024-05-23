package co.edu.icesi.eventos.domain.mongo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Facultad {

    private Integer identificador;
    private String nombre;
    private String programa;

}
