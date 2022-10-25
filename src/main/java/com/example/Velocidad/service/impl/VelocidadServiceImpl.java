package com.example.Velocidad.service.impl;

import org.springframework.stereotype.Service;

import com.example.Velocidad.controller.VelocidadRequest;
import com.example.Velocidad.controller.VelocidadResponse;
import com.example.Velocidad.service.VelocidadService;

@Service
public class VelocidadServiceImpl implements VelocidadService {

    @Override
    public VelocidadResponse respuestaFuncionVelocidad (VelocidadRequest velocidadRequest) {
        Integer operacion1 = velocidadRequest.getxInicial() + (velocidadRequest.getVelocidadInicial()*velocidadRequest.getTiempo());
        Double operacion2 = (double) ((velocidadRequest.getAceleracion() * velocidadRequest.getTiempo()) / 2);
        Double velocidad = operacion1 + operacion2; 
        VelocidadResponse z = new VelocidadResponse(velocidad);
        return z;
    }
}

//cada campo que uso para las operaciones y que recibi en el post, esta definido en los Getters del controler como getxInicial, es tal cual a como estan alla
//z es cualquier nombre de variable

