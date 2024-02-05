package bootcamp;

import bootcamp.ej1.Ejercicio1;
import bootcamp.ej2.Serie;
import bootcamp.ej2.SerieDouble;
import bootcamp.ej2.SerieInteger;
import bootcamp.supermercado.Cliente;

import java.util.*;

public class Main
{
    public static void main( String[] args )
    {
        ejercicio1();
        ejercicio2();
        supermercado();
    }

    public static void ejercicio1() {
        System.out.println(Arrays.toString(Ejercicio1.burbuja(new int[]{7, 4, 3, 6, 5, 7, 9, 8, 9})));
    }

    public static void ejercicio2() {
        SerieInteger serie2 = new SerieInteger(8, 2);
        mostrarSerie(serie2, 5);
        serie2.establecerValorInicial(30);
        mostrarSerie(serie2, 5);
        serie2.reiniciarSerie();
        mostrarSerie(serie2, 5);

        SerieInteger serie3 = new SerieInteger(8, 3);
        mostrarSerie(serie3, 5);
        serie3.establecerValorInicial(30);
        mostrarSerie(serie3, 5);
        serie3.reiniciarSerie();
        mostrarSerie(serie3, 5);

        SerieDouble serieDouble = new SerieDouble(11.7, 2.5);
        mostrarSerie(serieDouble, 5);
        serieDouble.establecerValorInicial(30.0);
        mostrarSerie(serieDouble, 5);
        serieDouble.reiniciarSerie();
        mostrarSerie(serieDouble, 5);
    }

    public static void mostrarSerie(Serie serie, Integer pasos) {
        System.out.println(serie.getValor());
        for (int i = 0; i < pasos; i++) {
            serie.siguienteNumero();
            System.out.println(serie.getValor());
        }
    }

    public static void supermercado() {
        Cliente cliente1 = new Cliente("41211589", "Renzo", "Jacinto");
        Cliente cliente2 = new Cliente("12345678", "Juan", "Perez");
        Cliente cliente3 = new Cliente("87654321", "Fulano", "De Tal");
        List<Cliente> clientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));

        clientes.forEach(System.out::println);

        clientes.remove(2);
        clientes.forEach(System.out::println);

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("Ingrese el DNI del cliente que quiere buscar: ");
            String dni = scanner.nextLine();

            List<Cliente> clientesConDniPedido = clientes.stream().filter(c -> Objects.equals(c.getDni(), dni)).toList();
            String mensaje = clientesConDniPedido.isEmpty() ? "No se encuentra un usuario con el DNI indicado" : clientesConDniPedido.get(0).toString();
            System.out.println(mensaje);

            System.out.println("Desea continuar? (si/no): ");
            String sigue = scanner.nextLine();
            if (!sigue.equalsIgnoreCase("si")) exit = true;
        }

        System.out.println("Programa finalizado con éxito");

    }

}
