package com.example.Velocidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Velocidad.service.VelocidadService;

@RestController
@RequestMapping( "/velocidad" )
public class VelocidadController {
    private final VelocidadService x; 
    public VelocidadController( @Autowired VelocidadService y) {
        this.x = y; 
    }  
    
//velocidad -> es cualquier nombre y así lo debo invocar en postman, ejm: localhost:8080/velocidad
// x -> es cualquier nombre de vble        
//y-> es cualquier nombre de vble          
// x la llame en private final, aca en el this la debo poner igual                                

    @PostMapping
    public ResponseEntity<VelocidadResponse> abc(@RequestBody VelocidadRequest m){
                return ResponseEntity.ok(x.respuestaFuncionVelocidad(m));
     }

//ResponseEntity debe ser igual a como lo defini en el VelicidadService
//x es como la llame en private fnal
//abc es cualquier nombre de funcion 
//m es cualquier nombre de funcion 
//respuestaFuncionVelocidad es como lo llame en el Impl y la vble es como la recibo en el public ResponseEntity
   
}

