package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue
    protected long id;
    @Column(name = "nombre")
    protected String nombre;
}
