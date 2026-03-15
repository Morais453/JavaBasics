package conceitos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 21;
        long cpf = 1234567890L; //número grande
        double altura = 1.82; //número quebrado grande
        float peso = 61.5f; //Menor que o double
        char sexo = 'M'; //1 caracter
        boolean estouComFome =true; //apenas True or False
        String nome ="Morais"; //cadeia de caracteres

        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos e " + altura + " de altura e peso " + peso + "kg");
        if (estouComFome && (sexo == 'M')) {
            System.out.println("Meu CPF é " + cpf + " sou homem e estou com fome");
        }
    }
}
