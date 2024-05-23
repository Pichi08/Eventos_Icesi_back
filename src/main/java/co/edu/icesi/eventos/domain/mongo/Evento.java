package co.edu.icesi.eventos.domain.mongo;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Document(collection = "eventos")
public class Evento {

    @Id
    private Long id;
    private String description;
    private Categorias categoria;
    private Date fecha;
    private LugarEvento lugarEvento;
    private Asistente asistente;
    private Conferencista conferencista;
    private Facilitador facilitador;
    private Facultad [] facultadesOrganizadores;
    private Comentario [] comentarios;

}
