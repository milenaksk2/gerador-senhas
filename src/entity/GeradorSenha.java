package entity;

import java.util.Random;
public class GeradorSenha {

    private int tamanho;

    //construtor
    public GeradorSenha(int tamanho) {
        this.tamanho = tamanho;
    }

    //metodo para gerar a senha
    public String gerarSenha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }
}