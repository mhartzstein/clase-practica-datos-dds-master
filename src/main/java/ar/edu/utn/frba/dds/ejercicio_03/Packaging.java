package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "packaging")
public class Packaging extends Decorado{
  @Column(name = "precio")
  private Double precio;

  //* ----------------- CONSTRUCTORS ----------------- *//

  public Packaging() {
  }

  public Packaging(Double precio) {
      this.precio = precio;
  }

  //* ----------------- METHODS ----------------- *//

  public Double precio() {
    return this.producto.precio() + this.precio;
  }

}
