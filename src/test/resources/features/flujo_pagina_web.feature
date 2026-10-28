#language:es

Característica: Interacción pagina webshop
  Como usuario de la aplicacion webShop
  Quiero Poder interactuar correctamente en la pagina webshop
  Para validar su correcto funcionamiento

  Escenario: Registro de usuario exitoso
    Dado Que el usuario ingresa a la aplicación
    Cuando el usuario realiza correctamente el registo
    Entonces debe aparecer un mensaje de registro exitoso

  Escenario: Completar proceso de compra
    Dado Que el usuario ingresa a la aplicación
    Y se registra con el correo kevinPrueba@gmail.com y contraseña Prueba123##
    Cuando Agrega un producto al carrito
    Y termina el proceso de compra
    Entonces debe aparecer un mensaje indicando que la compra fue correcta


