package co.edu.uniquindio.poo.model;

public abstract class Estudiante {
    protected String nombre;
    protected String correo;
    protected String telefono;
    protected String direccion;
    protected String intereses;

    protected Estudiante(EstudianteBuilder builder) {
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.intereses = builder.intereses;
    }

    public abstract void accederCurso();

    // base builder de las clases hijas tambien
    public static abstract class EstudianteBuilder {
        protected String nombre;
        protected String correo;
        protected String telefono;
        protected String direccion;
        protected String intereses;

        public EstudianteBuilder(String nombre, String correo) {
            this.nombre = nombre;
            this.correo = correo;
        }

        public EstudianteBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public EstudianteBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public EstudianteBuilder intereses(String intereses) {
            this.intereses = intereses;
            return this;
        }
    }
}