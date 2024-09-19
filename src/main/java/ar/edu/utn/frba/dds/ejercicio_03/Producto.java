package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Producto {
  @Id
  @GeneratedValue
  protected long id;
  @Column(name = "nombre", nullable = false)
  protected String nombre;
  @ManyToOne
  @JoinColumn(name = "marca", nullable = false, referencedColumnName = "id")
  protected Marca marca;

  public Producto() {

  }

  public Double precio() {

      return 0.0;
  }

  public Integer stock() {

      return 0;
  }
}
