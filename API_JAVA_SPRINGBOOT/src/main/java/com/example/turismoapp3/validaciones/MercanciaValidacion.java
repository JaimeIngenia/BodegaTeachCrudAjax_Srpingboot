package com.example.turismoapp3.validaciones;

import org.springframework.stereotype.Component;

@Component
public class MercanciaValidacion {

    public Boolean validarNombre(String nombre){

        if(nombre.length()>30){
            return false;
        }else{
            return true;
        }

    }


}
