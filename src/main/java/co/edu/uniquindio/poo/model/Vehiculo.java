package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public interface IVehiculo {
    Vehiculo clonar();
}

public class Vehiculo implements IVehiculo {

    private String tipo;
    private String placa;
    private String color;
    private int capacidad;
    private List<String> accesorios;

    private Vehiculo(VehiculoBuilder builder) {
        this.tipo = builder.tipo;
        this.placa = builder.placa;
        this.color = builder.color;
        this.capacidad = builder.capacidad;
        this.accesorios = new ArrayList<>(builder.accesorios);
    }

    private Vehiculo(Vehiculo prototipo) {
        this.tipo = prototipo.tipo;
        this.placa = prototipo.placa;
        this.color = prototipo.color;
        this.capacidad = prototipo.capacidad;
        this.accesorios = new ArrayList<>(prototipo.accesorios);
    }

    @Override
    public Vehiculo clonar() {
        return new Vehiculo(this);
    }

    public static class VehiculoBuilder {

        private String tipo;
        private String placa;
        private String color = "N/A";
        private int capacidad = 1;
        private List<String> accesorios = new ArrayList<>();

        public VehiculoBuilder(String tipo, String placa) {
            this.tipo = tipo;
            this.placa = placa;
        }

        public VehiculoBuilder conColor(String color) {
            this.color = color;
            return this;
        }

        public VehiculoBuilder conCapacidad(int capacidad) {
            this.capacidad = capacidad;
            return this;
        }

        public VehiculoBuilder agregarAccesorio(String accesorio) {
            this.accesorios.add(accesorio);
            return this;
        }

        public Vehiculo construir() {
            return new Vehiculo(this);
        }
    }
}