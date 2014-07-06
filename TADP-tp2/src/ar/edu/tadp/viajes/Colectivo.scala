package ar.edu.tadp.viajes

class Colectivo(var linea: Int) extends Transporte {
  override def calcularTiempo(origen: Direccion, destino: Direccion): Double = {
    var distancia: Double = ModuloTransporte.distanciaColectivo(linea, origen, destino)

    return distancia / 250
  }

  override def calcularTarifa(origen: Direccion, destino: Direccion): Double = {
    return 2.5
  }

  override def esIgual(unTransporte: Transporte): Boolean = {
    var retVal: Boolean = false

    if (unTransporte.isInstanceOf[Colectivo]) {
      retVal = unTransporte.asInstanceOf[Colectivo].linea == this.linea
    }

    return retVal
  }

  override def calcularTiempoCombinacion(origen: Direccion, destino: Direccion, unTransporte: Transporte): Double = {
    var tiempo: Double = 0
    var distanciaEntreParadas: Double = 0

    distanciaEntreParadas = ModuloTransporte.distanciaPie(origen, destino)
    tiempo = 2.5 * distanciaEntreParadas / 100

    return tiempo
  }
}