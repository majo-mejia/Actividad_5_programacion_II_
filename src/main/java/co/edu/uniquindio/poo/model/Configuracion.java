package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Configuracion {


    private static Configuracion instancia;

    private List<NuevaFuncionalidad> funciones;

    private Configuracion() {
        funciones = new ArrayList<>();
    }


    public static Configuracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    // se agrega una funcion nueva
    public void agregarFuncion(NuevaFuncionalidad funcion) {
        funciones.add(funcion);
    }


    public String obtenerValor(String nombre) {
        for (NuevaFuncionalidad funcion : funciones) {
            if (funcion.getNombre().equals(nombre)) {
                return funcion.getValor();
            }
        }
        return null;
    }


    public void cambiarValor(String nombre, String nuevoValor) {
        for (NuevaFuncionalidad opcion : funciones) {
            if (funcion.getNombre().equals(nombre)) {
                funcion.setValor(nuevoValor);
            }
        }
    }
}