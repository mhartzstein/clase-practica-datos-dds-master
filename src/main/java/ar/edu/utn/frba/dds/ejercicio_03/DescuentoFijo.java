package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "descuento")
public class DescuentoFijo extends Decorado {
  @Column(name = "nombre_descuento")
  private String nombre_descuento;
  @Column(name="valor")
  private Double valor;

  public Double precio() {
    return this.producto.precio() - this.valor;
  }

  public DescuentoFijo() {

  }
}
