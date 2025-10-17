package conversoesentretipos;

public class ConversoesEntreTIpos {
    public static void main(String[] args){

        int numeroInt = 5;
        double numeroDouble = numeroInt;

        double n1 = 6.0;
        int n2 = (int)n1;

        System.out.println(numeroDouble);
        System.out.println(n2);

        String tipoString = String.valueOf(10);
        int tipoInt = Integer.parseInt("117");
        System.out.println(tipoString);
        System.out.println(tipoInt);


    }
}
