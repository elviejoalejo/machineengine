package com.uniandes.machineengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

import com.uniandes.machineengine.pojo.*;

@SpringBootApplication
@RestController
public class Emparejamiento {
  private List<OrdenVenta> listaOrdenesVenta;

  @RequestMapping("/")
  public String inicio() {
    return "<H1>Bienvenido al sistema de Emparejamiento</H1>";
  }

  @RequestMapping("/emparejar")
  public Callable<String> emparejar() {

    return new Callable<String>() {
      @Override
      public String call() {
        {
          listaOrdenesVenta = cargarListaOrdenesVentaDisponibles();
          // System.out.println(new Date()+ "Start") ;
          // Crea un timer que se dispara después de x tiempo
          long simuladorPersistencia = simuladorPersistencia();
          try {
            Thread.sleep(simuladorPersistencia);
          } catch (InterruptedException e) {
            actualizarOrdenesVentaPendiente();
          }
          return "Emparejamiento realizado satisfactoriamente";
        }
      }
    };
  }

  public List<OrdenVenta> cargarListaOrdenesVentaDisponibles() {
    return null;
  }

  
  public void cambiarEstadoOrden(OrdenVenta orden, EEstado estado) {
  }

  public void actualizarOrdenesVentaPendiente() {
    System.out.println("actualizando ordendes de venta a pendiente");
    for (OrdenVenta ordenVenta : listaOrdenesVenta) {
      
    }
  }

  /**
   * Calcula el tiempo de ejecucion de una operacion de persitancia.
   * 
   * @return un valor aleatorio de 20 a 40 milisegundos
   */
  public long simuladorPersistencia() {
    return 20 + (long) (20 * Math.random());
  }

  public static void main(String[] args) {
    SpringApplication.run(Emparejamiento.class, args);

  }

}