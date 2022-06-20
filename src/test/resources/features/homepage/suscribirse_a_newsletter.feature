# language: es

#@ignore
@newsletter
Característica: Newsletter
  Como usuario
  Quiero que el sitio web me ofrezca la opción de suscribirme a la newsletter
  Para mantenerme informado de los acontecimientos

    #=============================================================================

    Escenario: Validar suscripción a newsletter

      Dado que Verena se encuentra en la web de BlankFactor
      Cuando inscribe su correo "alexander.andrade@gmail.com" a la newsletter
      Entonces puede ver la confirmación que dice "Thank you for subscribing! Stay tuned."
