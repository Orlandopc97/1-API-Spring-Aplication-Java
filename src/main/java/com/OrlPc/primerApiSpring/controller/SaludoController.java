package com.OrlPc.primerApiSpring.controller;

import org.springframework.web.bind.annotation.*;

/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
*/

//CONTROLLER
@RestController //Anotacion para que detecte que esta clase es un controlador (REST) API REST
@RequestMapping("/apiSaludos") //Se utiliza para englobar en un path toda la api agregando a la ruta
public class SaludoController {




    /*Generar un Endpoint =  Metodo
        *Que cuando se usa tendra una URL(Direccion), va a responder algo o hacer algo en particular
    */



    //Existen el:
    // @RequestMapping
    // @PostMapping
    // @PutMapping
    // @GetMapping
    // @DeleteMapping
    // @PatchMapping




    //END POINT
    //Metodo / End point
    //Mapeo de GET // hacer ruta para que esto se muestre en pantalla
    // poner dentro la ruta "/holaOrlando" para llegar al End Point

    @GetMapping("/holaOrlando")
    public String holaMundo(){
        return "Mensaje creado  hola Orlando en la ruta http://localhost:8080/apiSaludos/holaOrlando con @RequestMapping y @GetMapping!";
    }
    //Asi genera la ruta haste el End point por medio del GetMapping hasta lo que muestra el metodo "endpoint"
    //http://localhost:8080/hola




    //Otro tipo de metods "end point" donde se pueden recibir parametros
    //Agregar que la persona ponga su nombre y edad
    //Otro metodo, endpoint que utiliza el get

                                  //Parametros @PathVariable para establecer que son parametros que envia el usario y los recibe el end point "metodo"
                                  //Path = / , variable = varibale, Se puede mandar las variables "parametros" en la ruta separados por los path = /
    @GetMapping("/holanombre/{nombre}/{edad}")    //Para agregar las variables es =  /{variable}, por cada variable que se pida
    public String holaMundoNombre(@PathVariable String nombre, @PathVariable int edad){
        return "HOLA MUNDO!" + nombre + "tu edad es: " + edad;
        //Para ver si funciona probar con los valores en las posiciones de la ruta:
        //                      @RequestMapping@GetMapping@PathVariable(nombre)@PathVariable(edad)
        //http://localhost:8080/apiSaludos/holanombre/Orlando/27


    }

    /*
    Si el metodo del endpoint pide parametros("valores / datos / informacion") se utiliza
    la ANNOTACION @PathVariable
    *Se utiliza para que el usuario en el navegador pueda pasar datos informacion hacia el servidor por medio de
    el endpoint "metodo"


    USUARIO                              API
    NAVEGADOR ------------ End point (metodo que requiere los parametos) ------------ Bd Servidor
    (Front end)         @PathVariable ---- (Metodo Get "End point")


     */

}

