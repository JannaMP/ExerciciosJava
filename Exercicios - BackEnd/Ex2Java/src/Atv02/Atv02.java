package Atv02;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner receberSenha = new Scanner(System.in); //in eh de input, Scanner eh o recebedor e recebersenha eh a variavel e new eh oq pega

        int senha; // int eh variavel inteiro
        do {
            System.out.println("Digite a senha:");
            senha = receberSenha.nextInt();
            if(senha != 123) ;
            {
                System.out.println("Senha incorreta!");
            }
        }
            while(senha != 123); {
                System.out.println("Senha correta!");
            }
            
    }
}

