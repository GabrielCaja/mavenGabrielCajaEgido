package com.utad.dawe.app;
//Se importa lo necesario de el otro proyecto, en este caso JugadorBalonMano
import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {
    public static void main(String[] args) {
        JugadorBalonMano jugador1 = new JugadorBalonMano("Juan", 10);
        JugadorBalonMano jugador2 = new JugadorBalonMano("Pedro", 12);

        //Simular datos para 10 jornadas
        for (int jornada = 1; jornada <= 10; jornada++) {
            jugador1.setAnotacion(jugador1.getAnotacion() + (int)(Math.random() * 10));
            jugador1.setBloqueo(jugador1.getBloqueo() + (int)(Math.random() * 5));
            jugador1.setTiempoJugado(jugador1.getTiempoJugado() + (int)(Math.random() * 3600));

            jugador2.setAnotacion(jugador2.getAnotacion() + (int)(Math.random() * 10));
            jugador2.setBloqueo(jugador2.getBloqueo() + (int)(Math.random() * 5));
            jugador2.setTiempoJugado(jugador2.getTiempoJugado() + (int)(Math.random() * 3600));
            //Lo mostrara una vez a la quinta jornada y otra a la decima
            if (jornada == 5 || jornada == 10) {
                System.out.println("Estadisticas despues de la jornada " + jornada + ":");
                System.out.println("");
                System.out.println(jugador1);
                System.out.println(jugador2);
            }
        }
    }
}
