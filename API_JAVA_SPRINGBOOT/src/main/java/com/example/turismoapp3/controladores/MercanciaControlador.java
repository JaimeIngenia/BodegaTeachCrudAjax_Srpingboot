package com.example.turismoapp3.controladores;

import com.example.turismoapp3.modelos.Mercancia;
import com.example.turismoapp3.servicios.MercanciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mercancia")
public class MercanciaControlador {
    @Autowired
    MercanciaServicio  objetoMercanciaServicio;

    @PostMapping
    public ResponseEntity<?> registrarMercancia(@RequestBody Mercancia datosMercancia){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoMercanciaServicio.registrarMercancia(datosMercancia));

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editarMercancia(@RequestBody Mercancia datosNuevosEmpresa, @PathVariable Integer id){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoMercanciaServicio.modificarMercancia(id,datosNuevosEmpresa));

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }


    @GetMapping
    public ResponseEntity<?> buscarTodasMercancias(){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoMercanciaServicio.buscarTodasMercancias());

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarUnaMercancia(@PathVariable Integer id){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoMercanciaServicio.buscarMercanciaPorId(id));

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarMercancia(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(objetoMercanciaServicio.eliminarMercancia(id));

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }


}
