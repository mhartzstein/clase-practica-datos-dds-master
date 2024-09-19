package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

public abstract class Decorado extends Producto{

  @ManyToOne
  @JoinColumn(name = "producto", referencedColumnName = "id")
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
