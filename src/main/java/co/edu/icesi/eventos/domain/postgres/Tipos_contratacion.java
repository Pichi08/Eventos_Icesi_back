package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Tipos_contratacion")
public class Tipos_contratacion {

    @Id
    @Column(name = "nombre")
    private String nombre;

}
