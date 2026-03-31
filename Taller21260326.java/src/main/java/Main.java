import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        System.out.println("Ingrese " + (n - 1) + " numeros:");
        
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            lista.insertar(num);
        }

        System.out.println("\nLista ingresada:");
        lista.mostrar();

        int faltante = lista.encontrarFaltante(n);

        System.out.println("\nNumero faltante: " + faltante);

        System.out.println("\nTamanio de la lista: " + lista.tamaño());
    }
}