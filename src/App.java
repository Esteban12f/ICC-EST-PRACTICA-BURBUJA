public class App {
    public static void main(String[] args) throws Exception {

        Metodos burbuja = new Metodos();
        
        int [] array = {5,7,30,12,9};

        int[] array2 = burbuja.burbujaAscendente(array);
        burbuja.printArregloAscendente(array2);
        
        System.out.println(" ");

        int[] array3 = burbuja.burbujaDescendente(array);
        burbuja.printArregloDescendente(array3);


        // ORDENAR LAS PALABRAS ALFABETICAMENTE DE LA CADENA DE TEXTO
        String cadeString = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadeString.split(" ");
        String[] palabrasO = burbuja.burbujaPalabra(palabras);
        burbuja.printArregloPalabras(palabrasO);

    }
}
