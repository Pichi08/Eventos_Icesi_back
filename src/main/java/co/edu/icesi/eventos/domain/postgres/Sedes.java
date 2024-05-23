package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;

@DataAmount
@Entity
@Table(name = "Sedes")
public class Sedes {

    @Id
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cod_ciudad")
    private Integer codCiudad;

}
