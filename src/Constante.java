public class Constante {

    static final float VALOR_PI = 3.14f;

    public static void main(String[] args) {
        //Valor atribuido na criação e após ser atribuido não pode ser reatribuido, não pode ser criado dentro de um
        //escopo de método apenas no scopo de classe sua criação é a partir das palavras chave "static final"
        // seguido do tipo da constante, nome em caixa alta (conveção) e a inicialização do valor
        // static final float VALO_PI = 3.14f;

        System.out.println("Valor de PI" + VALOR_PI );
    }
}
