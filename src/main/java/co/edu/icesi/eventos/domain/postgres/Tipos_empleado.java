package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;

@DataAmount
@Entity
@Table(name = "Tipos_empleado")
public class Tipos_empleado {

    @Id
    @Column(name = "nombre")
    private String nombre;


}
