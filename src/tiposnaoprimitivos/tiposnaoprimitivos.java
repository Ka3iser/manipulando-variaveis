package tiposnaoprimitivos;

public class tiposnaoprimitivos {
    public static void main(String[] args){
        
        //tipos primitivos: int, double, char, float, boolean

        int n1 = 18;
        int n2 = n1;

        System.out.println(n1);
        System.out.println(n2);

        n2 = 20;

        System.out.println(n1);
        System.out.println(n2);

        //tipo não primitivo: Integer, Double, Float, Boolean...

        Integer z1 = 12;

        System.out.println(z1.compareTo(11)); // igual = 0, maior = -1, menor = 1
        System.out.println(z1.doubleValue());
    }
}
