import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int primerDado=0,segundoDado=0,tercerDado=0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Ronda "+i);
            primerDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado primer dado "+primerDado);
            segundoDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado segundo dado "+segundoDado);
            tercerDado += aleatorio.nextInt((6-1)+1)+1;
            System.out.println("Acumulado tercer dado "+tercerDado);

        }
        if (primerDado==segundoDado && segundoDado==tercerDado) {
            System.out.println("Todos los dados empataron");
        }
        if (primerDado==segundoDado || segundoDado==tercerDado || primerDado==tercerDado) {
            if(primerDado==segundoDado) {
                System.out.println("Primer dado es igual a segundo dado");
            } else if(segundoDado==tercerDado) {
                System.out.println("Segundo dado es igual a tercer dado");
            }
            else {
                System.out.println("Primer dado es igual a tercer dado");
            }
        }
        if (primerDado>segundoDado || primerDado>tercerDado ) {
            if (primerDado>segundoDado && primerDado>tercerDado){
                System.out.println("Primer dado esta en la 1° posicion");
            }
            else {
                System.out.println("Primer dado esta en la 2° posicion");
            }
        }else if (primerDado<segundoDado && primerDado<tercerDado) {
            System.out.println("Primer dado esta en la 3° posicion");
        }
        if (segundoDado>primerDado || segundoDado>tercerDado ) {
            if (segundoDado>primerDado && segundoDado>tercerDado) {
                System.out.println("Segundo dado esta en la 1° posicion");
            }
            else {
                System.out.println("Segundo dado esta en la 2° posicion");
            }
        }else  if (segundoDado<primerDado && segundoDado<tercerDado) {
            System.out.println("Segundo dado esta en la 3° posicion");
        }
        if (tercerDado>primerDado || tercerDado>segundoDado ) {
            if (tercerDado>primerDado && tercerDado>segundoDado){
                System.out.println("Tercer dado esta en la 1° posicion");
            }
            else {
                System.out.println("Tercer dado esta en la 2° posicion");
            }
        }else if (tercerDado<primerDado && tercerDado<segundoDado){
            System.out.println("Tercer dado esta en la 3° posicion");
        }
    }
}