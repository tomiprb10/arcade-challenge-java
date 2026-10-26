public class ArcadeChallenge {
    public static void main(String[] args) {
        // RETO 1
        System.out.println("\n" + "=== ARCADE CONSOLE ===" + "\n");
        String[] nombres = new String[3];
        nombres[0] = "Tomás Villa";
        nombres[1] = "Clara Cavadia";
        nombres[2] = "Yuliana Vera";

        int[] edades = new int[3];
        edades[0] = 17;
        edades[1] = 24;
        edades[2] = 19;

        int[] puntajeAcumulado = new int[3];
        puntajeAcumulado[0] = 1900;
        puntajeAcumulado[1] = 2600;
        puntajeAcumulado[2] = 2650;

        boolean[] vipSiNo = new boolean[3];
        vipSiNo[0] = false;
        vipSiNo[1] = true;
        vipSiNo[2] = true;

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Jugador " + (i+1) + ": " + nombres[i] + "\n" + "Edad: " + edades[i]
                    + "\n" + "Puntaje acumulado: " + puntajeAcumulado[i] + "\n" + "¿Es VIP?: " + vipSiNo[i] + "\n");
        }


        // RETO 2
        int[][] puntajes = new int[3][3];
        // Puntajes Tomás
        puntajes[0][0] =  700;
        puntajes[0][1] =  600;
        puntajes[0][2] =  600;

        // Puntajes Clara
        puntajes[1][0] = 1000;
        puntajes[1][1] = 900;
        puntajes[1][2] = 700;

        // Puntajes Yuliana
        puntajes[2][0] = 1000;
        puntajes[2][1] = 900;
        puntajes[2][2] = 750;

        System.out.println("=== TABLA DE PUNTUACIONES ===" + "\n");
        System.out.printf("%-15s %-30s %-35s %-40s", "Jugador", "Carrera Extrema", "Invasores Espaciales",
                "Batalla de Robots");
        System.out.println(" ");
        for(int i = 0; i < puntajes.length; i++){
            System.out.printf("%-20s", nombres[i]);
            for(int j = 0; j < puntajes[i].length; j++ ){
                System.out.printf("%-35s",puntajes[i][j]);
            }
                System.out.println("  ");
        }
        System.out.println(" ");

        // RETO 3

        int[][][] campeonato = new int[2][2][3];

        campeonato[0][0][0] = 500;
        campeonato[0][1][0] = 600;

        campeonato[1][0][0] = 500;
        campeonato[1][1][0] = 450;


        campeonato[0][0][1] = 800;
        campeonato[0][1][1] = 900;

        campeonato[1][0][1] = 1100;
        campeonato[1][1][1] = 950;


        campeonato[0][0][2] = 1000;
        campeonato[0][1][2] = 1000;

        campeonato[1][0][2] = 1300;
        campeonato[1][1][2] = 1200;

        System.out.println("=== PUNTUACIONES CAMPEONATO DÍA 1 ===");
        System.out.printf("%-28s %-35s %-30s","Jugador","Ronda 1", "Ronda2");
        System.out.println("   ");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-30s",nombres[i]);
            for(int j = 0; j < 2; j++){
                System.out.printf("%-36s",campeonato[0][j][i]);
            }
            System.out.println(" ");
        }
        System.out.println("  ");

        System.out.println("=== CONSULTAR JUGADOR Y RONDA ESPECÍFICOS ===");

        System.out.println(nombres[2] + ", Día 2, Ronda 1: " + campeonato[1][0][2]);
        System.out.println("  ");

        System.out.println("=== PUNTAJE TOTAL ===");
        System.out.println(nombres[2] + ", Puntuación total: " + (campeonato[0][0][2] + campeonato[0][1][2]
                + campeonato[1][0][2] + campeonato[1][1][2]) + "\n" + "\n");



        // RETO 4

        int sumaPuntosJ1 = puntajes[0][0] + puntajes[0][1] + puntajes[0][2];
        int sumaPuntosJ2 = puntajes[1][0] + puntajes[1][1] + puntajes[1][2];
        int sumaPuntosJ3 = puntajes[2][0] + puntajes[2][1] + puntajes[2][2];

        System.out.println("RETO 4");
        System.out.println("=== PUNTAJE TOTAL POR PARTICIPANTE ===");
        System.out.printf("%-25s %-30s", "Jugador","Puntaje Total");
        System.out.println(" ");
        System.out.printf("%-28s %-30s", nombres[0], sumaPuntosJ1);
        System.out.println(" ");
        System.out.printf("%-28s %-30s", nombres[1], sumaPuntosJ2);
        System.out.println(" ");
        System.out.printf("%-28s %-30s", nombres[2], sumaPuntosJ3 );
        System.out.println("\n" + " ");

        if (sumaPuntosJ1 > sumaPuntosJ2 && sumaPuntosJ1 > sumaPuntosJ3) {
            System.out.println("Felicidades al Jugador 1. " + nombres[0] + " ha sido el campeón.");
        } else if (sumaPuntosJ2 > sumaPuntosJ1 && sumaPuntosJ2 > sumaPuntosJ3) {
            System.out.println("Felicidades a la Jugadora 2. " + nombres[1] + " ha sido la campeona.");
        } else if (sumaPuntosJ3 > sumaPuntosJ1 && sumaPuntosJ3 > sumaPuntosJ2) {
            System.out.println("Felicidades a la Jugadora 3. " + nombres[2] + " ha sido la campeona.");
        } else if (sumaPuntosJ1 == sumaPuntosJ2) {
            System.out.println("Tenemos un empate entre el Jugador 1: " + nombres[0] +  " Y la Jugadora 2: " +
                    nombres[1]);
        } else if (sumaPuntosJ1 == sumaPuntosJ3) {
            System.out.println("Tenemos un empate entre el Jugador 1: " + nombres[0] +  " Y la Jugadora 3: " +
                    nombres[2]);
        } else {
            System.out.println("Tenemos un empate entre la Jugadora 2: " + nombres[1] +  " Y la Jugadora 3: " +
                    nombres[2]);
        }
    }
}
