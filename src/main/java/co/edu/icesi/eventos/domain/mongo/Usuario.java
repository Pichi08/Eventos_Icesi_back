package co.edu.icesi.eventos.domain.mongo;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document(collection = "usuario")
public class Usuario {

    @Id
    private Long id;
    private String username;
    private Long[] idEventos;

}
