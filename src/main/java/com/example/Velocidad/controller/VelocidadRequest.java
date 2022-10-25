package com.example.Velocidad.controller;

public class VelocidadRequest {
    private Integer xInicial;
    private Integer velocidadInicial;
    private Integer tiempo;
    private Integer aceleracion;

    public VelocidadRequest(Integer xInicial, Integer velocidadInicial, Integer tiempo, Integer aceleracion) {
        this.xInicial = xInicial;
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }

    public Integer getxInicial() {
        return xInicial;
    }

    public void setxInicial(Integer xInicial) {
        this.xInicial = xInicial;
    }

    public Integer getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(Integer velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }
}
