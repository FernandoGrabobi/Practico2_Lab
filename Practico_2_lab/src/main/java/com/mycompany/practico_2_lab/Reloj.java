
package com.mycompany.practico_2_lab;
public class Reloj {
    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    // Constructor
    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    // Métodos get
    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    // Método para incrementar el día (cambia al siguiente día)
    public void incrementarDia() {
        switch(dia.toLowerCase()) {
            case "lunes":
                dia = "martes";
                break;
            case "martes":
                dia = "miércoles";
                break;
            case "miércoles":
                dia = "jueves";
                break;
            case "jueves":
                dia = "viernes";
                break;
            case "viernes":
                dia = "sábado";
                break;
            case "sábado":
                dia = "domingo";
                break;
            case "domingo":
                dia = "lunes";
                break;
            default:
                dia = "lunes"; // Valor por defecto
                break;
        }
    }

    // Método para incrementar la hora (cambia la hora en una hora)
    public void incrementarHora() {
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        horas += 1;
        if (horas == 24) {
            horas = 0;
            incrementarDia(); // Si son las 23:00 y se incrementa una hora, cambia el día
        }

        hora = String.format("%02d:%02d", horas, minutos);
    }

    // Método para limpiar la pantalla (simulado)
    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
