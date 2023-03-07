package programa;

import entity.GeradorSenha;


public class Programa {
    public static void main(String[] args) {
        GeradorSenha gerador = new GeradorSenha(10);
        String senha = gerador.gerarSenha();
        System.out.println("Senha gerada: " + senha);
    }

}
