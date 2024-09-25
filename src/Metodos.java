public class Metodos {

    public Metodos(){
        System.out.println("Se creo la clase metodos");
    }

    public int[] burbujaAscendente(int[] arreglo){

        int lengthArray = arreglo.length;

        for (int i = 0; i < lengthArray; i++){
            for (int j = i + 1; j < lengthArray; j++){

                if (arreglo[j] < arreglo[i]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }

            }
        }
        return arreglo;
    }


    public void printArregloAscendente(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
            if (i != arreglo.length){
                System.out.print("-");
            }
        }
    }

    public int[] burbujaDescendente(int[] arreglo2){

        int lengthArray = arreglo2.length;

        for (int i = 0; i < lengthArray; i++){
            for (int j = i + 1; j < lengthArray; j++){

                if (arreglo2[i] < arreglo2[j]){
                    int aux = arreglo2[i];
                    arreglo2[i] = arreglo2[j];
                    arreglo2[j] = aux;
                }

            }
        }
        return arreglo2;
    }

    public void printArregloDescendente(int[] arreglo2){
        for (int elemento : arreglo2){
            System.out.print(elemento);
            if (elemento != arreglo2.length){
                System.out.print("-");
            }
        }
    }

    public String[] burbujaPalabra(String[] palabras){

        int lengthArray = palabras.length;

        for (int i = 0; i < lengthArray; i++){
            for (int j = i + 1; j < lengthArray; j++){

                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0){
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }

            }
        }
        return palabras;
    }

    public void printArregloPalabras(String[] palabras){
        for (String elemento : palabras){
            System.out.print(elemento + " ");
        }
    }
}
