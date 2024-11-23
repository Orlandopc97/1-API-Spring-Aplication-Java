package com.OrlPc.primerApiSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Este main va a ejecutar esta aplicacion de SPRING BOOT
@SpringBootApplication
public class PrimerApiSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimerApiSpringApplication.class, args);
	}

}


/*
                                DESARROLLO WEB

CÓMO TRABAJA LA WEB:
    -La web se basa en PETICIONES o CONSULTAS de un CLIENTE hacia un SERVIDOR WEB.
    -El CLIENTE se comunica con un SERVIDOR mediante un PROTOCOLO "HTTP" (PROTOCOLO DE TRANSFERENCIA DE HIPERTEXTO)
    -Mediante este PROTOCOLO, el cliente realiza CONSULTAS (REQUESTS) y recibe RESPUESTAS (RESPONSES)

    ARQUITECTURA CLIENTE-SERVIDOR

        cliente "computadora, sistema, persona"(navegadores= crhome, mozilla, explorer), consume los servicios que ofrece otro dispositivo

        "computadoras = servidor (servidor base de datos, servidor web) -> servicios

        servidores(clientes) consumen servicios de otros servidores
                sistema -sistema
                sistema -bd
                        -servidor web
        SERVIDOR: computadora o computadoras que interactuan y actuan ofreciendo servicio

frontend comunmente                         backend

                    "SOLICITUDES"
                    HTTP REQUEST "CONSULTA"
             ------------------------------>
    CLIENTE             Internet              SERVIDOR
             <------------------------------
                    HTTP RESPONSE "RESPUESTA"


    *CLIENTES Y SERVIDORES

                    "SOLICITUDES"
                    HTTP REQUEST "CONSULTA"
             ------------------------------>
    CLIENTE             Internet              SERVIDOR
  (navegador)      (Puede ser red local)    (computadora en algun lado)
             <------------------------------
                    HTTP RESPONSE "RESPUESTA"
        Clientes:
            -En un arquitectura Cliente-Servidor,un navegador es la representacion de un cliente
            que solicita pedidos a un servidor.
            -El cliente "NAVEGADOR" comprende (interpreta) las respuestas provenientes del servidor, las
            interpreta y muestra en pantalla al usuario.

        Servidores:
            -SERVIDOR WEB o SERVIDOR HTTP representa al servidor que se encarga de procesar los pedidos de
            distintos clientes (incluso al mismo tiempo) en una aplicación web.
            -Tiene la capacidad de recibir y administrar pedidos, para determinar la respuesta a enviar.

    HTTP Y HTTPS

    HTTP: NO TIENE SEGURIDAD ALGUNA (RED LOCAL)
    HTTPS: TIENE SEGURIDAD DE CERTIFICADO SSL "SSL CERTIFICATE" (INTERNET)
        -La conexión esta encriptada, los datos no son visibles y hacer que sea seguro el renvio de estos.

    LAS URLS =  "ENDPOINTS" = DIRECCIONES
        -URL: Uniform Resource Locator (Localizador de recursos uniformes)
        -ENDPOINTS forman parte de las APIS
        -ENDPOINT = DIRECCION = URL , donde se encuentran los RECURSOS del SERVIDOR que son CONSUMIDOS por el CLIENTE.

            Ejemplo: Una persona quiere dar de alta un usuario.
                -Hay un Endpoint dentro del codigo que tiene una Url en particular "especifica para este funcionamiento"
                -El cliente la va a consumir del servidor (estos endpoints), lo consume y tendra una respuesta

                        URL : La peticion del cliente va dentro de la url
CLIENTE (REQUEST)-------------------> SERVIDOR (LA RECIBE EN UNA URL)
                <------------------- PROCESA LA PETICION
                                     (RESPONSE)
recibe la respuesta               Cada endpoint cada accion que se hace, tiene sus metodos y contesta



    LA URL ESTA COMPUESTA POR:

           SUBDOMINIO   EXTENSIÓN  RUTA             PROTOCOLO : HTTP / HTTPS
               ----       ----  -----               SUBDOMINIO: WWW u otros
        http://www.google.com.ar/hola               NOMBRE DEL DOMINIO: GOOGLE, el que haya adquirido la persona particular
        ------     ------     ---                   EXTENCIÓN: COM / MX, ETC
      PROTOCOLO    NOMBRE   GEOLOCALIZACIÓM         GEOLOCALIZACIÓN: AR, es para que la pagina web se centre en una ragion geografica especifica
                     DEL                            RUTA: /HOLA, es lo que se utiliza para los endpoints
                   DOMINIO




REQUEST (solicitud):
    -Se realiza en una comunicación que utiliza el protocolo HTTP tiene una serie de partes,
    cada parte cumple con una funcionalidad distinta respecto a la transmicion del mensaje que se desea conocer
    desde el cliente hacia el servidor.
    TIENE 4 PARAMETROS PRINCIPALES:

    *MÉTODO:    GET, POST, PUT, PATCH, DELETE, ETC.
        -Depende de que acción se quiera hacer se utiliza uno u otro metodo
        -Consumir o cosulta informacion se utiliza el metodo GET (traer)
        -Para hacer un guardado de datos se utiliza el metodo de POST (postea) da de alta información
    *URL
        -Una direccion a la que va destinada  /hola?id=5
    *HEADER O CABECERA
        -Cabecera donde puede ir informacion
    *BODY O CUERPO
        -Va la informacion que se maneje por ejemplo un POST es para guardar datos


                                REQUEST LINE ----------> | METHOD | sp | URL | sp | VERSION | cr | if |
                                           |------------>| header field name: | sp | value | cr | if |
                                HEADER LINE|             |                                           |
                                           |------------>| header field name | sp | value | cr | if  |
                                BLANK LINE ------------> | cr | if |
                                           |------------>|-------------------------------------------|
                                ENTITY BODY|             |                                           |
                                           |------------>|------------------------------------------ |

Despues de recibir la request (solicitud), la decodifica y se tiene que generear una respuesta (response)

RESPONSE (RESPUESTA):
    -Las RESPONSE en el protocolo HTTP, tienen un formato praticular para transportar la informacion necesaria
    para atender a las resquest (solicitudes) recibidas:

    *STATUS CODES: (los mas importantes) (verificadas por medio de excepciones)
        *Codigos de rango 100
        *Codigos de rango 200
                          OK
        *Codigos de rango 300
        *Codigos de rango 400
                          404 Not Found ejemplo
        *Codigos de rango 500
                            Error en el servidor
    *HEADER O CABECERA
        -Cabecera donde puede ir informacion
    *BODY O CUERPO
        -Va la informacion que se maneje, por ejemplo los datos de respuesta del servidor

                                STATUS LINE ----------> | VERSION | sp | STATUS CODE | sp | PHRASE | cr | if |
                                           |------------>| header field name: | sp | value | cr | if |
                                HEADER LINE|             |                                           |
                                           |------------>| header field name | sp | value | cr | if  |
                                BLANK LINE ------------> | cr | if |
                                           |------------>|-------------------------------------------|
                                ENTITY BODY|             |                                           |
                                           |------------>|------------------------------------------ |


MÉTODOS HTTP
                                             FUNCIONALIDAD:
    GET = TRAER / OBTENER:       -Pedir informacion al servidor y que nos lo traega, operaciones de lectura estan
                                 asocioadas al metodo GET.
                                 -Solicita una representación de un recurso especifico.
                                 -Las peticiones que usan el metodo GET solo deben recuperar datos.

    POST = POSTEAR /PUBLICAR:    -Cuando se producen cambios de estado en el servidor, dar de alta algo nuevo (registros /informacion)
                                 -Se utiliza para enviar una entidad a un recurdo en especifico (causando un cambio o efectos.
                                 secundarios en el servidor).
                                 -Nuevo registro / Crear nueva informacion.

    PUT = PONER / Reemplazar:    -Se utilizar para reemplazar información / modificaciones de recursos en el servido.
                                 -Actualizaciones.
                                 -Reemplazar las representaciones actuales del recurso de destino con la carga util de la petición.

    DELETE = ELIMINAR / BORRAR:  -Nos permite borrar recursos en especifico.

    PATCH = PARCHE:              -EL PATCH es similara al PUT, tiene ciertas ventajas y desventajas.
                                 -Es utilizado para aplicar modificaciones parciales a un recurso.





    APIs (APLICATION PROGRAMMING INTERFACE = Interfaz de programación de aplicaciones)


                                     APis (Utilizan un lenguaje universal JSON)
                    UNA PARTE----------------------INTERFACE-------------------------------OTRA PARTE
                                             ES UN PUNTO DE INTERCONECCION
EJEMPLO:            FRONT-END------------Como se comunica el front con el back-------------BACK-END
                    html----------------------------JSON-------------------------------------java
                    css          (Es un formato de archivo que tiene clave-valor)
                                                (NOMBRE: VALOR)
                                                    EDAD: 23

        API: -Es un conjunto de funciones y procedimientos (métodos) que se usan para diseñar e integrar
             el softwarede diferentes aplicaciones.
             -Permiten que varias aplicaciones se puedan comunicar entre si, por mas que estén
             desarrolladas en lenguajes de programación completamente distintos.


                                        API
     FRONT END------------------------- JSON----------------------------- APLICACIONES DESARROLLADAS EN DISTINTOS
     OTRAS INTERFACES GRAFICAS                                                    LENGUAJES DE PROGRAMACION

     APLICACIONES----------------------API-----------------------------APLICACIONES




REST (REPRESENTATIONAL STATE TRANSFER = TRANSFERENCIA DE ESTADO REPRESENTACIONAL):

    Rest-- Es un tipo de servicio que se caracteriza por no tener estado alguno y por lograr
    interconexiones mediante el protocolo HTTP con mensajes de tipo XML o JSON.
    -La forma más común de implementacion de una API es mediante REST.


                        NO posee estado = se mandan las REQUEST Y RESPONSE no se quedan guardadas solo se transfieren
                        y al final responden con un estado del protocolo
        BACK
    (SERVIDOR)     GET/POST/PUT
    (NAVEGADOR)    DELETE/PATCH                                     (SERVIDOR)
              ------------------>           ---------------------->
    CLIENT        (RESQUEST)       REST API        (RESPONSE)           DB
              <-----------------            <----------------------
                    JSON

        Antes se utilizaba XML y ahora JSON



SPRING (FRAMEWORK) (SPRING PLATFORM):
    -Es un conjunto de proyectos open source desarrollados en java con el objetivo de agilizar el proceso de desarrollo
    de aplicaciones.
    Cuenta con una cantidad de HERRAMIENTAS que tiene como objetivo facilitar el trabajo de los desarrolladores

    HERRAMIENTAS:
        *SPRINGBOOT
        *SPRINGDATA
        *SPRINGSECURITY
        *HERRAMIENTAS PARA TESTEAR

SPRINGBOOT : Es una herramienta dentro de SPRING.

    -Nos facilita el seteo de una aplicación desarrollada con SPRING
    -Es una extensión del FRAMEWORK SPRING que tiene como finalidad simplificar la creación y configuración
    inicial de aplicaciones web.
    -Solo necesita una configuracion básica, que PERMITE el uso de LIBRERÍAS, integración con otras herramientas
    o incluso otros proyectos de SPRING.
    (POR ESO EL SIMBOLO DE ENCENDER (INICIALIZAR))



SPRING FRAMEWORK - MAS SERVIDOR ENBEBIDO - MENOS CONFIGURACION XML    == SPRING BOOT
                  SERVIDOR ENBEBIDO TOMCAT   SIN CONFIGURACION XML
SOLO SE TIENE QUE DESARROLLAR LOS ENDPOINTS, YA NO SE HACEN LAS CONFIGURACIONES



SPRING INITIALAIZER (APLICACIÓN WEB)

    SE HACE LAS CONFIGURCIONES INICIALES BASICAS:

        *PROJECT: SELECCIONAR EL GESTOR DE DEPENDENCIAS A UTILIZAR
            GESTOR DE DEPENDENCIAS NPM: ES EL LUGAR DONDE VAN TODAS LAS LIBRERIAS Y HERRAMIENTAS QUE NECESITAMOS Y
            (MAVEN, GRADLE) QUE SE UTILIZA COMO HERRAMIENTA PARA DESCARGAR (LIBRERIAS)

        *LENGUAJE
            *JAVA
            *KOTLIN
            *GROOVY

        *SPRINBOOT:
            VERSION ESTABLE 3.2.1
            VERSIONES MAS NUEVAS(SNAPSHOT)

        *PROJECT METADATA(DATOS DEL PROYECTO):

            *GROUP: La URL QUE VA A TENER LA WEB, iniciando al reves com.example "com.OrlPC"
            *ARTIFACT: NOMBRE DEL PROYECTO, ejemplo loginApi
            *NAME: lo mismo que artifact
            *DESCRIPTION:DESCRIPCION DEL PROYECTO (Demo project for Spring Boot)
            *PACKAGE NAME: Se va construyendo automaticamente con los campos anteriores llenos
            *PACKAGING(EMPAQUETADO):JAR /WAR, el mas usado es el tipo JAR
            *JAVA (VERSION): 21 o 17, viene seleccionada la mas estable

        *ADD DEPENDENCIES:
            *SPRING WEB (Mas importante) Build web, including RESTful, aplications using SPRING MVC,
            Uses Apache Tomcat as the default embedded container.

            MAS UTILIZADAS
            lombok (anotaciones clasicas para simplificar codigo)
            Devtools

    *GENERATE (Crea el proyecto, se descarga, descomprime y abre en el id )

	*Verificar si todas las dependancias estan bien.
	*Cuando se ejecuta la aplicacion aparece la version de springboot, el servidor embebido tomcat y mas informacion
	Tomcat started on port 8080

	Whitelabel Error Page
	This application has no explicit mapping for /error, so you are seeing this as a fallback.

	Sat Sep 28 19:14:43 CST 2024
	There was an unexpected error (type=Not Found, status=404). <--- codigo

	MODELO MVC para IMPLEMENTAR los CONTROLLERS que van a ser DONDE ESTAN LOS END-POINTS




MODELO MVC (MODELO VISTA CONTROLADOR):

	*PATRON de DISEÑO DE SOFTWARE o ARQUITECTURA
	*Permite una separación entre la LÓGICA de negocio de una aplicación y la VISTA que se le presenta al usuario
	*Utiliza como intermediario a un CONTROLADOR que se encarga de tomar la decisión de como interactúan la vista
	y el modelo entre si.

							  RECIBE LAS RESQUEST
				VISTA -------------CONTROLADOR----------------LOGICA DE NEGOCIO
			PARA EL USUARIO

	MODELADO = CLASES
	CONTROLADORES -> INTERCONECTAR EL MODELO CON LA VISTA
	VISTA = FRONT-END
	CONTROLADOR RECIBE LAS REQUEST DEL CLIENTE Y SE ENCARGA DE DETERMINAR A DONDE VA

	ESTA COMPUESTO POR:
		*Controlador
		*Modelo
		*Vista


				  CLIENTE (REQUEST "PETICION")
					🔼			 	         \    ️
			         \			               \ Petición
	 	Respuesta	  \					         \
		 Grafica	   \  	   			   		   \
						\  	  						◀️			 Transferencia de Datos
						VISTA()◀️-----------------CONTROLADOR◀️-------------------------▶️ MODELO
			Front-end			   Respuesta		|											modelado de clases
													|											logica de negocio
													|
													|
						DIRIGIRLA HACIA DONDE VA DIRIGIDO DENTRO DEL MODELO


	Aplicación de SpringBoot: Un controlador que reciba solicitudes get y en base a eso genere resuesta.

	*GENERAR ESTRUUCTURA DE PAQUETES para el MODELO VISTA CONTROLADOR (MVC)
	*Crear package para los controladores
	*Crear la clase para 1 controller (saludos): java.class SaludoController

	CONTROLLER
		@RestController
			*Anotacion para que detecte que la CLASE es un CONTROLADOR (REST) API REST


		Existen el:
		* @RequestMapping = MAPEO DE SOLICITUDES
			*Permite crear un pack general para toda la API (@RequestMapping("/apiSaludos"))
			*Engloba toda esta api en un una ruta generica para esta api especifica.
			*Se utiliza por si existen varios controladores y cada uno tenga su propio path(agrupar los end points"metodos")
		* @PostMapping
		* @PutMapping
		* @GetMapping Mapeo de METODO GET // hacer ruta   //@GetMapping("/holaOrlando") // poner dentro la ruta "/holaMundo" para llegar al End Point
			*Asi genera la ruta haste el End point por medio del GetMapping hasta lo que muestra el metodo "endpoint"
			*http://localhost:8080/hola/orlando
		* @DeleteMapping
		* @PatchMapping


		*@RequestParam
		*@RequestBody
										****************************
CONTROLLER-------------------LOGICA DE NEGOCIO
RUTA
END POINT METODO

    Si el metodo del endpoint pide parametros("valores / datos / informacion") se utiliza
    la ANNOTACION @PathVariable
    *Se utiliza para que el usuario en el navegador pueda pasar datos informacion hacia el servidor por medio de
    el endpoint "metodo"


    USUARIO                              API
    NAVEGADOR ------------ End point (metodo que requiere los parametos) ------------ Bd Servidor
    (Front end)         @PathVariable ---- (Metodo Get "End point")





*/
