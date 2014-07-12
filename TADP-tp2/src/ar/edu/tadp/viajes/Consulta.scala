package ar.edu.tadp.viajes

class Consulta(var viajes: List[Viaje]) {
  def costoPromedioViajes(): Double = {
    var costoTotal: Double = 0
    
    for (unViaje <- viajes) {
      costoTotal = costoTotal + unViaje.calcularCosto()
    }

    return costoTotal / viajes.length
  }

  def tiempoPromedioViajes(): Double = {
    var tiempoTotal: Double = 0

    for (unViaje <- viajes) {
      tiempoTotal = tiempoTotal + unViaje.calcularTiempo()
    }
    return tiempoTotal / viajes.length
  }

  def porcentajeUtilizacion(): Double = {
    return viajes.length
  }

  def facturacionTotal(): Double = {
    var costoTotal: Double = 0

    for (unViaje <- viajes) {
      costoTotal = costoTotal + unViaje.calcularCosto()
    }

    return costoTotal
  }
}