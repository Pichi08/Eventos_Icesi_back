package co.edu.icesi.eventos.domain.mongo;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Comentario {

    private String texto;
    private String usuario;

}
