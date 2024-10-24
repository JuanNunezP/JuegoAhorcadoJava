import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String TopSecret = "inteligencia";
        int IntentosMx = 15;
        int Intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasA = new char[TopSecret.length()];

        for (int i = 0; i < letrasA.length; i++) {

            letrasA[i] = '_';

        }

        while (!palabraAdivinada && Intentos < IntentosMx) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasA) + " " + TopSecret.length()+" "+" letras");
            System.out.println("Ingrese una letra por favor");

            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;

            // Recorre la palabra secreta para ver si la letra ingresada es correcta
            for (int i = 0; i < TopSecret.length(); i++) {

                if (TopSecret.charAt(i) == letra) {

                    letrasA[i] = letra;

                    letraCorrecta = true;

                }
            }

            // Si la letra no es correcta, incrementa el número de intentos
            if (!letraCorrecta) {
                Intentos++;
                System.out.println("No le sabes papi: " + (IntentosMx - Intentos) + " intentos restantes.");
            }

            // Verifica si la palabra ha sido adivinada
            if (String.valueOf(letrasA).equals(TopSecret)) {
                palabraAdivinada = true;
                System.out.println("¡Palabra adivinada perro!");
            }
        }

        // Si se agotaron los intentos, muestra mensaje de pérdida
        if (!palabraAdivinada) {
            System.out.println("Perdiste bro");
        }

        sc.close();

    }
}
