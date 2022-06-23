# language: es

#@ignore
@author
Característica: Ver página de autor
  Como usuario
  Quiero que el sitio web me ofrezca la opción de clasificar los artículos por autor
  Para encontrar información relevante con un tópico en particular

    #=============================================================================

    Escenario: Validar página de autor

      Dado que Verena se encuentra en la web de BlankFactor
      Cuando ella busca los post de "Sofia Gonzalez"
      Entonces ella puede ver la página de autor de "Sofia Gonzalez"
