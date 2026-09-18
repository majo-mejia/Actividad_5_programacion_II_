package co.edu.uniquindio.poo.model;

public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBecado(EstudianteBecadoBuilder builder) {
        super(builder);
        this.porcentajeBeca = builder.porcentajeBeca;
    }

    @Override
    public void accederCurso() {
        System.out.println(" becado: " + nombre + " | Beca del " + porcentajeBeca + "correcto");
    }

    // utiliza el builder
    public static class EstudianteBecadoBuilder extends EstudianteBuilder {
        protected double porcentajeBeca;

        public EstudianteBecadoBuilder(String nombre, String correo) {
            super(nombre, correo);
        }

        public EstudianteBecadoBuilder porcentajeBeca(double porcentaje) {
            this.porcentajeBeca = porcentaje;
            return this;
        }

        public EstudianteBecado build() {
            return new EstudianteBecado(this);
        }
    }
}