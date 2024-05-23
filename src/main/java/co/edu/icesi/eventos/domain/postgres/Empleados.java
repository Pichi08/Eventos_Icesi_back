package co.edu.icesi.eventos.domain.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Empleados")
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indentificacion")
    private String identificacion;
    @Column(name = "nombres")
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "tipo_contratacion")
    private String tipoContratacion;
    @Column(name = "tipo_empleado")
    private  String tipoEmpleado;
    @Column(name = "cod_facultad")
    private Integer codFacultad;
    @Column(name = "codigo_sede")
    private Integer codigoSede;
    @Column(name = "lugar_nacimiento")
    private Integer lugarNacimiento;

}
