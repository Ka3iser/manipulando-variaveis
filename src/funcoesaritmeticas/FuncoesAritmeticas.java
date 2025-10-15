package funcoesaritmeticas;

public class FuncoesAritmeticas {
    public static void main(String[] args){

        // +(adição), -(subtração), *(multiplicação), / (divisão)
        int n1 = 10;
        int n2 = 2;

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);

        int soma = n1 + 40;
        System.out.println(soma);

        //operador modulo %
        int resto = 10 % 3;
        System.out.println(resto);

        //classe Math
        double resultadoPow = Math.pow(5.0, 3.0);

        System.out.println(resultadoPow);

        double ResultadoSQRT = Math.sqrt(25.0);
        System.out.println(ResultadoSQRT  );
    }
}
