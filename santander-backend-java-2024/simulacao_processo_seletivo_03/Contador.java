package simulacao_processo_seletivo_03;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmtro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMensagem());
        } finally {
            sc.close();
        }
    }

    public static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int iteracoes = parametroDois - parametroUm;

        for (int i = 0; i < iteracoes; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
