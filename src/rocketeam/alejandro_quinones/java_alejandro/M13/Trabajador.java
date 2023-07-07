package rocketeam.alejandro_quinones.java_alejandro.M13;



    public class Trabajador {
        private String Nombres;
        private String Apellidos;
        private String RUN;
        private String  Telefono;
        private int Edad;

        public Trabajador() {

        }

        public Trabajador(String nombres, String apellidos, String RUN, String telefono, int edad) {
            Nombres = nombres;
            Apellidos = apellidos;
            this.RUN = RUN;
            Telefono = telefono;
            Edad = edad;
        }

        public String getNombres() {
            return Nombres;
        }

        public void setNombres(String nombres) {
            Nombres = nombres;
        }

        public String getApellidos() {
            return Apellidos;
        }

        public void setApellidos(String apellidos) {
            Apellidos = apellidos;
        }

        public String getRUN() {
            return RUN;
        }

        public void setRUN(String RUN) {
            this.RUN = RUN;
        }

        public String getTelefono() {
            return Telefono;
        }

        public void setTelefono(String telefono) {
            Telefono = telefono;
        }

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int edad) {
            Edad = edad;
        }

        @Override
        public String toString() {
            return "Nombres='" + Nombres + '\'' +
                    ", Apellidos='" + Apellidos + '\'' +
                    ", RUN='" + RUN + '\'' +
                    ", Telefono='" + Telefono + '\'' +
                    ", Edad=" + Edad;
        }

        public String nombreCompleto() {
            return Nombres + " " + Apellidos;
        }
        public int descomponerRun() {
            String[] partes = RUN.split("-");
            return Integer.parseInt(partes[0].replace(".", ""));
        }
    }
