import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion / Fila 1ero despues Columna Siempre!
        int matriz [][] = new int[3][3];


        //Asignacion Manual de Valores
        /*matriz[0][0] = 5;
        matriz[0][1] = 17;
        matriz[0][2] = 88;
        matriz[1][0] = 34;
        matriz[1][1] = 66;
        matriz[1][2] = 105;
        matriz[2][0] = 22;
        matriz[2][1] = 46;
        matriz[2][2] = 26;*/

        //Asignacion por teclado
        Scanner teclado = new Scanner(System.in);//declaro el scanner

        for (int f = 0; f<3; f++){
            for (int c = 0; c<3; c++){
                System.out.println("Ingrese el valor de la posicion f: "+ f + "c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }

        //Recorrido
        for(int f=0; f< 3; f++){
            for(int c=0; c< 3; c++){
                System.out.println("\nEl valor de la posicion f: "+ f + " c: " + c);
                System.out.printf("es de: " + matriz[f][c]);
            }
        }


    }

}