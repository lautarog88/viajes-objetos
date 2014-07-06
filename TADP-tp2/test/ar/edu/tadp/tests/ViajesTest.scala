package ar.edu.tadp.tests

import org.junit.Before
import ar.edu.tadp.viajes.Usuario
import ar.edu.tadp.viajes.Discapacitado
import org.junit.Test
import org.junit.Assert
import ar.edu.tadp.viajes.MenorCosto
import ar.edu.tadp.viajes.ModuloTransporte
import ar.edu.tadp.viajes.Direccion
import ar.edu.tadp.viajes.Viaje
import ar.edu.tadp.viajes.Tramo
import ar.edu.tadp.viajes.Colectivo
import ar.edu.tadp.viajes.Recorrido

class ViajesTest {

  @Test
  def unTramoTest() = {
    var unUsuario: Usuario = new Usuario(new Discapacitado(), MenorCosto)
    var origen: Direccion = new Direccion("Balcarce", 50, "La Boca", false)
    var destino: Direccion = new Direccion("Bolivar", 1, "La Boca", false)
    var unViaje: Viaje = new Viaje(origen, destino, unUsuario)
    var recorrido: Recorrido = unViaje.armarRecorrido()
    var tiempo: Double = unViaje.calcularTiempo()

    Assert.assertEquals(1, recorrido.tramos.length)
    Assert.assertTrue(recorrido.tramos.head.transporte.isInstanceOf[Colectivo])
    Assert.assertEquals(30, tiempo)
  }

  @Test
  def dosTramosTest() = {
    var unUsuario: Usuario = new Usuario(new Discapacitado(), MenorCosto)
    var origen: Direccion = new Direccion("Balcarce", 50, "La Boca", false)
    var destino: Direccion = new Direccion("Bolivar", 1, "La Boca", false)
    var unViaje: Viaje = new Viaje(origen, destino, unUsuario)
    var recorrido: Recorrido = unViaje.armarRecorrido()

    Assert.assertEquals(1, recorrido.tramos.length)
    Assert.assertTrue(recorrido.tramos.head.transporte.isInstanceOf[Colectivo])
  }
}