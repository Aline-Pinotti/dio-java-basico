public class MinhaClasse {

    public static void main(String[] args) {

        String nome = "Aline";
        String sobrenome = "Pinotti";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);

    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
