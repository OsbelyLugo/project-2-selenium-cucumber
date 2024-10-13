#language:es
@register

Característica: Nuevo Registro
  Se realiza el registro de nuevos usuarios

  Antecedentes:
    Dado El visitante esta en la pagina de registro "http://localhost:3000/#/register"

  Esquema del escenario: Registro de nuevos usuarios
    Cuando el visitante complete la informacion "<email>" "<password>" "<repeatPassword>" "<securityAnswer>"
    Y el visitante hace click en registrarse
    Entonces deberia tener su cuenta creada

    Ejemplos:
      |email|password|repeatPassword|securityAnswer|
      |pruebaosbe03@test.com|Pass1234|Pass1234|PruebasTest|
