package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Areas")
public class Areas {

    @Id
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "codigo_facultad")
    private Integer codigoFacultad;
    @Column(name = "id_coordinador")
    private String idCoordinador;

}
