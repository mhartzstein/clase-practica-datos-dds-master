package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto_simple")
public class ProductoSimple extends Producto{
  @Column(name = "precio")
  private Double precio;
  @Column(name = "stock")
  private Integer stock;

  public Double precio() {
    return this.precio;
  }

  public Integer stock() {
    return this.stock;
  }

  public ProductoSimple() {

  }

}
