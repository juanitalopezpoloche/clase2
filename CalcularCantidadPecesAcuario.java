/*
 * El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi y Louisiana desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. Debido a los altos niveles de nitrógeno y fósforo que traen estas aguas los peces mueren en grandes cantidades.

 * Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces de colores ha decidido poner en cuarentena a 284 peces rojos y 163 peces azules en un gigantesco acuario, para devolverlos al mar cuando estén curados. ¿Cuántos peces hay en total dentro del acuario?
 */
public class CalcularCantidadPecesAcuario {
    public static void main(String[] args) {
        int cantidadPeceseRojos = 284;
        int cantidadPecesAzules = 163;

        System.out.println("En el acuario hay un total de " + (cantidadPeceseRojos + cantidadPecesAzules) + " peces");
    }
}