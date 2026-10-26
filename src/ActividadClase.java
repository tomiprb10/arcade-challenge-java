public class ActividadClase {
    static void main() {
        // Arreglos de una dimensión
            // 1. Nombres
                String[] nombrePersona = new String[3];
                nombrePersona[0] = "Tomás";
                nombrePersona[1] = "Andrés";
                nombrePersona[2] = "Juan";

            // 2. Documento
                int[] numFicha = new int[3];
                numFicha[0] = 3412760;
                numFicha[1] = 3412157;
                numFicha[2] = 3307458;

            // 3. Saldo
                int[] saldoTotal = new int[4];
                saldoTotal[0] = 1_000_000;
                saldoTotal[1] = 5_600_000;
                saldoTotal[2] = 2_100_000;
                saldoTotal[3] = 3_250_000;

            // 4. Cargo
                String[] cargoPersona = new String[3];
                cargoPersona[0] = "Supervisor";
                cargoPersona[1] = "Gerente";
                cargoPersona[2] = "Director Ejecutivo";

            // 5. Nota
                float[] notaEstudiante = new float[3];
                notaEstudiante[0] = 3.2f;
                notaEstudiante[1] = 5.0f;
                notaEstudiante[2] = 2.2f;

        // Arreglos de dos dimensiones
            // 1. Materias Vistas
                String[][] materiasVistasProfesor = new String[5][2];
                materiasVistasProfesor[0][0] = "Python";
                materiasVistasProfesor[0][1] = "Edison Suarez";

                materiasVistasProfesor[1][0] = "Matemáticas";
                materiasVistasProfesor[1][1] = "Boris Gómez";

                materiasVistasProfesor[2][0] = "JavaScript";
                materiasVistasProfesor[2][1] = "Cristian Acevedo";

                materiasVistasProfesor[3][0] = "SQL";
                materiasVistasProfesor[3][1] = "Paula Galvis";

                materiasVistasProfesor[4][0] = "NodeJS";
                materiasVistasProfesor[4][1] = "Juan Zapata";

            // 2. Nombre y raza de perro.
                String[][] perroRaza = new String[3][2];
                perroRaza[0][0] = "Teo";
                perroRaza[0][1] = "Beagle";

                perroRaza[1][0] = "Zeus";
                perroRaza[1][1] = "Pitbull";

                perroRaza[2][0] = "Max";
                perroRaza[2][1] = "Golden Retreaver";

            // 3. Datos Personas
                String[][] datosPersona = new String[2][3];
                datosPersona[0][0] = "Camilo López";
                datosPersona[0][1] = "Casado";
                datosPersona[0][2] = "Estrato 4";

                datosPersona[1][0] = "Jessica Márquez";
                datosPersona[1][1] = "Unión Libre";
                datosPersona[1][2] = "Estrato 1";

            // 4. Celular - Número
                String[][] celularNumero = new String[3][2];
                celularNumero[0][0] = "iPhone 12 Pro";
                celularNumero[0][1] = "3189978322";

                celularNumero[1][0] = "Samsung A44";
                celularNumero[1][1] = "3122945599";

                celularNumero[2][0] = "Poco XF 34";
                celularNumero[2][1] = "3170983445";


            // 5. Inventario
                String[][] productoInventario = new String[4][2];
                productoInventario[0][0] = "Leche Entera colanta 1L";
                productoInventario[0][1] = "Lacteos";

                productoInventario[1][0] = "Cuido ringo adultos";
                productoInventario[1][1] = "Cuidado Animal";

                productoInventario[2][0] = "Arroz Roa 1KG";
                productoInventario[2][1] = "Granos";

                productoInventario[3][0] = "Jabón palmolive";
                productoInventario[3][1] = "Aseo";

        // Arreglos de tres dimensiones
            // 1. Datos de estudiante
                String[][][] datosEstudiante = new String[3][2][2];
                datosEstudiante[0][0][0] = "Tomás";
                datosEstudiante[0][0][1] = "1234567890";

                datosEstudiante[0][1][0] = "Yuliana";
                datosEstudiante[0][1][1] = "1234567891";

                datosEstudiante[1][0][0] = "Angela";
                datosEstudiante[1][0][1] = "1234567892";

            // 2. Notas por Periodo
            String[][][] notasPeriodo = new String[2][2][2];
                notasPeriodo[0][0][0] = "Matemáticas";
                notasPeriodo[0][0][1] = "4.5";

                notasPeriodo[0][1][0] = "Programación";
                notasPeriodo[0][1][1] = "4.8";

                notasPeriodo[1][0][0] = "Matemáticas";
                notasPeriodo[1][0][1] = "3.8";

                notasPeriodo[1][1][0] = "Programación";
                notasPeriodo[1][1][1] = "4.0";

            // 3. Ubicación en Bodega
                String[][][] ubicacionBodega = new String[2][2][2];
                ubicacionBodega[0][0][0] = "Pasillo A";
                ubicacionBodega[0][0][1] = "Estante 1";

                ubicacionBodega[0][1][0] = "Pasillo B";
                ubicacionBodega[0][1][1] = "Estante 3";

                ubicacionBodega[1][0][0] = "Pasillo C";
                ubicacionBodega[1][0][1] = "Estante 2";

                ubicacionBodega[1][1][0] = "Pasillo D";
                ubicacionBodega[1][1][1] = "Estante 5";
    }
}
