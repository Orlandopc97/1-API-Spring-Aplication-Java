Esta es una API RESTful desarrollada con Spring Framework y Spring Boot, diseñada para manejar solicitudes GET que reciben un nombre y una edad a través de parámetros en la URL. La API responde con un mensaje de saludo personalizado, utilizando esos datos proporcionados por el usuario.

Características principales:
  -Frameworks Utilizados: La API se basa en Spring Boot para facilitar la creación y configuración de la aplicación, utilizando las capacidades de Spring Web para exponer el controlador y      manejar las solicitudes HTTP de tipo GET.

  -Uso de @GetMapping y @PathVariable: La API utiliza @GetMapping para manejar solicitudes GET y @PathVariable para extraer dinámicamente los valores de los parámetros proporcionados en la     URL, como el nombre y la edad del usuario.

  -Respuesta Personalizada: La API construye una respuesta en texto plano o JSON, saludando al usuario de forma personalizada utilizando los datos de la solicitud (nombre y edad).

  Ejemplo de solicitud y respuesta:
      -Solicitud: GET /apiSaludos/holanombre/{nombre}/{edad}
      -Respuesta: "HOLA MUNDO!" + Orlando + "tu edad es: " + 27;


Práctica para uso didáctico
