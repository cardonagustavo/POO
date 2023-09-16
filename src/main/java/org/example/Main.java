package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();

        System.out.println("Por favor, introduzca el nombre del usuario:");
        usuario.setNombres(read.nextLine());

        System.out.println("Por favor, ingrese la dirección de correo electrónico:");
        usuario.setCorreo(read.next());

        System.out.println("Por favor, proporcione el NIT del local:");
        local.setNit(read.next());

        System.out.println("Por favor, indique la fecha de inicio de su evento:");
        oferta.setFechaInicio(read.next());

        System.out.println("Por favor, especifique la fecha de finalización de su evento:");
        oferta.setFechaFin(read.next());

        System.out.println("Por favor, ingrese el costo por persona:");
        oferta.setCostoPersona(read.nextDouble());

        System.out.println("Por favor, ingrese la fecha de la reserva:");
        reserva.setFechaReserva(read.next());

        System.out.println("Por favor, indique la cantidad de personas para la reserva:");
        reserva.setCantidadPersonas(read.nextInt());


    }
}