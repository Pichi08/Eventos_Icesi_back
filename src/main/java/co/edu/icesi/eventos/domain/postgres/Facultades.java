package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Facultades")
public class Facultades {

    @Id
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "nro_telefono")
    private String nroTelefono;
    @Column(name = "id_decano")
    private String idDecano;

}
