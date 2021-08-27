public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // ceil --> devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        // floor --> devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        // pow --> Devuelve un numero elevado a otro
        // Recibe el numero y luego la potencia
        System.out.println(Math.pow(x, y));

        // max --> saber cual de esos datos es el mayor
        // Devuelve el numero mayor
        System.out.println(Math.max(x, y));

        // Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo
        // PI * r2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Area de una esfera
        // 4 * PI * R2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
