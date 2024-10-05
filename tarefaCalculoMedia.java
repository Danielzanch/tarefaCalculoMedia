public class tarefaCalculoMedia {
    
    public static void main(String args[]) {
        media();
    }

    public static void media() {
        float num1 = 5.3f;
        float num2 = 8f;
        float num3 = 2f;
        float num4 = 8f;

        float soma = (num1 + num2 + num3 + num4)/4;
        System.out.println(soma);

        boolean isMenorIgual = soma < 5;
        System.out.println("Reprovado: " + isMenorIgual);

        boolean isMaiorIgual = soma >= 5;
        System.out.println("Aprovado: " + isMaiorIgual);
    }
}
