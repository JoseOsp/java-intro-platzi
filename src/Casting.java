public class Casting {
    public static void main(String[] args) {

        // En un year ubicar 30 perritos
        // Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // ESTMIACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // EXACTITUD
        int a  = 30;
        int b = 12;
        System.out.println( (double) a/b );


        // Autocasting y casting manual
        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI); // 49

        short nS = (short) n; // chart es mas grande que un short por eso debemos hacer el casting explicito
        System.out.println(nS);
    }
}
