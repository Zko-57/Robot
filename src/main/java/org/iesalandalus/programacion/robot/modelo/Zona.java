package org.iesalandalus.programacion.robot.modelo;

public record Zona(int ancho, int alto) {
    public static final int ANCHO_MINIMO = 50;
    public static final int ANCHO_MAXIMO = 100;
    public static final int ALTO_MINIMO = 50;
    public static final int ALTO_MAXIMO = 100;


    public Zona( int ancho, int alto){

    }

    public Zona(){

    }

    private void validarAncho( int ancho){


    }

    private void validarAlto( int alto){

    }

    public Coordenada getCentro(){

    }

    public boolean pertenece( Coordenada coordenada){

    }

    private boolean perteneceX( int x){

    }

    private boolean perteneceY( int y){

    }


}
