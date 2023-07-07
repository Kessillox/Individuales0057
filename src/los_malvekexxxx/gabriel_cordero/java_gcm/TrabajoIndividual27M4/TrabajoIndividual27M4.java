package los_malvekexxxx.gabriel_cordero.java_gcm.TrabajoIndividual27M4;

public class TrabajoIndividual27M4 {


        private String nombre1;
        private String nombre2;
        private String apellido1;
        private String apellido2;
        private String run;
        private String runFamiliar;
        private String Parentesco;
        private int edad;

        public TrabajoIndividual27M4() {
        }

        public TrabajoIndividual27M4(String nombre1, String nombre2, String apellido1, String apellido2, String run, String runFamiliar, String parentesco, int edad) {
            this.nombre1 = nombre1;
            this.nombre2 = nombre2;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.run = run;
            this.runFamiliar = runFamiliar;
            Parentesco = parentesco;
            this.edad = edad;
        }

        public String getNombre1() {
            return nombre1;
        }

        private void setNombre1(String nombre1) {
            this.nombre1 = nombre1;
        }

        public String getNombre2() {
            return nombre2;
        }

        private void setNombre2(String nombre2) {
            this.nombre2 = nombre2;
        }

        public String getApellido1() {
            return apellido1;
        }

        private void setApellido1(String apellido1) {
            this.apellido1 = apellido1;
        }

        public String getApellido2() {
            return apellido2;
        }

        private void setApellido2(String apellido2) {
            this.apellido2 = apellido2;
        }

        public String getRun() {
            return run;
        }

        private void setRun(String run) {
            this.run = run;
        }

        public String getRunFamiliar() {
            return runFamiliar;
        }

        private void setRunFamiliar(String runFamiliar) {
            this.runFamiliar = runFamiliar;
        }

        public String getParentesco() {
            return Parentesco;
        }

        private void setParentesco(String parentesco) {
            Parentesco = parentesco;
        }

        public int getEdad() {
            return edad;
        }

        private void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "CargaFamiliar{" +
                    "nombre1='" + nombre1 + '\'' +
                    ", nombre2='" + nombre2 + '\'' +
                    ", apellido1='" + apellido1 + '\'' +
                    ", apellido2='" + apellido2 + '\'' +
                    ", run='" + run + '\'' +
                    ", runFamiliar='" + runFamiliar + '\'' +
                    ", Parentesco='" + Parentesco + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }

