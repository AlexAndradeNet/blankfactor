# language: es

#@ignore
@postlist
Característica: Obtener lista de post y sus enlaces
  Como usuario
  Quiero obtener un listado de los post del blog y sus links
  Para tener una relación

    #=============================================================================

    Escenario: Lista de posts

      Dado que Verena se encuentra en la web de BlankFactor
      Cuando solicita una lista de los post promocionados
      Entonces obtiene una lista que relaciona los posts y sus enlaces
