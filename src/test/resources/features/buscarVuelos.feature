#language: es

  @stories

Característica: Realizar busqueda de los vuelos
  Yo como usuario
  Quiero buscar vuelos
  para viajar

  @scenario1

  Escenario: Busqueda de vuelos exitosa
    Dado que Andres quiere buscar vuelos en la pagina de avianca
    Cuando busca vuelos
    Entonces se debe visualizar en el cuerpo de la pagina Selecciona tu vuelo de ida
